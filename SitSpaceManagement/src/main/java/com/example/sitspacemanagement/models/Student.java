package com.example.sitspacemanagement.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Student {
    private int id;
    private String Name;
    private int score;
    private String grade;
}
