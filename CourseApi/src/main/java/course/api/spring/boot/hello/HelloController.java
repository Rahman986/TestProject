package course.api.spring.boot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/rahman")
	public String sayHi() {
		return "Hi";
		
	}
}
