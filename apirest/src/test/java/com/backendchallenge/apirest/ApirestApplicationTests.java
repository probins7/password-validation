package com.backendchallenge.apirest;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.backendchallenge.apirest.models.User;
import com.backendchallenge.apirest.resources.ExecuteApiRest;

@SpringBootTest
class ApirestApplicationTests {

	@Autowired
	ExecuteApiRest executeApiRest;

	@Test
	public void LogonTestFalse() {

		ArrayList<String> listPassword = new ArrayList<String>();

		listPassword.add("  ");
		listPassword.add("aa");
		listPassword.add("ab");
		listPassword.add("AAAbbbCc");
		listPassword.add("AbTp9!foo");
		listPassword.add("AbTp9!foA");
		listPassword.add("AbTp9 fok");
		listPassword.add("HbMp9-lok-");

		int n = listPassword.size();

		for (int i = 0; i < n; i++) {
			User user = new User();
			user.setPassword(listPassword.get(i).toString());
			boolean result = executeApiRest.Logon(user);

			Assertions.assertEquals(result, false);
		}
	}

	@Test
	public void LogonTestTrue() {

		ArrayList<String> listPassword = new ArrayList<String>();

		listPassword.add("AbTp9!gak");
		listPassword.add("AbTp9@hek");
		listPassword.add("BbTp9#fik");
		listPassword.add("CbTp9$iok");
		listPassword.add("DbTp9%juk");
		listPassword.add("EbTp9&lok");
		listPassword.add("FbTp9*mok");
		listPassword.add("GbTp9(nok");
		listPassword.add("HbJp9)zok");
		listPassword.add("Hb^p9!uok");
		listPassword.add("HaFp9-qok");

		int n = listPassword.size();

		for (int i = 0; i < n; i++) {
			User user = new User();
			user.setPassword(listPassword.get(i).toString());
			boolean result = executeApiRest.Logon(user);

			Assertions.assertEquals(result, true);
		}
	}
}
