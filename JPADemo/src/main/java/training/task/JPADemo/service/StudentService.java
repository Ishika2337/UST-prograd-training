package training.task.JPADemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import training.task.JPADemo.entity.Student;
import training.task.JPADemo.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> listAll() {
        return repository.findAll();
    }
}
