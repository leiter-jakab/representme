package me.represent.data.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "official_entity")
public class OfficialActionEntity {
    
    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    @ManyToOne
    private OfficialEntity official;

    @NonNull
    @ManyToOne
    private ActionEntity action;

    @NonNull
    private String reference;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OfficialEntity getOfficial() {
        return official;
    }

    public void setOfficial(OfficialEntity official) {
        this.official = official;
    }

    public ActionEntity getAction() {
        return action;
    }

    public void setAction(ActionEntity action) {
        this.action = action;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
