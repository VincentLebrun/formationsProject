package fr.afpa.formations.controller;

import fr.afpa.formations.model.Student;
import fr.afpa.formations.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/")
    public List<Student> studentList() {
        return studentService.getAllStudent();
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
       Student current = studentService.updateStudents(student,id);
        return current;

    }


}
