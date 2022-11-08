package no.hvl.fest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import no.hvl.fest.util.loginUtil;
import no.hvl.fest.util.registreringService;


@Controller
@RequestMapping("${app.url.deltagere}")
public class deltagereController {

    @Value("${app.url.deltagere}") private String DELTAGERE_URL;
    
    
    @GetMapping
    public String getPamelding(HttpSession session){
        loginUtil lutil = new loginUtil();

        if(lutil.erBrukerInnlogget(session)){
            return DELTAGERE_URL;
        }


        return DELTAGERE_URL;//Endre meg til logincontroller url
    }
    
    
}
