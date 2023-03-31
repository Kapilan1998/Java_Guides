package com.example.java_guides_new;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController         // contains @Controller & @ResponseBody
                    // @ResponseBody convert java onject to json object
public class StudentController {

            //http://localhost:8080/student1
    @GetMapping("/student1")                  //make as rest api
    public Student getStudent(){
        return new Student("Vetti","Maran");
    }


            // http://127.0.0.1:8080/studentsList
    @GetMapping("/studentsList")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Lasith","Malinga"));
        students.add(new Student("Kushal","Mendis"));
        students.add(new Student("Mahela","Jayawardana"));
        students.add(new Student("Kumar","Sangakkara"));

        return students;
    }

            // http://127.0.0.1:8080/student/Vetti/Maran
//    @PathVariable       // bind URI template path variable to method varaibale
    @GetMapping("/student1/{firstName}/{lastName}")   // URI template variable
    public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }


            //build rest api to handle query parameters
            // http://127.0.0.1:8080/student?firstName=Ram&lastName=kumar

    @GetMapping("/student1/query")
    public Student studentQueryProgram(@RequestParam(name ="myFirstName555" ) String firstName,
                                       @RequestParam(name = "myLastName") String lastName){
        return new Student(firstName, lastName);
    }
}
