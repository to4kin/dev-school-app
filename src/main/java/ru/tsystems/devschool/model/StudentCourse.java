package ru.tsystems.devschool.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_course")
@IdClass(CompositePrimaryKey.class)
public class StudentCourse {

    @Id
    @ManyToOne(optional = false, targetEntity = Student.class)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @Id
    @ManyToOne(optional = false, targetEntity = Course.class)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

    @Column(name = "mark")
    private Integer mark;

    @Version
    private long version;
}
