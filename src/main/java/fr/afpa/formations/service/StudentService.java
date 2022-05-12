package fr.afpa.formations.service;

import fr.afpa.formations.model.Student;
import fr.afpa.formations.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;


    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return  studentRepository.save(student);

    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    public Student getStudentById(Long id) {
       return  studentRepository.findById(id).get();
    }

}
