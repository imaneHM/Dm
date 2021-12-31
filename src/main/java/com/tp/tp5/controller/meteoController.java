package com.tp.tp5.controller;


import com.tp.tp5.model.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class meteoController {


    @PostMapping("/meteo")
    public String getMeteo(@RequestParam("address") String address){
        String in=address;
        return "meteo";
    }
    @GetMapping("/meteo")
    public String getEtableMeteo ( Model model ) {
        return "meteo";
    }
}
