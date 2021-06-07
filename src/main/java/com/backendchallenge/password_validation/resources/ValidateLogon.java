package com.backendchallenge.password_validation.resources;

import com.backendchallenge.password_validation.models.User;

public class ValidateLogon {

	public static boolean validation(User user) {
		boolean result = false;
		try {
			if (user != null) {
				String Tot_Char = "(?=.{9,})";
				String Rep_Char = "(?:([A-Za-z0-9-!@#$%^&*()\\-+])(?!.*\\1))*$";
				String Upp_Case = "(?!=.*[A-Z])";
				String Low_Case = "(?!=.*[a-z])";
				String One_Digt = "(?!=.*[0-9])";
				String Spe_Char = "(?!=.*[!@#$%^&*()\\-+])";
				String No_Spac = "(?!=\\S+$)";

				String Pattern = "^" + Tot_Char + Rep_Char + Upp_Case + Low_Case + One_Digt + Spe_Char + No_Spac;
				result = user.getPassword().matches(Pattern);
			}
		} catch (Exception ex) {
			result = false;

		}
		return result;
	}
}