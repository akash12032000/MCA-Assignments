package com.mca.student.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mca.student.Bean.Guest;
import com.mca.student.Service.GuestServiceInterface;

@Controller
public class HomeController {
	
	@Autowired
	private GuestServiceInterface service;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response,Model model) throws IOException{
		model.addAttribute("Guest", new Guest());
		return new ModelAndView("home","time",new SimpleDateFormat("hh:mm:ss").format(new Date()));
	}
	
	@RequestMapping(value = "SaveUser")
	public String saveUser(@ModelAttribute("Guest")Guest guest,Model model){
		System.out.println(guest.toString());
		try {
		service.SaveUser(guest);
		model.addAttribute("msg", "User Successfullty Save");
		}catch (Exception e) {
			model.addAttribute("msg", "Something Went Wrong");
		}
		return "Save";
	}
	
}
