package tiikeri.project_tiger.web;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tiikeri.project_tiger.entity.Tapahtuma;
import tiikeri.project_tiger.repository.TapahtumaRepository;

@RestController
public class TapahtumaRestController {
    @Autowired
    private TapahtumaRepository TapahtumaRepository;

    @GetMapping("/tapahtumat")
    public @ResponseBody List<Tapahtuma> haeKaikkiTapahtumat() {
        return (List<Tapahtuma>) TapahtumaRepository.findAll();
    }

    @GetMapping("/tapahtumat/{id}")
    public @ResponseBody Optional<Tapahtuma> haeTapahtuma(@PathVariable("id") Long tapahtumaId) {
        return TapahtumaRepository.findById(tapahtumaId);
    }
}
