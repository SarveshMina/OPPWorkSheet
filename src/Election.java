import java.util.List;
import java.util.ArrayList;

public class Election {

    // Basic declaration of Array List using object type Candidate.
    public static List <Candidate> candidateList = new ArrayList<>();

    public static void addCandidate(Candidate candidate) {
        candidateList.add(candidate);
    }

    // Using for each loop and getter methods we can get all Candidate objects.
    public static void getCandidates() {
        for (Candidate candidate: candidateList) {
            System.out.println(candidate.getName() + " " + candidate.getVotes());
        }
    }

    public void printAll () {
        for (Candidate candidate: candidateList) {
            System.out.println(candidate.getName() + " has " + candidate.getVotes() + " votes.");
        }
    }

    // We can search candidate name using for each loop and getter methods.
    public static String findCandidate(String name) {
        for (Candidate candidate: candidateList) {
            if (candidate.getName().equals(name)) {
                return "Name: " + candidate.getName() + "  Votes: " + candidate.getVotes();
            }
        }
        return null;
    }

    /*public static Candidate findCandidateSai(String Candidate) {
        for (Candidate c: candidateList) {
            if(Candidate == c.getName()) {
                return c;
            }
        }
        return null;
    }*/
}
