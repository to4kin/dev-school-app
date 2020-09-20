package dkrylov.petprojects.devschool.repository;

import dkrylov.petprojects.devschool.model.Course;
import dkrylov.petprojects.devschool.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Mentor repository
 */
public interface MentorRepository extends JpaRepository<Mentor, Long>, JpaSpecificationExecutor<Course> {
}
