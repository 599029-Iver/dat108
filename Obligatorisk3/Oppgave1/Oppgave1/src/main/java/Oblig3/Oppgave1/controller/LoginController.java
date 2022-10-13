package Oblig3.Oppgave1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Oblig3.Oppgave1.util.LoginUtil;



@Controller
@RequestMapping("/${app.url.login}")
public class LoginController {
	

	@Value("${app.url.login}")   private String LOGIN_URL;

	
	/* 
	 * GET /login er forespørselen for å hente login-skjema.
	 */
	@GetMapping
    public String hentLoginSkjema() {
		return "loginView";
    }

	/* 
	 * POST /login er forespørselen for å logge inn.
	 */
	@PostMapping
    public String provAaLoggeInn(@RequestParam String username,
    		HttpServletRequest request,	RedirectAttributes ra) {
		
		
		
		LoginUtil.loggInnBruker(request, username);
		
		return "redirect:" + "iver";
    }
}
