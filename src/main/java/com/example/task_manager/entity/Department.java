package com.example.task_manager.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "department_name", nullable = false)
    private String departmentName;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manager_id")
    private Manager managerId;

}
