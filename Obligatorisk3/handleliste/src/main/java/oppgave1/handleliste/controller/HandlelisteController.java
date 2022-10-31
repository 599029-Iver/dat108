package oppgave1.handleliste.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import oppgave1.handleliste.model.Handleliste;
import oppgave1.handleliste.model.ListeItem;
import oppgave1.handleliste.util.LoginUtil;
import oppgave1.handleliste.util.gyldigTingUtil;

@Controller
@RequestMapping("${app.url.handleliste}")
public class HandlelisteController {

  LoginUtil sjekk = new LoginUtil();

  @Value("${app.url.handleliste}") private String HANDLELISTE_URL;
  @Value("${app.url.login}")   private String LOGIN_URL;
  //@Value("${app.message.requiresLogin}") private String REQUIRES_LOGIN_MESSAGE;




    @GetMapping
    public String hentLoginSkjema(HttpSession session) {
      if (!sjekk.erBrukerInnlogget(session)) {
        return "redirect:" + LOGIN_URL;
      }
      
		  return "handlelisteView";
    }
    

    @PostMapping
    public synchronized String leggTilHandleliste(@RequestParam(required = false) String nyTing,  HttpSession session, @RequestParam(required = false) String fjernTing, RedirectAttributes ra ) {
      System.err.println(session.getMaxInactiveInterval());

      if(fjernTing != null){
        Handleliste.removeItem(Handleliste.finnTing(fjernTing));
        return "redirect:" + HANDLELISTE_URL;

      }

      if(!gyldigTingUtil.erGyldig(nyTing)){
        return "redirect:" + HANDLELISTE_URL;
      }

      ListeItem nyttElem = new ListeItem();
      nyttElem.setName(nyTing);
      Handleliste.addItem(nyttElem);
      

      return "redirect:" + HANDLELISTE_URL;

    }
 
}
