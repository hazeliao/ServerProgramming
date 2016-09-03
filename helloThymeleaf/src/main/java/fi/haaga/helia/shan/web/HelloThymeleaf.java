package fi.haaga.helia.shan.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestBody

public class HelloThymeleaf {
	
	/*@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(@RequestParam(name="name") String name, @RequestParam(name="age") int age){
		if (age >= 18){
		return "Welcome " + name + "!";
		}
		else {
			return "You are too young!";
		}
		*/
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String greeting(@RequestParam(name="name") String name, @RequestParam(name="age") int age, Model model) {
		model.addAttribute("name",name);
		model.addAttribute("age",age);
        return "hello";
}
}
