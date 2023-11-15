package com.example.task_manager.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.management.relation.Role;
import java.util.Collection;

@Data
@Entity
@Table(name = "usr")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "First name cannot be empty")
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @NotBlank(message = "Last name cannot be empty")
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "department", nullable = false)
    private String department;
    @OneToOne
    @Column(name = "position_id", nullable = false)
    private Position positionId;

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }

//    @ElementCollection(targetClass = Role.class, FetchType.EAGER)//
//    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))

}
