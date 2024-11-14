package com.example.vnxlabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lien-he")
public class LienHeController {
@GetMapping("")
    public String lienHe(){
      return "/menu/lienhe";
    }
}
