package com.tp.tp5.controller;


import com.tp.tp5.model.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formulaireController {
    @Autowired
    AdresseRepository addressRepository ;
    @GetMapping("/formulaire")
    public String showAddresses ( Model model ) {
        model . addAttribute ("allAddresses",
                addressRepository . findAll () ) ;
        return "formulaire";
    }
}
