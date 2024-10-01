package tiikeri.project_tiger.repository;

import tiikeri.project_tiger.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StatusRepository extends JpaRepository<Status, Long> {
    List<Status> findByStatusIgnoreCase(String status);
}
