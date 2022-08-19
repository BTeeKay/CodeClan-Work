package com.example.codeclan.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="pirates")
public class Pirate {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
    @ManyToOne
    @JoinColumn(name = "ship_id",nullable = false)
    private Ship ship;

    @ManyToMany
    @JsonIgnoreProperties({"pirates"})
    @JoinTable(
            name="project_join",
            joinColumns = {@JoinColumn(
                    name = "pirate_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "raid_id",
                    nullable = false,
                    updatable = false
            )}
    )

    private List<Raid> raids;

    public Pirate(String firstName, String lastName, int age, Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ship = ship;
        this.raids = new ArrayList<>();
    }

    public Pirate(){

    }

    public List<Raid> getRaids() {
        return raids;
    }

    public Ship getShip() {
        return ship;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setRaids(List<Raid> raids) {
        this.raids = raids;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addRaid(Raid raid){
        this.raids.add(raid);
    }
}
