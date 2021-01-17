package com.example.app.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.controllers.forms.IndexForm;

@SpringBootApplication
public class indexController {

	@RequestMapping(value = "/sp-g-st" )
	public String init(Model model) {

		model.addAttribute("test", new IndexForm());

    	return  "/index.html";
	}

}
