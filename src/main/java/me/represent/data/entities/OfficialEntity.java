package me.represent.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "official")
public class OfficialEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    private String name;

    @OneToMany
    private List<OfficialActionEntity> actions;

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
}
