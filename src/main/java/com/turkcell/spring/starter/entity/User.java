package com.turkcell.spring.starter.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
  @Id
  @UuidGenerator
  private UUID id;

  private String username;

  private String password;

  public List<OperationClaim> getOperationClaims() {
    return operationClaims;
  }

  public void setOperationClaims(List<OperationClaim> operationClaims) {
    this.operationClaims = operationClaims;
  }

  @ManyToMany()
  @JoinTable(
          name="user_operation_claims",
          joinColumns = @JoinColumn(name="user_id"),
          inverseJoinColumns = @JoinColumn(name="operation_claim_id")
  )
  private List<OperationClaim> operationClaims;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
