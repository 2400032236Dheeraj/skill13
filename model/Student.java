package com.student.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Schema(description = "Student Entity")
public class Student {

    @Id
    @NotNull(message = "Student ID cannot be null")
    @Schema(description = "Student ID", example = "1")
    private Long id;

    @NotBlank(message = "Name is required")
    @Schema(description = "Student Name", example = "Tejaswini")
    private String name;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    @Schema(description = "Student Email", example = "teja@gmail.com")
    private String email;

    @NotBlank(message = "Course is required")
    @Schema(description = "Student Course", example = "CSE")
    private String course;

    public Student() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}