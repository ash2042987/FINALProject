package com.FINALAPP.ProjectMVN;

import java.security.Signature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCrypt;



@ComponentScan("com.FINALAPP.ProjectMVN")
@EnableAutoConfiguration 
@SpringBootApplication
public class App 
{


	public static void main( String[] args )
    {
		
	
		
		
		String password = "root";
		
		String hash= BCrypt.hashpw(password, BCrypt.gensalt());
		
		System.out.println(hash);
		
		System.out.println(BCrypt.checkpw("root2", hash));

    	SpringApplication.run(App.class, args);
    }
	
				
}





