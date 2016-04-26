package main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
    	RestTemplate restTemplate = new RestTemplate();
        String timeAsString = restTemplate.getForObject("http://192.168.99.100:9090/timereact", String.class);
    	
    	return "Hello from hell at: " + timeAsString;
    }
}
