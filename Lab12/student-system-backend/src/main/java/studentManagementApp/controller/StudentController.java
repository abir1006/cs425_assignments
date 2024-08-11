package studentManagementApp.controller;

import studentManagementApp.domain.Student;
import studentManagementApp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("eregistrar/api/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/register")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.updateStudent(student));
    }

    @DeleteMapping("delete/{id}")
    public void deleteStudent(@PathVariable long id) {
       studentService.deleteStudent(id);
    }

    @ExceptionHandler (Exception.class)
    public ResponseEntity<Object> handleException(Exception ex) {
        Map<String,Object> map=new HashMap<>();
        map.put("isSuccess", false);
        map.put("message", ex.getMessage());
        return ResponseEntity.ok(map);

    }
}
