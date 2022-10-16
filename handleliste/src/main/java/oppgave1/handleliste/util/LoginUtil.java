package oppgave1.handleliste.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;

import oppgave1.handleliste.model.*;

public class LoginUtil {
    private final static int MAX_INTERACTIVE_INTERVAL = 60;
    //@Value("${app.correctPass}")  private final static String LOGIN_PASSWORD;

	public static void loggUtBruker(HttpSession session) {
        session.invalidate();
	}

	public static void loggInnBruker(HttpServletRequest request, String passord) {
    	
        loggUtBruker(request.getSession());
/* 
        if(passord.compareTo(LOGIN_PASSWORD) == 0){
                return;//kode for returnering til login
        }
*/
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL);
        session.setAttribute("passord", passord);
        session.setAttribute("handleliste", new Handleliste());
	}
	
	public static boolean erBrukerInnlogget(HttpSession session) {
		return session != null 
				&& session.getAttribute("passord") != null
				&& session.getAttribute("cart") != null;
	}
    
}
