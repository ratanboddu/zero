package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Example3Controller {

	@RequestMapping("/example3.do")
	/*here we are specifying our dependency so now spring will create an object of Map class 
	 * and pass its reference to doSomething method*/
	public String doSomething(Map model) {
		model.put("message", "Welcome to Spring MVC");
		return "example1";
	}
}
