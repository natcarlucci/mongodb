package com.nathalia.mongodb.service;

import com.nathalia.mongodb.model.StudentRequest;
import com.nathalia.mongodb.model.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse create (StudentRequest request);

    List<StudentResponse> getAll();
}



















