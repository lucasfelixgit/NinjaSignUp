package dev.java10x.NinjaSignUp.Ninjas;

import dev.java10x.NinjaSignUp.Missions.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA = Java Persistence API
//Entity: Turns our class into a Database Entity
@Entity
@Table(name = "tb_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    //ninjas*(many) could only have one mission per time - n-1
    @ManyToOne
    @JoinColumn(name = "mission_id") //foreign key
    private MissionModel mission;

}
