package tiikeri.project_tiger.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Kaupunki {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kaupunkiId;

    private String kaupunki;

    @OneToMany(mappedBy = "kaupunki")
    private List<Tapahtuma> tapahtumat;

    public Long getKaupunkiId(){
        return kaupunkiId;
    }

    public void setKaupunkiId(Long kaupunkiId){
        this.kaupunkiId = kaupunkiId;
    }
    public String getKaupunki(){
        return kaupunki;
    }

    public void setKaupunki(String kaupunki){
        this.kaupunki = kaupunki;
    }

}
