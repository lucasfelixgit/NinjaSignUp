package dev.java10x.NinjaSignUp.Ninjas;

import dev.java10x.NinjaSignUp.Missions.MissionsModel;
import jakarta.persistence.*;

import java.util.List;

//JPA = Java Persistence API
//Entity: Turns our class into a Database Entity
@Entity
@Table(name = "tb_ninja_signup")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private int age;

    //ninjas*(many) could only have one mission per time - n-1
    @ManyToOne
    @JoinColumn(name = "missions_id") //foreign key
    private MissionsModel mission;

    public NinjaModel(){}

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
