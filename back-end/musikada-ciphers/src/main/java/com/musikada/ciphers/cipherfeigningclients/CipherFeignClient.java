package com.musikada.ciphers.cipherfeigningclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.musikada.ciphers.entities.User;

@Component
@FeignClient(name = "musikada-user", url = "localhost:8001", path = "/users")
public interface CipherFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<User> findById(@PathVariable Long id);
}