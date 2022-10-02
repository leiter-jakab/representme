package me.represent.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "action")
public class ActionEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "action_type", nullable = false)
    private ActionTypeEntity type;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getActionDate() {
        return date;
    }

    public void setActionDate(LocalDate date) {
        this.date = date;
    }

    public ActionTypeEntity getType() {
        return type;
    }

    public void setType(ActionTypeEntity type) {
        this.type = type;
    }
}