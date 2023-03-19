package Gopal.Student_Libraray_Management.Service;

import Gopal.Student_Libraray_Management.DTOs.BookResquestDto;
import Gopal.Student_Libraray_Management.Model.Author;
import Gopal.Student_Libraray_Management.Model.Book;
import Gopal.Student_Libraray_Management.Repository.AuthorRepositary;
import Gopal.Student_Libraray_Management.Repository.BookRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepositary bookRepositary;
    @Autowired
    AuthorRepositary authorRepositary;

    /////This is before dtos
//    public void addBook(Book book){
//        //id nikala author ka book se jo ki daaalnge postman me
//        int id = book.getAuthor().getId();
//
//        //id se author object nikala
//        Author author = authorRepositary.findById(id).get();
//
//        //Book ka foreing key set kr rhe hai
//        book.setAuthor(author);
//
//        //author object se uska book writen nikala
////        List<Book> bookwri = author.getBooksWritten();
//
//        //ye wala book jo avi post man me add kr rhe hai usko author ke book written list me add kr dia
////        bookwri.add(book);
//
//        authorRepositary.save(author);
//
//    }

    ///after Dtos
    public String addBooks(BookResquestDto bookResquestDto){

    }
}
