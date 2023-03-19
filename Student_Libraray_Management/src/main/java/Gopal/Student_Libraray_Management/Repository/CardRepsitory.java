package Gopal.Student_Libraray_Management.Repository;

import Gopal.Student_Libraray_Management.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepsitory extends JpaRepository<Card,Integer> {
}
