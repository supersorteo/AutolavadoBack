package com.example.exellsior.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "spaces")
public class Space {

    @Id
    @Column(name = "space_key", unique = true)
    private String key;

    @Column(name = "subsuelo_id", nullable = false)
    private String subsueloId;

    @Column(nullable = false)
    private boolean occupied;

    @Column(nullable = false)
    private boolean hold;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "start_time")
    private Long startTime;

    @Column(name = "display_name")
    private String displayName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subsuelo_id", insertable = false, updatable = false)
    private Subsuelo subsuelo;

    @OneToOne(mappedBy = "space", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Client client;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSubsueloId() {
        return subsueloId;
    }

    public void setSubsueloId(String subsueloId) {
        this.subsueloId = subsueloId;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isHold() {
        return hold;
    }

    public void setHold(boolean hold) {
        this.hold = hold;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Subsuelo getSubsuelo() {
        return subsuelo;
    }

    public void setSubsuelo(Subsuelo subsuelo) {
        this.subsuelo = subsuelo;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
