package constructor.com.example.DependencyInjectionDemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "yea you running well";
    }
}
