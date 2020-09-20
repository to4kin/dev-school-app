package dkrylov.petprojects.devschool.model;

import javax.validation.constraints.NotNull;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
@ToString
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = BaseEntity.PK_GENERATOR_NAME, sequenceName = "course_seq", allocationSize = 1)
public class Course extends BaseEntity {
    @Column(name = "name")
    @NotNull
    private String name;
}
