package fi.haaga.helia.shan.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fi.haaga.helia.shan.domain.Student;

@Controller
public class handlingListsController {	
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String greeting(@ModelAttribute Student student, Model model) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student student1 = new Student("Kate", "Cole");	
		students.add(student1);
		Student student2 = new Student("Dan", "Brown");
		students.add(student2);
		Student student3 = new Student("Mike", "Mars");
		students.add(student3);
		model.addAttribute("students",students);
        return "hello";
}
	
}
