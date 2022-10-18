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

@Controller
@RequestMapping("${app.url.handleliste}")
public class HandlelisteController {

  public List<ListeItem> handleliste;

  @Value("${app.url.handleliste}") private String HANDLELISTE_URL;


    @GetMapping
    public String hentLoginSkjema(HttpSession Session) {
      Session.setAttribute("Handleliste", handleliste);
		  return "handlelisteView";
    }
    

    @PostMapping
    public String leggTilHandleliste(@RequestParam String nyTing,  HttpSession Session) {
      ListeItem nyttElem = new ListeItem();
      nyttElem.setName(nyTing);
      Handleliste.addItem(nyttElem);
      handleliste = Handleliste.getItems();
      Session.setAttribute("Handleliste", handleliste);
      
     
      return "redirect:" + HANDLELISTE_URL;

    }

    
    public String fjernFraHandleliste(@RequestParam ListeItem fjernTing, HttpSession Session){
      System.err.println("vi kom hit");
      return "redirect:" + HANDLELISTE_URL;
    }


    
}
