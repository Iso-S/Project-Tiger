package tiikeri.project_tiger.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class TapahtumanLipputyyppi {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tapahtumalipputyyppiId;

    private BigDecimal hinta;
    private String kuvaus;

    @ManyToOne
    @JoinColumn(name = "tapahtuma_id")
    private Tapahtuma tapahtuma;

    @OneToMany(mappedBy = "lipputyyppi")
    private List<Lippu> liput;

    public Long getTapahtumalipputyyppiId() {
        return tapahtumalipputyyppiId;
    }

    public void setTapahtumalipputyyppiId(Long tapahtumalipputyyppiId) {
        this.tapahtumalipputyyppiId = tapahtumalipputyyppiId;
    }

    public BigDecimal getHinta() {
        return hinta;
    }

    public void setHinta(BigDecimal hinta) {
        this.hinta = hinta;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public Tapahtuma getTapahtuma() {
        return tapahtuma;
    }

    public void setTapahtuma(Tapahtuma tapahtuma) {
        this.tapahtuma = tapahtuma;
    }

}
