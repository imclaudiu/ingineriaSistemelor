package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import Entities.Trainee;

import java.util.Optional;

public interface TraineeRepository extends JpaRepository<Trainee, Integer> {

    Optional<Trainee> findByUsername(String username);

    void deleteByUsername(String username);
}