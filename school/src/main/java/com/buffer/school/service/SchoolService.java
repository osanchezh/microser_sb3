package com.buffer.school.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buffer.school.client.StudentClient;
import com.buffer.school.model.FullSchoolResponse;
import com.buffer.school.model.School;
import com.buffer.school.model.SchoolRepository;

import java.util.List;

@Service
public class SchoolService {

	@Autowired
    private SchoolRepository repository;
	@Autowired
    private StudentClient client;

    public void saveSchool(School school) {
        repository.save(school);
    }

    public List<School> findAllSchools() {
        return repository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        School s = new School();
        s.setName("NOT_FOUND");
        s.setEmail("NOT_FOUND");
        var school = repository.findById(schoolId)
                .orElse(s);
        var students = client.findAllStudentsBySchool(schoolId);
        
        FullSchoolResponse f = new FullSchoolResponse();
        f.setName(school.getName());
        f.setEmail(school.getEmail());
        f.setStudents(students);
        return f;
    }
}