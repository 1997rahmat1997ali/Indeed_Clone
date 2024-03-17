package com.ali.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    private String profile;

    private String type;

    private String description;

    private String experience;

    private String technology[];

    private String salary;
}
