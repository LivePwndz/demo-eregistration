package edu.miu.cs.cs425.eRegistration.repository;

import edu.miu.cs.cs425.eRegistration.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
