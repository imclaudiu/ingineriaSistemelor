package Repositories;

import Entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import Entities.Trainee;

import java.util.Optional;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

    Optional<Trainer> findByUsername(String username);
    void deleteByUsername(String username);
}
