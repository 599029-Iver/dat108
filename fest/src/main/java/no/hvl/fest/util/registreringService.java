package no.hvl.fest.util;

import java.util.List;

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
}
