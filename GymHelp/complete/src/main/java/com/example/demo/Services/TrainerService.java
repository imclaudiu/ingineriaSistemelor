package Services;

import Entities.Trainee;
import Entities.Trainer;
import Repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerService {
    private TrainerRepository trainerRepository;
    @Autowired
    public TrainerService(TrainerRepository t){
        trainerRepository = t;
    }
    public Optional<Trainer> getTrainerById(int id){
        try{
            return trainerRepository.findById(id);
        }catch(Exception e){
            System.out.println("No trainer with id " + id + "\n" + e.toString());
            return null;
        }
    }
    public List<Trainer> getAllTrainers(){
        return trainerRepository.findAll();
    }
    public Trainer insertTrainee(Trainer t){
        return trainerRepository.save(t);
    }
    public void deleteTrainerById(int id){
        trainerRepository.deleteById(id);
    }
    public void deleteTrainerByUsername(String username){
        trainerRepository.deleteByUsername(username);
    }
    public Optional<Trainer> getByUsername(String username){
        return trainerRepository.findByUsername(username);
    }
}
