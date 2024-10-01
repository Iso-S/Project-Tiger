package tiikeri.project_tiger.repository;

import tiikeri.project_tiger.entity.Tapahtuma;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TapahtumaRepository extends JpaRepository<Tapahtuma, Long> {
    List<Tapahtuma> findByKaupunkiKaupunkiId(Long kaupunkiId);
    List<Tapahtuma> findByStatusStatusId(Long statusId);
}
