package com.hanna.Java_loppuharjoitus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    StudentService myStudentService;

//Nähdään kursseille ilmoittauteet henkilöt
    @GetMapping("students")
        public List<MyDataClass> getStudents() {
        return myStudentService.getStudents();

    }
//Voidaan etsiä kursseille ilmoittautuneita henkilöitä nimen tai kurssin perusteella
   @GetMapping("students/{param}")
        public List<MyDataClass> getStudentsByParam(@PathVariable String param) {
        return myStudentService.getStudentsByParam(param);
    }

//Voidaan poistaa kursseille ilmoittauteneita henkilöitä nimen tai kurssin perusteella
   @GetMapping("removestudents/{par}")
    public List<MyDataClass> getStudentsByPar(@PathVariable String par) {
        return myStudentService.getStudentsByPar(par);
    }

    @PostMapping("addstudent")
    public String addMyDataClass(@RequestBody MyDataClass student) {
        myStudentService.addMyDataClass(student);
        return "";
    }

}
