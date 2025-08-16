package JPAtutorial.example.JPA.tutorial.repositry;


import JPAtutorial.example.JPA.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("jasjao@gmail.com")
                .firstName("Raman")
                .lastName("Singh")
                .guardianName("Ravinder")
                .guardianEmail("addqw@gmail.com")
                .guardianMobile(Long.valueOf("5446121318"))
                .build();

        studentRepository.save(student);
    }

    @Test
    public void findAllStudent() {
        List<Student> studentList = studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }
}