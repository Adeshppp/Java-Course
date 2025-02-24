package com.example.springmvcboot;


import com.example.springmvcboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "result";
    }

    @GetMapping(value="/getStudents")
    public String getStudents(Model m){

        m.addAttribute("students",studentRepo);
        return "showStudents";
    }
}
