package tiikeri.project_tiger.web;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tiikeri.project_tiger.entity.Tapahtuma;
import tiikeri.project_tiger.repository.TapahtumaRepository;

@RestController
public class TapahtumaRestController {
    @Autowired
    private TapahtumaRepository tapahtumaRepository;

    @GetMapping("/tapahtumat")
    public List<Tapahtuma> haeKaikkiTapahtumat() {
        return tapahtumaRepository.findAll();
    }

    @GetMapping("/tapahtumat/{id}")
    public Optional<Tapahtuma> haeTapahtuma(@PathVariable Long id) {
        return tapahtumaRepository.findById(id);
    }
}
