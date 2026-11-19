package SeventhPractice;

import SeventhPractice.Candidates.Candidate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Prog5 {
    public static List<Candidate> getCandidates() {
        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Зубенко Михаил Петрович", "муж", "21", 5, 5));
        candidates.add(new Candidate("Зубенко Михаил Петрович", "муж", "19", 1, 5));
        candidates.add(new Candidate("Михйлов Михаил Иванович", "муж", "50", 3, 4));
        candidates.add(new Candidate("Михалков Петр Иванович", "муж", "32", 3, 5));
        candidates.add(new Candidate("Михалкова Ирина Олеговна", "жен", "32", 5, 4));
        candidates.add(new Candidate("Соловьева Ирина Ивановна", "жен", "45", 2, 1));
        candidates.add(new Candidate("Астанкин Николай Егорович", "муж", "12", 4, 4));
        candidates.add(new Candidate("Астанкин Николай Егорович", "муж", "11", 3, 0));
        candidates.add(new Candidate("Астанкин Николай Егорович", "муж", "11", 3, 0));
        candidates.add(new Candidate("Астанкин Николай Егорович", "муж", "11", 3, 0));
        return candidates;
    }

    public static void main(String[] args) {
        Set<Candidate> candidatesHashSet = new HashSet<>(getCandidates());
        TreeSet<Candidate> candidateSet = new TreeSet<>(
            Comparator.comparing(Candidate::getRelevance, Comparator.reverseOrder())
            .thenComparing(Candidate::getRating, Comparator.reverseOrder())
        );
        candidateSet.addAll(candidatesHashSet);

        for (Candidate candidate: candidateSet) {
            System.out.printf("- %s%n", candidate);
        }
    }
}
