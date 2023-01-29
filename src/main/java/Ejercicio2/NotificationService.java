package Ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){

    }

    public String NotificationSaysHi(){
        return "Hi from Notification";
    }
}
