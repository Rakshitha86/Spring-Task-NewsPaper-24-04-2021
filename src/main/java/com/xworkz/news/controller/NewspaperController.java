package com.xworkz.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.news.dto.NewspaperDTO;
import com.xworkz.news.service.NewspaperService;

@Component
@RequestMapping("/")
public class NewspaperController {

	@Autowired
	private NewspaperService newspaperService;

	public NewspaperController() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created ");
	}
	@RequestMapping("/newspaper.do")
	public String onclick(@ModelAttribute NewspaperDTO dto,Model model) {
		System.out.println(dto);
		if(this.newspaperService.saveAndValidate(dto)) {
			model.addAttribute("message","thank you for registering");
		}
		model.addAttribute("message", "enter valid data");
		return "/Success.jsp";
	}

}
