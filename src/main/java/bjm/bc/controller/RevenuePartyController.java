package bjm.bc.controller;

//import java.time.LocalDate;
//import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import bjm.bc.model.RevenueParty;
import bjm.bc.service.RevenuePartyService;

@Controller
public class RevenuePartyController {

	//private static Logger LOGGER = Logger.getLogger(RevenuePartyController.class.getName());
	
	@Autowired
	private RevenuePartyService revenuePartyService;

	@GetMapping("/revenueParty")
	public String revenuePartyRegisterForm(Model model) {
		model.addAttribute("revenueParty", new RevenueParty());
		return "revenueParty";

	}

	@PostMapping("/revenueParty")
	public String revenuePartySubmit(@ModelAttribute RevenueParty revenueParty, Model model) {
		//LOGGER.warning("Temporary code for revenueParty.setMemorableDate(LocalDate.now());" );
		//revenueParty.setMemorableDate(LocalDate.now());
		//LOGGER.warning("Temporary code for revenueParty.setMemorableDate(LocalDate.now());" );
		revenueParty = revenuePartyService.createRevenueParty(revenueParty);
		model.addAttribute("revenueParty", revenueParty);
		return "revenuePartyConfirm";
	}
	
	@GetMapping("/revenuePartyAmend")
	public String revenuePartyAmend(Model model, @RequestParam Long partyId) {
		RevenueParty revenueParty = revenuePartyService.findRevenuePartyById(partyId);
		model.addAttribute("revenueParty", revenueParty);
		return "revenuePartyAmend";
	}
	
	@PostMapping("/revenuePartyAmend")
	public String revenuePartyAmendSubmit(@ModelAttribute RevenueParty revenueParty, Model model) {
		//LOGGER.warning("Temporary code for revenueParty.setMemorableDate(LocalDate.now());" );
		//revenueParty.setMemorableDate(LocalDate.now());
		//LOGGER.warning("Temporary code for revenueParty.setMemorableDate(LocalDate.now());" );
		RevenueParty revenuePartydB = revenuePartyService.findRevenuePartyById(revenueParty.getId());
		/*revenuePartydB.setName(null);
		revenuePartydB.setEmail(null);
		revenuePartydB.setMemorableDateStr(null);
		revenuePartydB.setMemorableDate(null);
		revenuePartydB.setOrganisation(null);
		revenuePartydB.setOwnerAdhaarNumber(null);
		revenuePartydB.setPassword(null);
		revenuePartydB.setRevenueType(null);
		revenuePartydB.setAccountHash(null);*/
		revenuePartydB.setName(revenueParty.getName());
		revenuePartydB.setEmail(revenueParty.getEmail());
		revenuePartydB.setMemorableDateStr(revenueParty.getMemorableDateStr());
		//revenuePartydB.setMemorableDate(revenueParty.);
		revenuePartydB.setOrganisation(revenueParty.getOrganisation());
		revenuePartydB.setOwnerAdhaarNumber(revenueParty.getOwnerAdhaarNumber());
		revenuePartydB.setPassword(revenueParty.getPassword());
		revenuePartydB.setRevenueType(revenueParty.getRevenueType());
		//revenuePartydB.setAccountHash(null);
		
		revenuePartyService.updateRevenueParty(revenuePartydB);
		model.addAttribute("revenueParty", revenuePartydB);
		return "revenuePartyConfirm";
	}

}
