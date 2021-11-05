package com.musikada.ciphers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musikada.ciphers.cipherfeigningclients.CipherFeignClient;
import com.musikada.ciphers.entities.Cipher;
import com.musikada.ciphers.entities.User;

@Service
public class CipherUserService {
	
	@Autowired
	private CipherFeignClient cipherFeignClient;

	public Cipher getCipherByUserId(Long userId) {
		User user = cipherFeignClient.findById(userId).getBody();
		System.err.println("Dados retornados: "+user.getFirstName()+" "+user.getEmail());
		return new Cipher("Tu és a mulher", "D E");
	}
}
