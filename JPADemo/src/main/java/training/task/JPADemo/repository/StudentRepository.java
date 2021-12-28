package training.task.JPADemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import training.task.JPADemo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
