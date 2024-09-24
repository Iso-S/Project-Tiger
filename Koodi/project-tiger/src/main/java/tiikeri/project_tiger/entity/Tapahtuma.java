package tiikeri.project_tiger.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Tapahtuma {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tapahtumaId;

    private LocalDateTime alkuaika;
    private LocalDateTime loppuaika;
    private String kuvaus;

    @ManyToOne
    @JoinColumn(name = "kaupunki_Id")
    private Kaupunki kaupunki;

    @ManyToOne
    @JoinColumn(name = "status_Id")
    private Status status;

    @OneToMany(mappedBy = "tapahtuma")
    private List<TapahtumanLipputyyppi> lipputyypit;

    public Long getTapahtumaId() {
        return tapahtumaId;
    }

    public void setTapahtumaId(Long tapahtumaId) {
        this.tapahtumaId = tapahtumaId;
    }

    public LocalDateTime getAlkuaika() {
        return alkuaika;
    }

    public void setAlkuaika(LocalDateTime alkuaika) {
        this.alkuaika = alkuaika;
    }

    public LocalDateTime getLoppuaika() {
        return loppuaika;
    }

    public void setLoppuaika(LocalDateTime loppuaika) {
        this.loppuaika = loppuaika;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public Kaupunki getKaupunki() {
        return kaupunki;
    }

    public void setKaupunki(Kaupunki kaupunki) {
        this.kaupunki = kaupunki;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
