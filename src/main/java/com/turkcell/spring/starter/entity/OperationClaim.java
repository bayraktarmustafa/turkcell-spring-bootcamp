package com.turkcell.spring.starter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="operation_claims")
public class OperationClaim
{
    @Id
    @UuidGenerator
    private UUID id;

    private String name;

    @ManyToMany(mappedBy = "operationClaims")
    private List<User> users;

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
