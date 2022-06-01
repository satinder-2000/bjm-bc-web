package bjm.bc.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import bjm.bc.model.RevenueParty;
import bjm.bc.repository.RevenuePartyRepository;


@Controller
public class RevenuePartyController {
	
	private static Logger LOGGER = Logger.getLogger(RevenuePartyController.class.getName());
	
	@Autowired
	RevenuePartyRepository revenuePartyRepository;
	
	
	
	@PostMapping("/revenuePartyRegister")
	public String greetingSubmit(@ModelAttribute RevenueParty revenueParty, Model model) {
	    model.addAttribute("revenueParty", revenueParty);
	    revenueParty = revenuePartyRepository.save(revenueParty);
	    revenuePartyRepository.flush();
	    LOGGER.info("Revenue Party created wtih id: "+ revenueParty.getId());
	    return "result";
	}

}
