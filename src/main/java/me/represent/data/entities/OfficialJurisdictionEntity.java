package me.represent.data.entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "official_jurisdiction")
public class OfficialJurisdictionEntity {
    
    @Id
    @GeneratedValue
    private UUID id;

    @NonNull
    @ManyToOne
    private OfficialEntity official;

    @NonNull
    @ManyToOne
    private JurisdictionEntity jusrisdiction;

    @NonNull
    private LocalDate startDate;

    @NonNull
    private LocalDate endDate;

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

    public JurisdictionEntity getJurisdiction() {
        return jusrisdiction;
    }

    public void setJurisdiction(JurisdictionEntity jurisdiction) {
        this.jusrisdiction = jurisdiction;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
