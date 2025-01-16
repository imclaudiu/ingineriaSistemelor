package Entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProgressId implements Serializable {

    private int id_trainer;
    private int id_trainee;

    // Getters, setters, equals(), and hashCode()

    public int getId_trainer() {
        return id_trainer;
    }

    public void setId_trainer(int id_trainer) {
        this.id_trainer = id_trainer;
    }

    public int getId_trainee() {
        return id_trainee;
    }

    public void setId_trainee(int id_trainee) {
        this.id_trainee = id_trainee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProgressId)) return false;
        ProgressId that = (ProgressId) o;
        return id_trainer == that.id_trainer && id_trainee == that.id_trainee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_trainer, id_trainee);
    }
}