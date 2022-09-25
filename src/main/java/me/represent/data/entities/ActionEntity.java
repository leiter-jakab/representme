package me.represent.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "action")
public class ActionEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    private String name;

    @NonNull
    private LocalDate date;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "action_type")
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