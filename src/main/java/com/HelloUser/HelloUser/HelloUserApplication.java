package com.HelloUser.HelloUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {

	public static Form form = new Form("MemberForm");

	static {
		form.addMember("Kalle Karlsson", 1);
		form.addMember("Anna Andersson", 2);
		form.addMember("Göran Tallbarr", 3);
		form.addMember("Ingrid Danielsson", 4);
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
	}

}
