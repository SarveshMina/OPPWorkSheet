import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("Alex");
        Candidate candidate2 = new Candidate("Sarvesh");
        Candidate candidate3 = new Candidate("Sai");
        Candidate candidate4 = new Candidate("Rohit");

        Election election = new Election();

        // Adding candidate 1,2,3 to Election Candidate List
        election.addCandidate(candidate1);
        election.addCandidate(candidate2);
        election.addCandidate(candidate3);
        election.addCandidate(candidate4);

        // Alex has 5 votes
        candidate1.voteFor();
        candidate1.voteFor();
        candidate1.voteFor();
        candidate1.voteFor();
        candidate1.voteFor();

        // Sarvesh has 4 Votes
        candidate2.voteFor();
        candidate2.voteFor();
        candidate2.voteFor();
        candidate2.voteFor();

        // Sai has 6 Votes
        candidate3.voteFor();
        candidate3.voteFor();
        candidate3.voteFor();
        candidate3.voteFor();
        candidate3.voteFor();
        candidate3.voteFor();

        // Rohit has 3 Votes
        candidate4.voteFor();
        candidate4.voteFor();
        candidate4.voteFor();

        // Printing all Candidates Information with No.Votes

        election.printAll();
        System.out.println("\n\n");
        election.findTopCandidates(4);
    }
}