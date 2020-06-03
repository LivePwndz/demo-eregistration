package edu.miu.cs.cs425.eRegistration.service;

import edu.miu.cs.cs425.eRegistration.model.Student;
import edu.miu.cs.cs425.eRegistration.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getListOfStudents() {
        return studentRepository.findAll();
    }
}
