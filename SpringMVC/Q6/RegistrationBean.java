package com.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegistrationBean {

  @NotNull
  @Size(min = 8, max = 20, message = "You can't leave this empty.")
  @Pattern(regexp = "^[A-Za-z0-9]", message = "Invalid username")
  private String username;

  @NotNull
  @Size(min = 8, max = 20, message = "You can't leave this empty.")
  @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", message = "Invalid password")
  private String password;

  @NotNull
  @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", message = "Invalid email")
  private String email;

  @NotNull
  @Min(18)
  @Pattern(regexp = "^[0-9]", message = "Invalid contact")
  private String contact;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
} 
  
  

}