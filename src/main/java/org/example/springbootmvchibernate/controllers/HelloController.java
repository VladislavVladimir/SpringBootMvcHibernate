package org.example.springbootmvchibernate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Выполняю задание 3.1.1!");
		messages.add("Мое первое Spring Boot приложение");
		messages.add("Версия 1.0 SNAPSHOT");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}