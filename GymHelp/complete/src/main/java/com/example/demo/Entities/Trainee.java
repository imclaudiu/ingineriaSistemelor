package Entities;
/*Entities pack contains Trainee, Trainer.
   Both of these two mentioned are client-sided and use the application. The role of each entity is
   explained in its own class.
 */


import jakarta.persistence.*;

/* This class contains the trainee details. A trainee is one of the client-side entities of the application.
A trainee is a client of the application.
    Trainee: A person who uses the gym application in order to get results.*/
@Entity
public class Trainee extends Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_trainee;
    @Column(nullable = false, length = 60)
    private String first_name;
    @Column(nullable = false, length = 60)
    private String last_name;
    @Column(length = 60)
    private String email;
    @Column(nullable = false)
    private int age;
    @Column(length = 7)
    private String gender;
    @Column(nullable = false)
    private int weight;
    @Column(nullable = false)
    private int height;
    @Column(nullable = false, unique = true, length = 100)
    private String username;
    @Column(nullable = false, length = 100)
    private String password;


    public int getId_trainee() {
        return id_trainee;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId_trainee(int id_trainee) {
        this.id_trainee = id_trainee;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
