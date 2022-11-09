package no.hvl.fest.util;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.hvl.fest.model.registrering;
import no.hvl.fest.model.registreringRepo;

@Service
public class registreringService {
    @Autowired private registreringRepo regRepo;

    public List<registrering> finnAlleRegistreringer(){
        return regRepo.findAll();
    }

    public registrering finnMedNr(String inp){
        Optional<registrering> denne = regRepo.findById(inp);
        if(denne.isPresent()){
            return denne.get();
        }
        return null;
    }

    public void lagreNyReg(registrering ny){
        regRepo.save(ny);
    }
}

