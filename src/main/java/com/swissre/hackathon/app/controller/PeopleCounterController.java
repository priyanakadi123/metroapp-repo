package com.swissre.hackathon.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swissre.hackathon.app.model.PeopleCounterRequest;
import com.swissre.hackathon.app.service.MetroService;


@RestController
public class PeopleCounterController {

    @Autowired
    MetroService metroService;
	
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String fetchRoutes(){
    	//List<Route> list= metroService.retrieveRoutesDb();
    System.out.println("Call from Python");
    	return "list-routes";
    	
    }
    

    @RequestMapping(value = "/updateCounter", method = RequestMethod.POST)
    public ResponseEntity < String > persistPerson(@RequestBody PeopleCounterRequest peopleCounter) {
     System.out.println("People Detected :"+peopleCounter.getPeoplePresent());
    //	System.out.println("Update Counter");
    	metroService.updateFreeSeats(peopleCounter);
     return ResponseEntity.status(HttpStatus.CREATED).build();
        
    }
}
