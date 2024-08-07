package studentManagementApp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseCode;
    private String courseName;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Student> students=new ArrayList<>();


    public void addStudent(Student student) {
        students.add(student);
    }


}
