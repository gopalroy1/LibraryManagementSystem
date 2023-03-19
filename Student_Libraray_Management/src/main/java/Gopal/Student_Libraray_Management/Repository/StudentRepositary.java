package Gopal.Student_Libraray_Management.Repository;

import Gopal.Student_Libraray_Management.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositary extends JpaRepository<Student,Integer> {
      Student findByEmail(String email);

      //select * from student where country=India;   //Return of Entities
      List<Student> findByCountry(String country);
}
