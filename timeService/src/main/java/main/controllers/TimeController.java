package main.controllers;

import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
	@RequestMapping("/time")
	public String getTime() {
		return DateTime.now().toString();
	}
}
