package oppgave1.handleliste.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import oppgave1.handleliste.model.Handleliste;
import oppgave1.handleliste.util.LoginUtil;
import oppgave1.handleliste.util.passwordCheck;


@Controller
@RequestMapping("${app.url.login}")
public class LoginController {
    
	
	
	@Value("${app.url.login}")   private String LOGIN_URL;
	@Value("${app.message.wrongPass}")   private String WRONG_PASS_MESSAGE;
	@Value("${app.url.handleliste}") private String HANDLELISTE_URL;
	@Value("${app.correctPass}") private String THEPASS;
	@Value("${app.timeout}")  private int MAX_INTERACTIVE_INTERVAL;
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
    public String provAaLoggeInn(@RequestParam String password, HttpServletRequest request,	RedirectAttributes ra) {
		passwordCheck sjekk = new passwordCheck();
		if (!sjekk.isCorrectPass(password, THEPASS)) {
			ra.addFlashAttribute("redirectMessage", WRONG_PASS_MESSAGE);
			return "redirect:" + LOGIN_URL;
		}
		LoginUtil.loggInnBruker(request, MAX_INTERACTIVE_INTERVAL);
		return "redirect:" + HANDLELISTE_URL;
    }
}
    