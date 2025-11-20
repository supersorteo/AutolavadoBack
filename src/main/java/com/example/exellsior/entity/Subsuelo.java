package com.example.exellsior.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "subsuelos")
public class Subsuelo {
    @Id

    private String id;

    @Column(nullable = false)
    private String label;

    @OneToMany(mappedBy = "subsuelo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Space> spaces;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Space> getSpaces() {
        return spaces;
    }

    public void setSpaces(List<Space> spaces) {
        this.spaces = spaces;
    }
}
