package Gopal.Student_Libraray_Management.Model;

import Gopal.Student_Libraray_Management.Enum.TransactionStatus;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name ="Transaction_table")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value=EnumType.STRING)
    private TransactionStatus transactionStatus;

    private int fine;
    private String transactionId = UUID.randomUUID().toString();

    @CreationTimestamp
    private Date TransactionDate;

    private boolean isIsuuedOperation;

    @ManyToOne
    @JoinColumn
    Book bookforeing;

    //constuctor

    public Transactions() {
    }
    //Getter and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        TransactionDate = transactionDate;
    }

    public boolean isIsuuedOperation() {
        return isIsuuedOperation;
    }

    public void setIsuuedOperation(boolean isuuedOperation) {
        isIsuuedOperation = isuuedOperation;
    }

    public Book getBookforeing() {
        return bookforeing;
    }

    public void setBookforeing(Book bookforeing) {
        this.bookforeing = bookforeing;
    }
    ////////////////////////////////////////////////////////
}
