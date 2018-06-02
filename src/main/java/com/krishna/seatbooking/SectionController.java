package com.krishna.seatbooking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krishna.seatbooking.repository.SectionRepository;

import lombok.val;

@CrossOrigin
@Controller
public class SectionController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SectionRepository sectionsRepository;

    @RequestMapping("/")
    public String home(Model model) {
    	val x = sectionsRepository.findAll();
    	model.addAttribute("sections", x);
    	
        return "home";
    }
}