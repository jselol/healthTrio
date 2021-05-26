package com.healthtrio.demo;

import com.healthtrio.demo.Region.Region;
import com.healthtrio.demo.controllers.BootRestController;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.io.IOException;


@ComponentScan(basePackageClasses=BootRestController.class, basePackages={"com.healthtrio.demo"})
@SpringBootApplication
public class RestApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}

