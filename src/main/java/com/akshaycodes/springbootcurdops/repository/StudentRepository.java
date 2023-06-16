package com.akshaycodes.springbootcurdops.repository;

import com.akshaycodes.springbootcurdops.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,Integer> {

}
