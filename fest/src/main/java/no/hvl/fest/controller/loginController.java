package no.hvl.fest.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

        //sjekker om brukeren finnes
        if(regServ.finnAlleRegistreringer().contains(regServ.finnMedNr(mobnr))){

            //
            if(passordUtil.validerMedSalt(password, regServ.finnMedNr(mobnr).getPassword())){

                loginUtil lutil = new loginUtil();
                lutil.loggInnBruker(request, MAX_INTERACTIVE_INTERVAL, regServ);

                HttpSession session = request.getSession();
                session.setAttribute("registrering", regServ.finnMedNr(mobnr));
                return "redirect:" + DELTAGERE_URL;
            }
        }

        return "redirect:" + LOGIN_URL;
    }

}
