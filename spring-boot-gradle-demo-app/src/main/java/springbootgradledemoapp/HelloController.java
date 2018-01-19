package springbootgradledemoapp;

/**
 * Tutorial – Spring Boot Application Development Using STS
 * https://www.quickprogrammingtips.com/spring-boot/tutorial-spring-boot-application-development-using-sts.html
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

class Greeting{
	String greeting;
	Greeting(String g){
		greeting = g;
	}
	public String getGreeting() {
		return greeting;
	}
}

@Controller
public class HelloController {
	@RequestMapping(value="/",produces = "application/json")
	@ResponseBody
	Object home() {
		return new Greeting("Hello Greeting!");
	}
}
