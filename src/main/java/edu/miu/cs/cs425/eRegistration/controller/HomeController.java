package edu.miu.cs.cs425.eRegistration.controller;

import edu.miu.cs.cs425.eRegistration.model.Student;
import edu.miu.cs.cs425.eRegistration.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class HomeController {
    private final StudentService studentService;

    public HomeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = {"/","/home"})
    public String displayHomePage(){
        return "home/index";
    }
    @GetMapping(value = {"/student/list"})
    public String displayListOfStudentsPage(Model model){
        List<Student> students = studentService.getListOfStudents();
        model.addAttribute("students", students);
        model.addAttribute("studentCount", students.size());
        return "student/list";
    }
}
