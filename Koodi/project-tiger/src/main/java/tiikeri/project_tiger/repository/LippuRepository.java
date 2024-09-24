package tiikeri.project_tiger.repository;

import tiikeri.project_tiger.entity.Lippu;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LippuRepository extends JpaRepository<Lippu, Long> {
}
