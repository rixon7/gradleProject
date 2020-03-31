package net.facebook.config;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;

import net.facebook.springconfig.Application;
import net.facebook.uielements.faceuielement;
import net.thucydides.core.annotations.Managed;

@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration

public class EmsConfig {
	
	@Autowired
	public Environment env;
		
	@Managed 
	public WebDriver driver;		
	
	public faceuielement facebookpage = new faceuielement();
	
	
	
	
	
	
	
	  
	  }
	
