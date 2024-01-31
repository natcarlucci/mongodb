package com.nathalia.mongodb.persistence.repository;

import com.nathalia.mongodb.persistence.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}






















