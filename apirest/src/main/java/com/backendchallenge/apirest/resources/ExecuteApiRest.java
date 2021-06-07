package com.backendchallenge.apirest.resources;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendchallenge.apirest.models.User;

@Service
@RestController
@RequestMapping(value = "/api")
public class ExecuteApiRest {
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
