package spring.person.web;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.person.service.PersonService;

@Controller
public class PersonController {	
	@Resource
	PersonService personService;

	@RequestMapping	
	public @ResponseBody String getPerson() {
		return "Person : " + personService.findOne(1).toString();
	}
	
	@RequestMapping("hello")
	public String hello(Model model) {		
		model.addAttribute("time", new Date());
		return "hello";
	}
}
