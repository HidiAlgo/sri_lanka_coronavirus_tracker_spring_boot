package com.programcounter.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.programcounter.service.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	private CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String getHome(Model model) {
		int totalNumber = coronaVirusDataService.getAllStats().stream().mapToInt(stat -> stat.getTotalCases()).sum();
		int totalNewCases = coronaVirusDataService.getAllStats().stream().mapToInt(stat -> stat.getDiff()).sum(); 
		
		model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
		model.addAttribute("totalNumber",totalNumber);
		model.addAttribute("totalNewCases",totalNewCases);
		return "home";
	}
	
}
