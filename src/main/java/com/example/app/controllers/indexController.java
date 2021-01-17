package com.example.app.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.controllers.forms.IndexForm;

@SpringBootApplication
@ Controller
public class indexController {

    public static void main(String[] args) {
        SpringApplication.run(indexController.class, args);
    }

	@RequestMapping(value = "/" )
	public String init(Model model) {

		model.addAttribute("test", new IndexForm());

    	return  "/index.html";
	}


}
