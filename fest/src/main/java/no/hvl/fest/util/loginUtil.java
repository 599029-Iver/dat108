package no.hvl.fest.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import no.hvl.fest.model.registrering;

public class loginUtil {
    
    
	public void loggUtBruker(HttpSession session) {
        session.invalidate();
    }

    public void loggInnBruker(HttpServletRequest request, int MAX_INTERACTIVE_INTERVAL, registreringService regServ) {

        loggUtBruker(request.getSession());

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL);     

        List<registrering> sorteingsliste = regServ.finnAlleRegistreringer();
        sorteingsliste.sort((a,b) -> (a.getFornavn() + a.getEtternavn()).toLowerCase().compareTo((b.getFornavn() + b.getEtternavn()).toLowerCase()));
        

        session.setAttribute("registrerte", sorteingsliste);
        

}

    public boolean erBrukerInnlogget(HttpSession session) {
        return session != null && session.getAttribute("registrerte") != null;
    }
}
