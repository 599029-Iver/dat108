package no.hvl.fest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.fest.model.registrering;
import no.hvl.fest.util.loginUtil;
import no.hvl.fest.util.regSjekk;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("${app.url.pamelding}")
public class pameldingController {

    @Value("${app.url.pamelding}") private String PAMELDING_URL;
    @Value("${app.url.pameldt}") private String PAMELDT_URL;
    @Value("${app.timeout}") private int MAX_INTERACTIVE_INTERVAL;

    

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
                                     @RequestParam() String kjonn,
                                     HttpServletRequest request) {
        
        registrering nyReg = new registrering(fornavn, etternavn, mobnr, password,/*  passwordRepeat, */kjonn);
        System.out.println(nyReg.toString());

        regSjekk erGylig = new regSjekk();
        loginUtil lutil = new loginUtil();

        if(erGylig.gyldig(nyReg)){

            // her bor vi logge inn >?
            lutil.loggInnBruker(request, MAX_INTERACTIVE_INTERVAL);

            HttpSession session = request.getSession();
            session.setAttribute("registrering", nyReg);
            return "redirect:" + PAMELDT_URL;
        }

        
        return null;
    }
    

}
