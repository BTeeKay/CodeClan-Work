package com.example.codeclan.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "raids")
public class Raid {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;

    @Column(name = "location")
    private String location;

    @Column(name ="value")
    private int value;

    @ManyToMany
    @JoinTable(
            name= "pirates_raids",
            joinColumns = {@JoinColumn(
                    name = "raid_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "pirate_id",
                    nullable = false,
                    updatable = false
            )}
    )
    private List<Pirate> pirates;

    public Raid(String location, int value) {
        this.location = location;
        this.value = value;
        this.pirates = new ArrayList<>();
    }

    public Raid(){

    }

    public String getLocation() {
        return location;
    }

    public int getValue() {
        return value;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addPirate(Pirate pirate){
        this.pirates.add(pirate);
    }
}
