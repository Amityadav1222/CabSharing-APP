package com.carride.bikeride;

import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BikerideApplication {

	public static void main(String[] args) {

		System.out.println("running");
		SpringApplication.run(BikerideApplication.class, args);
	}

}
