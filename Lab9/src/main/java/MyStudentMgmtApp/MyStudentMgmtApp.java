package MyStudentMgmtApp;

import MyStudentMgmtApp.domain.Course;
import MyStudentMgmtApp.domain.Student;
import MyStudentMgmtApp.domain.Transcript;
import MyStudentMgmtApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication

public class MyStudentMgmtApp implements CommandLineRunner {
    @Autowired
    StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        try {

            Student student1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24));

            Student student2 = new Student("000-61-0002", "William",
                    "James", "Munny", 3.82, LocalDate.of(1984, 11, 8));

            Transcript transcript1 = new Transcript("Masters in Computer Science");
            Transcript transcript2=new Transcript("Masters in Business Administration");

            student1.setTranscript(transcript1);
            student2.setTranscript(transcript2);



            Course course1=new Course("425", "SWE");
            Course course2=new Course("MPP", "Modern Programming Practices");
            Course course3=new Course("866", "Fundamentals of Macroeconomics");

            student1.addCourse(course1);
            student1.addCourse(course2);

            student2.addCourse(course1);
            student2.addCourse(course3);

            course1.addStudent(student1);
            course1.addStudent(student2);
            course2.addStudent(student1);
            course3.addStudent(student2);



            System.out.println(studentService.saveStudent(student1));
            System.out.println(studentService.saveStudent(student2));

        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }



    }
}
