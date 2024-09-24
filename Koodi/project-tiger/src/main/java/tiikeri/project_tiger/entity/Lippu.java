package tiikeri.project_tiger.entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
public class Lippu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lippuId;

    private LocalDateTime ostoAika;
    private Boolean myytavana;
    private Boolean myyty;

    @ManyToOne
    @JoinColumn(name = "tapahtumalipputyyppi_id")
    private TapahtumanLipputyyppi lipputyyppi;

    public Long getLippuId() {
        return lippuId;
    }
    
    public void setLippuId(Long lippuId) {
        this.lippuId = lippuId;
    }
    
    public LocalDateTime getOstoAika() {
        return ostoAika;
    }
    
    public void setOstoAika(LocalDateTime ostoAika) {
        this.ostoAika = ostoAika;
    }
    
    public Boolean getMyytavana() {
        return myytavana;
    }
    
    public void setMyytavana(Boolean myytavana) {
        this.myytavana = myytavana;
    }
    
    public Boolean getMyyty() {
        return myyty;
    }
    
    public void setMyyty(Boolean myyty) {
        this.myyty = myyty;
    }
    
    public TapahtumanLipputyyppi getLipputyyppi() {
        return lipputyyppi;
    }
    
    public void setLipputyyppi(TapahtumanLipputyyppi lipputyyppi) {
        this.lipputyyppi = lipputyyppi;
    }
    
}
