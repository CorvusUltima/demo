package com.example.demo.subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;

    @GetMapping
    List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }
    @PostMapping
   Subject createSubject(@RequestBody Subject subject )
    {
        return subjectRepository.save(subject);
    }

}
