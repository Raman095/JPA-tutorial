package JPAtutorial.example.JPA.tutorial.repositry;

import JPAtutorial.example.JPA.tutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}