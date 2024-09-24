package tiikeri.project_tiger.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

public class Lippu {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lippuId;

    private LocalDateTime ostoAika;
    private boolean myytavana;
    private int myyty;

    @ManyToOne
    @JoinColumn(name = "tapahtumalipputyyppi_id")
    private TapahtumanLipputyyppi tapahtumanLipputyyppi;
}
