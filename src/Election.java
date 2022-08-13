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

    /*public int removeLast() {
        Collections.sort(candidateList, Collections.reverseOrder());    // 6, 5, 4, 3
        int lowestCandidateVotes = candidateList.get(candidateList.size() - 1).getVotes(); // 3
        int candidatesRemoved = 0; // 0
        int index = candidateList.size() - 1;

        for (int i = index; i >= 0; i--) { // i = 2
            System.out.println(i);
            if (candidateList.get(i).getVotes() == lowestCandidateVotes) { // 3 == 5
                candidateList.remove(candidateList.get(i));
                candidatesRemoved++;
            }
        }
        System.out.println("End of remove last");
        return candidatesRemoved;
    }*/

    public int removeLast() {

        int removeLast = 0;

        if () {

        }
        for (int i = 0; i <= candidateList.size() - 2; i++) {
            for (int j = 1; j <= candidateList.size() - 1; j++) {
                if (candidateList.get(j).getVotes() < candidateList.get(i).getVotes()) {
                    removeLast++;
                    candidateList.remove(candidateList.get(j));

                } else if (candidateList.get(j).getVotes() ==  candidateList.get(i).getVotes()) {
                    return removeLast;
                }
            }
        }
        printAll();
        return removeLast;
    }





    /*public static void printTopCandidates (ArrayList<Candidate> TopCandidates) {
        for (Candidate candidate: TopCandidates) {
            candidate.print();
        }
    }*/


}
