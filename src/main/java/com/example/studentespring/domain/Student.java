package com.example.studentespring.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Document(collection = "student")
public class Student {
    @Id
    private int id;
    private String firstName, lastName, course;
    private int age, enrollmentYear;
}
