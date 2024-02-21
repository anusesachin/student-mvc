package com.spti.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spti.dto.login.LoginRequestDto;

@Controller
public class LoginController {

	@GetMapping( "login" )
	public String login() {
		return "login";
	}

	@PostMapping( "/login-user" )
	public String loginUser( @ModelAttribute LoginRequestDto loginDto, Model model, HttpSession session ) {
		return "common/home";
	}
}
