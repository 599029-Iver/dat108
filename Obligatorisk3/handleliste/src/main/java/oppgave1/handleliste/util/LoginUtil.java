package oppgave1.handleliste.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.context.annotation.ApplicationScope;

import oppgave1.handleliste.model.*;

public class LoginUtil {
        public static List<ListeItem> handleliste;
        private final static int MAX_INTERACTIVE_INTERVAL = 61;
        //@Value("${app.correctPass}")  private final static String LOGIN_PASSWORD;

	public static void loggUtBruker(HttpSession session) {
                session.invalidate();
	}

	public static void loggInnBruker(HttpServletRequest request) {

                loggUtBruker(request.getSession());

                HttpSession session = request.getSession();
                session.setAttribute("Handleliste", handleliste);
                session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL);
     
	}
	
	public static boolean erBrukerInnlogget(HttpSession session) {
                try {
                        System.out.println( session.getCreationTime());
                       
                      } catch (IllegalStateException ise) {
                        return false;
                      }
                      return true;

		//return session != null ;
				
	}
    
}
