package Repositories;

import Entities.Progress;
import Entities.ProgressId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProgressRepository extends JpaRepository<Progress, ProgressId> {
    public Optional<Progress> getProgressById(ProgressId id);
}
