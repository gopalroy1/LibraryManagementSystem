package Gopal.Student_Libraray_Management.Controller;

import Gopal.Student_Libraray_Management.DTOs.StudentUpdateMobNumberDto;
import Gopal.Student_Libraray_Management.Model.Student;
import Gopal.Student_Libraray_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student)
    {
        studentService.add(student);
        return "student added sucessfully";
    }

    @GetMapping("/findByemail")
    public String findByEmail( @RequestParam("email") String email){

        return studentService.findNameByEmail(email) ;
    }

    @PutMapping("/updateMobile")
    public String updateMob(StudentUpdateMobNumberDto student){
        return studentService.updateMobNo(student);
    }


}
