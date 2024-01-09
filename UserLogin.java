
package com.learnspring.learnspring;  

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;  

@RestController 

public class HelloWorldController {      

	@GetMapping("/hello")     

	public String showHelloWorldController() {         

	
		
		
		return "hello spring boot";     } 
}
