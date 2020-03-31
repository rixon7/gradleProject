package net.facebook.springconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@EnableAutoConfiguration

@PropertySource("classpath:common.properties")
@PropertySource("classpath:o2.properties")
@PropertySource("classpath:${test_environment}")
@ComponentScan("net.creativity")

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testEnv = System.getProperty("test_environment");
		System.out.println(testEnv);
		SpringApplication.run(Application.class, args);
	}

}
