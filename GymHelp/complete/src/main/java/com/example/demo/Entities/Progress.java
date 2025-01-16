package Entities;

import jakarta.persistence.*;

@Entity
public class Progress {
    @EmbeddedId
    private ProgressId id;

    @ManyToOne
    @MapsId("id_trainer")
    @JoinColumn(name = "id_trainer", referencedColumnName = "id_trainer")
    private Trainer trainer;

    @ManyToOne
    @MapsId("id_trainee")
    @JoinColumn(name = "id_trainee", referencedColumnName = "id_trainee")
    private Trainee trainee;

    @Column(length = 300)
    private String menu;

    @Column(nullable = false)
    private int trainee_weight;

    public ProgressId getId() {
        return id;
    }

    public void setId(ProgressId id) {
        this.id = id;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getTrainee_weight() {
        return trainee_weight;
    }

    public void setTrainee_weight(int trainee_weight) {
        this.trainee_weight = trainee_weight;
    }
}
