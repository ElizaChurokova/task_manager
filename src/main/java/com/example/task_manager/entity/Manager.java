package com.example.task_manager.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id")
    private Position position;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User userId;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private Department departmentId;
}
