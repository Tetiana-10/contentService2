package main.java.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String returnContent() {
		return "Service Packs for fast and efficient chassis and steering repairs\r\n" + 
				"Expansion of the range of Lemförder Service Packs\r\n" + 
				"Cost-effective and efficient repair thanks to comprehensive assembly accessories\r\n" + 
				"ZF Aftermarket's brand Lemförder offers garages with its Service Packs significantly less complicated steering and chassis repairs. The vehicle-specific mounting kits can be ordered in addition to the respective main component and then include all parts required for the repair. ZF Aftermarket currently offers 120 service packs with original quality spare parts for 830 vehicle models. A further 14 service packs will be available from dealers by the middle of the year.";
	}
}