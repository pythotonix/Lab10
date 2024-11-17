package ucu.edu.ua.Decorator;

import lombok.AllArgsConstructor;

import java.time.Duration;
import java.time.LocalTime;

@AllArgsConstructor
public class TimedDocument implements Document{

    private Document document; // робимо асоціацію з класом Document

    @Override
    public String parse() {
        LocalTime startTimer = LocalTime.now();
        
        String result = document.parse();

        LocalTime endTimer = LocalTime.now();

        System.out.println( "Time: " +
            Duration.between(startTimer, endTimer).getSeconds());
        return result;
    }

    @Override
    public String getGcsPath() {
        return document.getGcsPath();
    }
}
