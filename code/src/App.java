import java.util.Date;

import entities.Comment;
import entities.Post;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class App {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        try {
            // Parse date string and create Post object
            Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
                    "I'm going to visit this wonderful country!", 12);
            p1.addComment(c1);
            p1.addComment(c2);

            System.out.println(p1);
        } catch (ParseException e) {
            // Handle exception
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}