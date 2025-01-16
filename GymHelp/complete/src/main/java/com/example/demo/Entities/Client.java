package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Client {
    @Column(nullable = false, length = 60)
    private String first_name;

    @Column(nullable = false, length = 60)
    private String last_name;

    @Column(length = 60)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false)
    private int age;

    @Column(length = 7)
    private String gender;
}