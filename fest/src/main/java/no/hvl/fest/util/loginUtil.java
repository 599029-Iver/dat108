package no.hvl.fest.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

public class loginUtil {
    
   @Autowired private registreringService regServ;
    
	public void loggUtBruker(HttpSession session) {
        session.invalidate();
    }

    public void loggInnBruker(HttpServletRequest request, int MAX_INTERACTIVE_INTERVAL) {

        loggUtBruker(request.getSession());

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL);

        session.setAttribute("registrerte", regServ.finnAlleRegistreringer());
        

}

    public boolean erBrukerInnlogget(HttpSession session) {
        return session != null && session.getAttribute("registrerte") != null;
    }
}
