package com.example.task_manager.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Length(max = 10000, message = "Message too long (longer 10000)" )
    @Column(name = "text")
    private String text;
    @Column(name = "name_from", nullable = false)
    private String nameFrom;
    @Column(name = "name_to", nullable = false)
    private String nameTo;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private List<User> userId;
    @Column(name = "date_message")
    private LocalDate date;


}
