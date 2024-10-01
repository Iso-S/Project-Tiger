package tiikeri.project_tiger.repository;

import tiikeri.project_tiger.entity.Kaupunki;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface KaupunkiRepository extends JpaRepository<Kaupunki, Long> {
    List<Kaupunki> findByKaupunki(String kaupunki);
}

