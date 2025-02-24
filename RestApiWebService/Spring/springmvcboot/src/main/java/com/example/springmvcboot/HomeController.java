package com.example.springmvcboot;


import com.example.springmvcboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    StudentRepo studentRepo;

    @ModelAttribute
    public void modelData(Model m) {
        m.addAttribute("name", "Students");
    }



    @RequestMapping("/")
    public String home(){
        System.out.println("home page requested!");
        return "index";
    }

    @PostMapping(value="/addStudent")
    public String addStudent(@ModelAttribute Student student){
        studentRepo.save(student);
        return "result";
    }

    @GetMapping(value="/getStudents")
    public String getStudents(Model m){

        m.addAttribute("students",studentRepo.findAll());
        return "showStudents";
    }


    @GetMapping(value="/getStudent")
    public String getStudent(@RequestParam int id, Model m){
        System.out.println("sid is "+id);
        m.addAttribute("student", studentRepo.getOne(id));
        return "result";
    }

    @GetMapping(value="/getStudentByName")
    public String getStudentByName(@RequestParam String aname, Model m){
//        m.addAttribute("student", studentRepo.findByName(aname));
//        m.addAttribute("student", studentRepo.findByNameOrderById(aname));
//        m.addAttribute("student", studentRepo.findByNameOrderByIdDesc(aname));
        m.addAttribute("student", studentRepo.find(aname));
        return "result";
    }
}
