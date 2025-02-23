package com.example.springmvcboot;


import com.example.springmvcboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home page requested!");
        return "index";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m){

        int num3 = i+j;
        m.addAttribute("num3",num3);
        return "result";
    }


    // by using models directory
//    @RequestMapping("/addStudent")
//    public String addStudent(@RequestParam("id") int id, @RequestParam("name") String name, Model m){
//        Student student = new Student();
//        student.setId(id);
//        student.setName(name);
//        m.addAttribute("student", student);
//        return "result";
//    }

// by using ModelAttribute class
//    @RequestMapping(value="/addStudent", method = RequestMethod.POST)
    @GetMapping(value="/addStudent")
    public String addStudent(@ModelAttribute Student student){
        return "result";
    }
}
