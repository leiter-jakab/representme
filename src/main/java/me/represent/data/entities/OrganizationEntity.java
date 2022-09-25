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
@Table(name = "organization")
public class OrganizationEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    private String name;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "organization_type")
    private OrganizationTypeEntity type;

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

    public OrganizationTypeEntity getType() {
        return type;
    }

    public void setType(OrganizationTypeEntity type) {
        this.type = type;
    }
}
