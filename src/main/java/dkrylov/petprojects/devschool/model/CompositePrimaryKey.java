package dkrylov.petprojects.devschool.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
class CompositePrimaryKey implements Serializable {
    private Long student;
    private Long course;
}
