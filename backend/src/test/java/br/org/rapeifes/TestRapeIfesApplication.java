package br.org.rapeifes;

import org.springframework.boot.SpringApplication;

public class TestRapeIfesApplication {

	public static void main(String[] args) {
		SpringApplication.from(RapeIfesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
