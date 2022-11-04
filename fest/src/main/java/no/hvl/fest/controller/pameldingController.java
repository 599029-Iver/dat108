package no.hvl.fest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import no.hvl.fest.model.registrering;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("${app.url.pamelding}")
public class pameldingController {

    @Value("${app.url.pamelding}") private String PAMELDING_URL;

    @GetMapping
    public String getPamelding(){
        return PAMELDING_URL;
    }

    @PostMapping()
    public String registrerPamelding(@RequestParam() String fornavn, 
                                     @RequestParam() String etternavn,
                                     @RequestParam() String mobnr, 
                                     @RequestParam() String password,
                                     @RequestParam() String passwordRepeat,
                                     @RequestParam() String kjonn) {
        
        registrering nyReg = new registrering(fornavn, etternavn, mobnr, password, passwordRepeat, kjonn);
        System.out.println(nyReg.toString());

        
        return null;
    }
    

}
