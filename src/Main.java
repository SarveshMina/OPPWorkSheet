public class Main {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("Alex");
        Candidate candidate2 = new Candidate("Sarvesh");
        Candidate candidate3 = new Candidate("Sai");
        Candidate candidate4 = new Candidate("Rohit");

        // Adding candidate 1,2,3 to Election Candidate List
        Election.addCandidate(candidate1);
        Election.addCandidate(candidate2);
        Election.addCandidate(candidate3);
        Election.addCandidate(candidate4);

        // Displays all Candidates Name.


        System.out.println(Election.findCandidate("sai"));
    }
}