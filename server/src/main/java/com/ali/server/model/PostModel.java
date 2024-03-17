package com.ali.server.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Table(name = "posts")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String profile;
    private String type;
    private String description;
    private String experience;
    private String technology[];
    private String salary;
    @CreatedDate
    private Date createdAt;

}
