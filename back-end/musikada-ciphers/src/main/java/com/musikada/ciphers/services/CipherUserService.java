package com.musikada.ciphers.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.musikada.ciphers.entities.Cipher;
import com.musikada.ciphers.entities.User;

@Service
public class CipherUserService {
	@Value("${musikada-user}")
	private String musikadaUserHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Cipher getCipherByUserId(Long userId) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", userId.toString());
		User user = restTemplate.getForObject(musikadaUserHost+"/users/{id}", User.class, uriVariables);
		System.out.println(user.getFirstName()+" "+user.getEmail());
		return new Cipher("Tu és a mulher", "D E");
	}
}
