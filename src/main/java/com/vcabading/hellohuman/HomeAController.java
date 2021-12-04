package com.vcabading.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeAController {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
}
