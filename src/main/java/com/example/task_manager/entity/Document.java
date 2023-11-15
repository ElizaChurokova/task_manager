package com.example.task_manager.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Data
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "document_name", nullable = false)
    private String name;
    @Column (name = "document")
    private byte[] document;
    @Column (name = "upload_date", nullable = false)
    private LocalDate uploadDate;

}
