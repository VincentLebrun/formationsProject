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
        return studentRepository.save(student);

    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    public  Student updateStudents(Student student, Long id) {
        Student currentStudent = getStudentById(id);
        currentStudent.setBirthDate(student.getBirthDate());
        currentStudent.setMail(student.getMail());
        currentStudent.setName(student.getName());
        currentStudent.setStartDate(student.getStartDate());
        currentStudent.setSurname(student.getSurname());
        currentStudent.setSession(student.getSession());
        return currentStudent;
    }
}
