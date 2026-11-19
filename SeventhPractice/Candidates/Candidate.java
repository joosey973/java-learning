package SeventhPractice.Candidates;

import java.util.Objects;

public class Candidate {
    private String name;
    private String sex;
    private String age;
    private int relevance;
    private int rating;

    public Candidate(String name, String sex, String age, int relevance, int rating) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public int getRelevance() {
        return this.relevance;
    }

    public int getRating() {
        return this.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Candidate candidate = (Candidate) obj;
        return Objects.equals(this.name, candidate.getName());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append(", ");
        stringBuilder.append(this.sex);
        stringBuilder.append(", ");
        stringBuilder.append(this.age);
        stringBuilder.append(", ");
        stringBuilder.append(this.relevance);
        stringBuilder.append(", ");
        stringBuilder.append(this.rating);
        return stringBuilder.toString();
    }
}
