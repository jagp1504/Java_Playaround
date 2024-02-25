package ca.devops.jenkins.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsCiCd {
	
	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name){
		
		return "Hello" + name;
		
	}
	

}
