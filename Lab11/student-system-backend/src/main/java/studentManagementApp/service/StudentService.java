package studentManagementApp.service;

import studentManagementApp.domain.Student;
import studentManagementApp.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public Student saveStudent(Student student) {

       return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
      Optional<Student> student=studentRepository.findById(id);
      return student.orElse(null);


    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student student) {
        Optional<Student> studentPresent=studentRepository.findById(student.getStudentId());
        if(studentPresent.isPresent())
        {
            return studentRepository.save(student);
        }
       throw new RuntimeException("Student not found");
    }


}
