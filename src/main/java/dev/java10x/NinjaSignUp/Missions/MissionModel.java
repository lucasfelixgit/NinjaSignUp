package dev.java10x.NinjaSignUp.Missions;

import dev.java10x.NinjaSignUp.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missions")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String rank;

    //One mission could have one or more ninjas*(many) - 1-n
    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;

}
