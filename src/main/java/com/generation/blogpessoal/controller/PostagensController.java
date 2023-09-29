package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagens;
import com.generation.blogpessoal.repository.PostagensRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*" , allowedHeaders = "*")

public class PostagensController {
	 
	@Autowired
	private PostagensRepository postagensRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagens>> getAll(){
		return ResponseEntity.ok(postagensRepository.findAll());
	}
}