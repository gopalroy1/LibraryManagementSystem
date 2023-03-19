package Gopal.Student_Libraray_Management.Model;

import Gopal.Student_Libraray_Management.Enum.Genere;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="books_table")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)

    private int id;
    private String name;
    private int age;
    private int pages;
    @Enumerated(value = EnumType.STRING)
    private Genere genere;

    @ManyToOne
    @JoinColumn
    private Author author;

    //Joining it with card
    @ManyToOne
    @JoinColumn
    private Card card;

    //for joining it to transaction entiity
    @OneToMany(mappedBy = "bookforeing",cascade = CascadeType.ALL)
    private List<Transactions> transactionsList = new ArrayList<>();

    ///constructors

    public Book() {
    }

    //Getter and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    ////////////
}
