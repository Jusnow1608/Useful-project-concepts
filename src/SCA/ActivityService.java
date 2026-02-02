package SCA;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;


public class ActivityService implements IActivityService {
    @Override
    public void logUserActivity(User user, String pathToLog) {


        try (PrintWriter out = new PrintWriter(new FileWriter(pathToLog, true))) {
            out.println("User: " + user.getEmail() + " logged at " + Instant.now());
        } catch (IOException e) {
            System.err.println("Błąd zapisu logów: " + e.getMessage());
        }
    }
}

