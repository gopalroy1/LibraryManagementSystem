package Gopal.Student_Libraray_Management.Service;

import Gopal.Student_Libraray_Management.DTOs.StudentUpdateMobNumberDto;
import Gopal.Student_Libraray_Management.Enum.Card_status;
import Gopal.Student_Libraray_Management.Model.Card;
import Gopal.Student_Libraray_Management.Model.Student;
import Gopal.Student_Libraray_Management.Repository.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class StudentService {
    @Autowired
    StudentRepositary studentRepositary;

    public void add(Student student){

        Card card = new Card();
        card.setCard_status(Card_status.ACTIVATED);
        card.setStudentFor(student);
        student.setCard(card);

        studentRepositary.save(student);

    }

    public String findNameByEmail(String email){

        Student student = studentRepositary.findByEmail(email);

        return student.getName();
    }

    public String updateMobNo(StudentUpdateMobNumberDto student){
        // jo input liye ussse poorana object niklaa phir purana object ka mob chnage kr ke usko save kr dia
        Student realStudent = studentRepositary.findById(student.getId()).get();

        realStudent.setMobNo(student.getMobNo());
        studentRepositary.save(realStudent);
        return "Mobile updated to "+realStudent.getMobNo();

    }


}
