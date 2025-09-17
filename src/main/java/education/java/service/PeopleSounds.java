package education.java.service;

import org.springframework.stereotype.Service;

@Service
public class PeopleSounds {
    public String goodMorning() {
        return "Good morning!";
    }

    public String goodNight() {
        return "Good night!";
    }
}
