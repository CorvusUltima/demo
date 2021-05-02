package com.example.demo.subject;
import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }
    @PostMapping
   Subject createSubject(@RequestBody Subject subject )
    {
        return subjectRepository.save(subject);
    }
    @PutMapping("/{subjectId}/students/{studentsId}")
    Subject enrollStudentToSubject(
            @PathVariable Long subjectId,
            @PathVariable Long studentId
    )
    {
        Subject subject =subjectRepository.getOne(subjectId);
        Student student =studentRepository.getOne(studentId);

         subject.enrollStudent(student);
         return subjectRepository.save(subject);

    }


}
