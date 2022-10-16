package oppgave1.handleliste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("${app.url.handleliste}")
public class HandlelisteController {

    @GetMapping
    public String hentLoginSkjema() {
		return "handlelisteView";
    }
    
}
