package no.hvl.fest.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("${app.url.pameldt}")
public class pameldtController {
    
    @Value("${app.url.pameldt}") private String PAMELDT_URL;


    
    @GetMapping
    public String getPamelding(){
        return PAMELDT_URL;
    }

    
}
