package tiikeri.project_tiger.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

public class TapahtumanLipputyyppi {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tapahtumalipputyyppiId;

    private double hinta;
    private String kuvaus;

    @ManyToOne
    @JoinColumn(name = "tapahtuma_id")
    private Tapahtuma tapahtuma;

    @OneToMany(mappedBy = "tapahtumanLipputyyppi")
    private List<Lippu> liput;
}
