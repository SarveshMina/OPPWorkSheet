import java.util.*;

public class Candidate {
    String name;
    int votes = 0;

    public Candidate (String name) {
        if (name.length() == 0) {
            System.out.println("Error: No name enterred!");
        } else {
            this.name = name;
        }
    }

    public String getName () {
        return name;
    }
    public int getVotes () {
        return votes;
    }

    public void voteFor () {
        votes += 1;
    }

    public void print () {
        System.out.println(name + " has " + votes + " votes.");
    }
}
