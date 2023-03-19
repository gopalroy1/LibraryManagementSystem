package Gopal.Student_Libraray_Management.Service;

import Gopal.Student_Libraray_Management.DTOs.AuthorEntryDto;
import Gopal.Student_Libraray_Management.DTOs.AuthorResponseDto;
import Gopal.Student_Libraray_Management.DTOs.BookResponseDto;
import Gopal.Student_Libraray_Management.Model.Author;
import Gopal.Student_Libraray_Management.Model.Book;
import Gopal.Student_Libraray_Management.Repository.AuthorRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepositary authorRepositary;

    public void addAuthor(AuthorEntryDto authorEntryDto){
        //made new author
        Author author = new Author();
        //setting all its attributes
        author.setName(authorEntryDto.getName());
        author.setCountry(authorEntryDto.getCountry());
        author.setAge(authorEntryDto.getAge());
        author.setRating(authorEntryDto.getRating());

    }
    //Getting author by id
    public AuthorResponseDto getAuthor(Integer authorId){
        Author author = authorRepositary.findById(authorId).get();
        AuthorResponseDto authorResponseDto = new AuthorResponseDto();

        List<Book> bookWritten = author.getBooks();

        List<BookResponseDto> bookResponseDtos = new ArrayList<>();

        for(Book b : bookWritten){
            BookResponseDto bookResponseDto_temp = new BookResponseDto();
            bookResponseDto_temp.setName(b.getName());
            bookResponseDto_temp.setGenere(b.getGenere());
            bookResponseDto_temp.setPages(b.getPages());

            /// adding to main list
            bookResponseDtos.add(bookResponseDto_temp);
        }
        authorResponseDto.setName(author.getName());
        authorResponseDto.setAge(author.getAge());
        authorResponseDto.setCountry(author.getCountry());
        authorResponseDto.setRating(author.getRating());
        authorResponseDto.setBooksWritten(bookResponseDtos);
        return authorResponseDto;

    }
}
