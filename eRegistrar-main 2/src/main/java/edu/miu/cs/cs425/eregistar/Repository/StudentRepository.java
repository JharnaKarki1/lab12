package edu.miu.cs.cs425.eregistar.Repository;

import edu.miu.cs.cs425.eregistar.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
 
    List<Student> findByFirstNameContainingIgnoreCase(String name);
}
