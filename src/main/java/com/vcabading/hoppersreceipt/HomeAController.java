package com.vcabading.hoppersreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeAController {

	@GetMapping("/")
    public String index(Model model) {
        
		//	//// Initialize Variables ///////////////////////////
        String name = "Dwayne Johnson";
        String itemName = "Hot Sauce";
        double price = 6.789;
        String description = "Can you smelllllllll what the Rock's cooking?";
        String vendor = "You Know";
        
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
        
		return "index.jsp";
	}
}
