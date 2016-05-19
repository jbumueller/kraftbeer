package main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @RequestMapping("/malt")
    public int getMalt(){
    	return 5;
    }
    
    @RequestMapping("/hop")
    public int getHop(){
    	return 13;
    }
    
    @RequestMapping("/water")
    public int getWater(){
    	return 1000;
    }
}

