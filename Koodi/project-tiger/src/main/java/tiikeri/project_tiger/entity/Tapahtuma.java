package tiikeri.project_tiger.entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

public class Tapahtuma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tapahtumaId;

    private LocalDateTime alkuaika;
    private LocalDateTime loppuaika;
    private String kuvaus;

    @ManyToOne
    @JoinColumn(name = "kaupunki_id")
    private Kaupunki kaupunki;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @OneToMany(mappedBy = "tapahtuma")
    private List<TapahtumanLipputyyppi> lipputyypit;
}
