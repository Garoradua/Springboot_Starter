package constructor.com.example.DependencyInjectionDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyController {

    private Coach myCoach;

    DependencyController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/myhealth")
    private String myHealth(){
       return myCoach.getDailyWorkout();
    }
    @GetMapping("/hi")
    private String sir(){
        return "Hi sir";
    }
}
