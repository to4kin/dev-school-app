package dkrylov.petprojects.devschool.repository;

import dkrylov.petprojects.devschool.model.Course;
import dkrylov.petprojects.devschool.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * School repository
 */
public interface SchoolRepository extends JpaRepository<School, Long>, JpaSpecificationExecutor<Course> {
}
