package Gopal.Student_Libraray_Management.Repository;

import Gopal.Student_Libraray_Management.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositary extends JpaRepository<Book,Integer> {

}
