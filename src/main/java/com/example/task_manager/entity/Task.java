package com.example.task_manager.entity;

import com.example.task_manager.enums.Priority;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Length(max = 255, message = "Message too long (more than 255)")
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private List<User> userId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manager_id")
    private Manager managerId;
    Date startDate = Calendar.getInstance().getTime();
    long d_StartTime = new Date().getTime();
    Date endDate = Calendar.getInstance().getTime();
    long d_endTime = new Date().getTime();
    private Priority priority;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "document_id")
    private Document documentId;

}
