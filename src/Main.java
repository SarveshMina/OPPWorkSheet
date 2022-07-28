public class Main {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("Alex");
  //      Candidate candidate2 = new Candidate("Alex");
  //      Candidate candidate3 = new Candidate("Drake");


        candidate1.voteFor();
        candidate1.print();
        candidate1.voteFor();
        candidate1.print();
        System.out.println(candidate1.getName());
        System.out.println(candidate1.getVotes());
    }
}