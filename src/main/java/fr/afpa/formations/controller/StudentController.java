package fr.afpa.formations.controller;


import fr.afpa.formations.model.Student;
import fr.afpa.formations.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("list")
    public List<Student> studentList() {
        return studentService.getAllStudent();
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping("update/{id}")
    public ResponseEntity updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student currentStudent = studentService.getStudentById(id);
        currentStudent.setBirthDate(student.getBirthDate());
        currentStudent.setMail(student.getMail());
        currentStudent.setName(student.getName());
        currentStudent.setStartDate(student.getStartDate());
        currentStudent.setSurname(student.getSurname());
        currentStudent.setSession(student.getSession());
        return ResponseEntity.ok(currentStudent);
    }


}
