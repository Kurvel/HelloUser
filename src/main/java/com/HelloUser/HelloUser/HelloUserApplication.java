package com.HelloUser.HelloUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {

	public static Form form = new Form("MemberForm");

	static {
		form.addMember("Kalle", 1, "Karlsson", 42, "kalle@gmail.com");
		form.addMember("Anna", 2, "Andersson", 78, "anna@gmail.com");
		form.addMember("Göran", 3, "Tallbarr", 24, "goran@gmail.com");
		form.addMember("Ingrid", 4, "Danielsson", 104, "ingrid@gmail.com");
		
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
	}

}
