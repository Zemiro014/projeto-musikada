package com.musikada.ciphers.services;

import org.springframework.stereotype.Service;

import com.musikada.ciphers.entities.Cipher;

@Service
public class CipherUserService {

	public Cipher getCipherByUserId(Long userId) {
		return new Cipher("Tu és a mulher", "D E");
	}
}
