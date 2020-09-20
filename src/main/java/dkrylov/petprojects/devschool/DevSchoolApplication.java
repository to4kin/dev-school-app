package dkrylov.petprojects.devschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Service entry point
 */
@SpringBootApplication(scanBasePackages = "dkrylov.petprojects.devschool")
public class DevSchoolApplication {
    public static void main(String[] args) {
        SpringApplication.run(DevSchoolApplication.class, args);
    }
}
