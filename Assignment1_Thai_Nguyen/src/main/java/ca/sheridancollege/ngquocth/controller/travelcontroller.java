package ca.sheridancollege.ngquocth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ca.sheridancollege.ngquocth.beans.Ticket;
import ca.sheridancollege.ngquocth.database.TicketDatabase;


@Controller
public class travelcontroller {
	
	@GetMapping ("/")
	public String root() {
		return "home.html";
	}
	
	
	@GetMapping ("/goAdd")
	public String goAdd (Model model) {
		model.addAttribute("ticketobject", new Ticket());
		return "register.html"; 
	}
	
	@PostMapping ("/goAdd") 
	public String addTicket (@ModelAttribute Ticket t) {
		TicketDatabase.ticketList.add(t);
		
		return "redirect:/goAdd";
	}
	

	
	@GetMapping("/display")
	public String displayTicket(Model model) {  
		model.addAttribute("viewticket",TicketDatabase.ticketList);
		return "display.html";
	}
	

	
	
	
}
