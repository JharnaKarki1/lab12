package edu.miu.cs.cs425.eregistar.Repository;

import edu.miu.cs.cs425.eregistar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long>{
    @Query("SELECT s FROM Student s WHERE s.studentNumber=:studentNumber")
    Student findByStudentNumber(String studentNumber);
}