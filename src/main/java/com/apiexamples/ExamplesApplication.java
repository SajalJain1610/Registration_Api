package com.apiexamples;

//import org.hibernate.engine.jdbc.mutation.group.PreparedStatementGroup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ExamplesApplication {

	public static void main(String[] args) {SpringApplication.run(ExamplesApplication.class, args);

	}

}
