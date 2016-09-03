package fi.haaga.helia.shan.web;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fi.haaga.helia.shan.web.Name;

@Controller
public class FriendListController {
	
	public ArrayList<Name> nameObjects; 
	FriendListController()
	{
		nameObjects = new ArrayList<Name>();
		
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
    public String greeting(Model model) {
		Name nameObject = new Name();
		model.addAttribute("nameObject", nameObject);
		model.addAttribute("nameObjects",nameObjects);
        return "index";
	}
	
	//@PostMapping("/index")
	@RequestMapping (value="/index", method=RequestMethod.POST)
	public String submit(@Valid Name nameObject, Model model){			
		nameObjects.add(nameObject);
		model.addAttribute("nameObjects", nameObjects);
		Name newNameObject = new Name();
		model.addAttribute("nameObject", newNameObject);
		return "index";
		
	}
	
}
