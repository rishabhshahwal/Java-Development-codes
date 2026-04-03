package com.cfs.Testing.repo;

import com.cfs.Testing.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student,Long> {

    boolean existsByEmail(String email);
}
