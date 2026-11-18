package SeventhPractice.Students;

import java.util.Objects;

public class Student {
    public String name;
    public String group;
    public String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(this.studentId, student.studentId);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append(", ");
        stringBuilder.append(this.group);
        stringBuilder.append(", ");
        stringBuilder.append(this.studentId);
        return stringBuilder.toString();
    }
}
