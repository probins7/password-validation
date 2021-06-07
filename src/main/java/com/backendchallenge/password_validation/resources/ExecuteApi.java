package com.backendchallenge.password_validation.resources;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendchallenge.password_validation.models.User;

@Service
@RestController
@RequestMapping(value = "/api")
public class ExecuteApi {
	@PostMapping("/login")
	public boolean Logon(@RequestBody User user) {

		boolean result = false;
		try {
			if (user != null) {
				result = ValidateLogon.validation(user);
			}
		} catch (Exception ex) {
			result = false;
		}
		return result;
	}
}
