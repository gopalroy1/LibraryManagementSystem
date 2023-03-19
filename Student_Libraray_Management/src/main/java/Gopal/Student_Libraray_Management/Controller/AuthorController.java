package Gopal.Student_Libraray_Management.Controller;

import Gopal.Student_Libraray_Management.DTOs.AuthorEntryDto;
import Gopal.Student_Libraray_Management.DTOs.AuthorResponseDto;
import Gopal.Student_Libraray_Management.Model.Author;
import Gopal.Student_Libraray_Management.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @RequestMapping("/add")
    public String addAuthor(@RequestBody AuthorEntryDto authorEntryDto){
        authorService.addAuthor(authorEntryDto);
        return "author"+ authorEntryDto.getName()+"added sucessfully";
    }
    @RequestMapping("/get")
    public AuthorResponseDto getAuthor(@RequestParam("id") Integer authorId){
        return authorService.getAuthor(authorId);

    }
}
