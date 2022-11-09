package no.hvl.fest.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import no.hvl.fest.util.loginUtil;
import no.hvl.fest.util.passordUtil;
import no.hvl.fest.util.registreringService;


@Controller
@RequestMapping("${app.url.login}")
public class loginController {
    
    @Value("${app.url.login}") private String LOGIN_URL;
    @Value("${app.timeout}") private int MAX_INTERACTIVE_INTERVAL;
    @Value("${app.url.deltagere}") private String DELTAGERE_URL;

    @Autowired private registreringService regServ;

    @GetMapping
    public String getPamelding(){
        return LOGIN_URL;
    }

    @PostMapping
    public String loggInn(@RequestParam() String mobnr, 
                          @RequestParam() String password,
                          HttpServletRequest request){

        if(regServ.finnAlleRegistreringer().contains(regServ.finnMedNr(mobnr))){
            System.out.println("kom hit 1");
            if(passordUtil.validerMedSalt(password, regServ.finnMedNr(mobnr).getPassword())){
                System.out.println("kom hit 2");
                loginUtil lutil = new loginUtil();
                lutil.loggInnBruker(request, MAX_INTERACTIVE_INTERVAL, regServ);
                return "redirect:" + DELTAGERE_URL;
            }
        }

        return "redirect:" + LOGIN_URL;
    }

}
