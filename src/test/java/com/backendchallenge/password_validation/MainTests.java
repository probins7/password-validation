package com.backendchallenge.password_validation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainTests {
	
	@Autowired
	Password_ValidationApplication start;
	
	@Test
	public void main() {
		start.main(new String[] {});
	   }
	}
		

