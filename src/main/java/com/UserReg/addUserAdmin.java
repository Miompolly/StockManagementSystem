package com.UserReg;

public class addUserAdmin {
String names,email,password,role;

public addUserAdmin() {
	super();
}

public addUserAdmin(String names, String email, String password, String role) {
	super();
	this.names = names;
	this.email = email;
	this.password = password;
	this.role = role;
}

public String getNames() {
	return names;
}

public void setNames(String names) {
	this.names = names;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}
}
