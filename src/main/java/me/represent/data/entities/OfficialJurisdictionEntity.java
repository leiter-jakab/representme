package me.represent.data.entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "official_jurisdiction")
public class OfficialJurisdictionEntity {
    
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private OfficialEntity official;

    @ManyToOne
    @JoinColumn(nullable = false)
    private JurisdictionEntity jusrisdiction;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = false)
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
