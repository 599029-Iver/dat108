package no.hvl.fest.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import no.hvl.fest.util.loginUtil;


@Controller
@RequestMapping("${app.url.pameldt}")
public class pameldtController {
    
    @Value("${app.url.pameldt}") private String PAMELDT_URL;
    @Value("${app.url.login}") private String LOGIN_URL;


    
    @GetMapping
    public String getPamelding(HttpSession session){
        loginUtil lutil = new loginUtil();

        if(lutil.erBrukerInnlogget(session)){
            return PAMELDT_URL;
        }
        return LOGIN_URL;
    }

    
}
