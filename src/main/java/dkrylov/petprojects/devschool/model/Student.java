package dkrylov.petprojects.devschool.model;

import javax.validation.constraints.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
@ToString
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = BaseEntity.PK_GENERATOR_NAME, sequenceName = "student_seq", allocationSize = 1)
public class Student extends BaseEntity {
    @Column(name = "first_name")
    @NotNull
    private String firstName;

    @Column(name = "last_name")
    @NotNull
    private String lastName;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "phone")
    @NotNull
    private String phone;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mentor_id", referencedColumnName = "id")
    private Mentor mentor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "school_id", referencedColumnName = "id")
    private School school;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "student")
    private Set<StudentCourse> courses;
}
