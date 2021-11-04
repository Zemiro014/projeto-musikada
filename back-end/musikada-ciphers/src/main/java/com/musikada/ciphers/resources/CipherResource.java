package com.musikada.ciphers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musikada.ciphers.entities.Cipher;
import com.musikada.ciphers.services.CipherUserService;

@RestController
@RequestMapping(value = "/ciphers")
public class CipherResource {

	@Autowired
	private CipherUserService service;
	
	@GetMapping(value = "/{userId}")
	public ResponseEntity<Cipher> getCipherByUser(@PathVariable("userId") Long userId){
		Cipher cipher = service.getCipherByUserId(userId);
		return ResponseEntity.ok(cipher);
	}
}
