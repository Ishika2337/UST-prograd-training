package training.task.JPADemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import training.task.JPADemo.entity.Student;
import training.task.JPADemo.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String index(){
        Student student = new Student("Ishika","CSE",99.0,"9887745939");
        service.createStudent(student);
        return "Student Saved";
    }
    @RequestMapping("/list")
    public List<Student> listAllStudent(){
        return service.listAll();
    }
    @RequestMapping("/create")
    public String createStudent(HttpServletRequest request){
        String name = request.getParameter("name");
        String branch = request.getParameter("branch");
        Double marks = Double.parseDouble(request.getParameter("marks"));
        String contactNumber = request.getParameter("contactNumber");
        Student student = new Student(name,branch,marks,contactNumber);
        service.createStudent(student);
        return "Dynamic Student";
    }
}
