package studentManagementApp;

import studentManagementApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MyStudentMgmtApp {
    @Autowired
    StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApp.class, args);
    }
}
