package com.example.sitspacemanagement.models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class AllStudent {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    public List<Student> getAllStudents() {
        return students;
    }

}





