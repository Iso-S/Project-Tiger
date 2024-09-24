package tiikeri.project_tiger.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Status {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusId;
    
    private String status;

    @OneToMany(mappedBy = "status")
    private List<Tapahtuma> tapahtumat;

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
