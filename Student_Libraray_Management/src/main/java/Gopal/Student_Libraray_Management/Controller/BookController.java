package Gopal.Student_Libraray_Management.Controller;

import Gopal.Student_Libraray_Management.DTOs.BookResquestDto;
import Gopal.Student_Libraray_Management.Model.Book;
import Gopal.Student_Libraray_Management.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody BookResquestDto book){
//        bookService.addBook(book);
        return "Book added and author is also updated";
    }
}
