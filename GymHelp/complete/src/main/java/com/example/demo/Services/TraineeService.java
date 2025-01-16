package Services;

import Entities.Trainee;
import Repositories.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TraineeService {

    private final TraineeRepository traineeRepository;

    @Autowired
    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }
    public List<Trainee> getAllTrainees(){
        return traineeRepository.findAll();
    }
    public Optional<Trainee> getTraineeById(int id){
        try{
            return traineeRepository.findById(id);
        }catch(Exception e){
            System.out.println("No trainee with id " + id + "\n" + e.toString());
            return null;
        }
    }
    public Trainee insertTrainee(Trainee t){
        return traineeRepository.save(t);
    }
    public void deleteTraineeById(int id){
        traineeRepository.deleteById(id);
    }
    public void deleteTraineeByUsername(String username){
        traineeRepository.deleteByUsername(username);
    }
    public Optional<Trainee> getByUsername(String username){
        return traineeRepository.findByUsername(username);
    }
}
