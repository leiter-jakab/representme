package me.represent.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import java.util.UUID;

@Entity
@Table(name = "jurisdiction")
public class JurisdictionEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    private String name;

    @NonNull
    @ManyToOne
    private LocationEntity location;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "jurisdiction_type")
    private JurisdictionTypeEntity type;

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

    public LocationEntity getLocation() {
        return location;
    }

    public void setLocation(LocationEntity location) {
        this.location = location;
    }

    public JurisdictionTypeEntity getType() {
        return type;
    }

    public void setType(JurisdictionTypeEntity type) {
        this.type = type;
    }
}