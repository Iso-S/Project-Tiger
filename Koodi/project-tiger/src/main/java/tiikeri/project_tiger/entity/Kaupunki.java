package tiikeri.project_tiger.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

public class Kaupunki {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kaupunkiId;

    private String kaupunki;

    @OneToMany(mappedBy = "kaupunki")
    private List<Tapahtuma> tapahtumat;
}
