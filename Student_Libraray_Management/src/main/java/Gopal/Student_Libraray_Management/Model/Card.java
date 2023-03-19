package Gopal.Student_Libraray_Management.Model;

import Gopal.Student_Libraray_Management.Enum.Card_status;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Card_table")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int cardId;

   @UpdateTimestamp
    Date updatedOn;
    @CreationTimestamp
    Date createdOn;

    @Enumerated(value = EnumType.STRING)
    private Card_status card_status;

    @OneToOne
    @JoinColumn
    private Student studentFor;

    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    private List<Book> book = new ArrayList<>();


    //Constructors
    public Card(){

    }

    /////////////getter and setters


    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Card_status getCard_status() {
        return card_status;
    }

    public void setCard_status(Card_status card_status) {
        this.card_status = card_status;
    }

    public Student getStudentFor() {
        return studentFor;
    }

    public void setStudentFor(Student studentFor) {
        this.studentFor = studentFor;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    ////////////
}
