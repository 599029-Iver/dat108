package oppgave1.handleliste.controller;

import javax.servlet.http.HttpServletRequest;

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

  @Value("${app.url.handleliste}") private String HANDLELISTE_URL;


    @GetMapping
    public String hentLoginSkjema() {
		return "handlelisteView";
    }
    

    @PostMapping
    public String leggTilHandleliste(@RequestParam String nyTing, HttpServletRequest request,	RedirectAttributes ra) {
      ListeItem nyttElem = new ListeItem();
      nyttElem.setName(nyTing);
      Handleliste.addItem(nyttElem);
      System.out.println(Handleliste.tilStreng());

    
     
      return "redirect:" + HANDLELISTE_URL;

    }
    
}
