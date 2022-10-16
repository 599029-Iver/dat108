package oppgave1.handleliste.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

<<<<<<< HEAD:handleliste/src/main/java/oppgave1/handleliste/controller/LoginController.java
import oppgave1.handleliste.util.LoginUtil;
import oppgave1.handleliste.util.passwordCheck;


@Controller
@RequestMapping("${app.url.login}")
public class LoginController {
    
	
	
	@Value("${app.url.login}")   private String LOGIN_URL;
	@Value("${app.message.wrongPass}")   private String WRONG_PASS_MESSAGE;
	@Value("${app.url.handleliste}") private String HANDLELISTE_URL;
	
=======

@Controller
@RequestMapping("/login")
public class LoginController {
    /* 
	
	@Value("${app.message.invalidUsername}") private String INVALID_USERNAME_MESSAGE;
	@Value("${app.url.login}")   private String LOGIN_URL;
	@Value("${app.url.webshop}") private String WEBSHOP_URL;
	*/
>>>>>>> 97395bb922577d8401ec7964b8baa05c1263a3d4:Obligatorisk3/Oppgave1/Oppgave1/src/main/java/Oblig3/Oppgave1/controller/LoginController.java
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
<<<<<<< HEAD:handleliste/src/main/java/oppgave1/handleliste/controller/LoginController.java
    public String provAaLoggeInn(@RequestParam String password, HttpServletRequest request,	RedirectAttributes ra) {
		
		if (!passwordCheck.isCorrectPass(password)) {
			ra.addFlashAttribute("redirectMessage", WRONG_PASS_MESSAGE);
			return "redirect:" + LOGIN_URL;
		}
		
		return "redirect:" + HANDLELISTE_URL;
=======
    public String provAaLoggeInn(@RequestParam String password,
    		HttpServletRequest request,	RedirectAttributes ra) {
		

		
		return "redirect:" + "Iver";
>>>>>>> 97395bb922577d8401ec7964b8baa05c1263a3d4:Obligatorisk3/Oppgave1/Oppgave1/src/main/java/Oblig3/Oppgave1/controller/LoginController.java
    }
}
    