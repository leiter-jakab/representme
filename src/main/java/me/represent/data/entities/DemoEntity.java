package me.represent.data.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "DEMO")
public class DemoEntity {

    @Id
    private UUID id;

    private String name;

    public String getName() {
        return name;
    }
}
