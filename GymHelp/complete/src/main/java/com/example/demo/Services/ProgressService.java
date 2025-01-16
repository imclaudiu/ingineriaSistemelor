package Services;

import Entities.Progress;
import Entities.ProgressId;
import Repositories.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgressService {

    private final ProgressRepository progressRepository;

    @Autowired
    public ProgressService(ProgressRepository progressRepository) {
        this.progressRepository = progressRepository;
    }

    public List<Progress> getAllProgress() {
        return progressRepository.findAll();
    }

    public Progress getProgressById(ProgressId id) {
        return progressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Progress not found for ID: " + id));
    }

    public Progress insertProgress(Progress progress) {
        return progressRepository.save(progress);
    }

    public void deleteProgress(Progress progress) {
        progressRepository.delete(progress);
    }

    public Progress updateWeight(ProgressId id, int newWeight) {
        Optional<Progress> optionalProgress = progressRepository.findById(id);

        if (optionalProgress.isPresent()) {
            Progress progress = optionalProgress.get();
            progress.setTrainee_weight(newWeight);
            return progressRepository.save(progress);
        } else {
            throw new RuntimeException("Progress not found for ID: " + id);
        }
    }
}