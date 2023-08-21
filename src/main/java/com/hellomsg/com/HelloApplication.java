package com.hellomsg.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hellomsg.com.DynamodbConnection;

@SpringBootApplication
@RestController
public class HelloApplication {

	@GetMapping("/getmsg")
	public String getMsg()
	{
		 
		DynamodbConnection db=new DynamodbConnection();
		
		db.makeDBCall();
		return "Hello Aws !!!!!  this is for testing";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
