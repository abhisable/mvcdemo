package com.mvcp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MomController {

	@GetMapping("/cafe")
	public String getSugar(Model model) {
		String title = "welcome to mom's cafe";
		model.addAttribute("title", title);
		return "mom-cafe";
	}

	@GetMapping("/processItem")
	public String getOrder(HttpServletRequest request, Model model) {

		String title = "welcome to Orders page";
		String dishname = request.getParameter("item-name");

		model.addAttribute("title", title);
		model.addAttribute("dishname", dishname);

		return "order-success";
	}

}
