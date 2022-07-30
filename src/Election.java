import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Election {

    // Basic declaration of Array List using object type Candidate.
    public ArrayList <Candidate> candidateList = new ArrayList<>();

    public void addCandidate(Candidate candidate) {
        candidateList.add(candidate);
    }

    // Using for each loop and getter methods we can get all Candidate objects.
    public Candidate getCandidates() {
        for (Candidate candidate: candidateList) {
            return candidate;
        }
        return null;
    }

    public void printAll() {
        for (Candidate candidate: candidateList) {
            candidate.print();
        }
    }

    // We can search candidate name using for each loop and getter methods.
    /*public static String findCandidate(String name) {
        for (Candidate candidate: candidateList) {
            if (candidate.getName().equals(name)) {
                return "Name: " + candidate.getName() + "  Votes: " + candidate.getVotes();
            }
        }
        return null;
    }*/

    public Candidate findCandidate(String Candidate) {
        for (Candidate candidate: candidateList) {
            if(Candidate == candidate.getName()) {
                return candidate;
            }
        }
        return null;
    }

    public ArrayList<Candidate> findTopCandidates (int Votes) {
        ArrayList<Candidate> TopCandidates = new ArrayList<Candidate>();
        for (Candidate candidate: candidateList) {
            if (candidate.getVotes() >= Votes) {
                TopCandidates.add(candidate);
            }
        }
        if (TopCandidates.size() == 0) {
            System.out.println("The list is Empty");
        }
        return TopCandidates;
    }

    public int removeLast() {
        Collections.sort(candidateList);

        return 0;
    }





    /*public static void printTopCandidates (ArrayList<Candidate> TopCandidates) {
        for (Candidate candidate: TopCandidates) {
            candidate.print();
        }
    }*/


}
