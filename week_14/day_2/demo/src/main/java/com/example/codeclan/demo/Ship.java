package com.example.codeclan.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ships")
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "ship")
    @JsonIgnoreProperties({"ship"})
    private List<Pirate> pirates;

    public Ship(String name) {
        this.name = name;
        this.pirates = new ArrayList<>();
    }

    public Ship(){

    }

    public String getName() {
        return name;
    }

    public List<Pirate> getPirates() {
        return pirates;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPirates(List<Pirate> pirates) {
        this.pirates = pirates;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addPirate(Pirate pirate){
        this.pirates.add(pirate);
    }
}
