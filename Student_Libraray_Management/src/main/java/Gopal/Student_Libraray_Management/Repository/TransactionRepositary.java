package Gopal.Student_Libraray_Management.Repository;

import Gopal.Student_Libraray_Management.Model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepositary extends JpaRepository<Transactions,Integer> {
//    @Query(value = "select * from transactions where book_id=:bookId and card_id=:cardId and is_issue_operation=true",
//            nativeQuery = true)
//    List<Transactions> getTransactionsForBookAndCard(int bookId, int cardId);
}
