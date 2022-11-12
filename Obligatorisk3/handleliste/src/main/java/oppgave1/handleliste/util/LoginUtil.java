package oppgave1.handleliste.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import oppgave1.handleliste.model.*;

public class LoginUtil {
    //private final static int MAX_INTERACTIVE_INTERVAL = 60;
    //@Value("${app.timeout}")  private static int MAX_INTERACTIVE_INTERVAL;
    //@Value("${app.correctPass}")  private final static String LOGIN_PASSWORD;

	public static void loggUtBruker(HttpSession session) {
                session.invalidate();
	}

	public static void loggInnBruker(HttpServletRequest request, int MAX_INTERACTIVE_INTERVAL) {
    	
                loggUtBruker(request.getSession());

                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL);
                session.setAttribute("handleliste", Handleliste.getItems());

	}
	
	public boolean erBrukerInnlogget(HttpSession session) {
		return session != null && session.getAttribute("handleliste") != null;
	}
    
}
