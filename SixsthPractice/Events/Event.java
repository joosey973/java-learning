package SixsthPractice.Events;

public class Event {
    protected String title;
    protected int releaseYear;
    protected int ageRestrict;

    public Event(String title, int releaseYear, int ageRestrict) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.ageRestrict = ageRestrict;
    }

    public String getTitle() {
        return this.title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public int getAgeRestrict() {
        return this.ageRestrict;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Событие " + this.getClass().getSimpleName());
        stringBuilder.append("\n");
        stringBuilder.append("Название: ");
        stringBuilder.append(title);
        stringBuilder.append("\n");
        stringBuilder.append("Год выпуска: ");
        stringBuilder.append(releaseYear);
        stringBuilder.append("\n");
        stringBuilder.append("Ограничение по возрасту: ");
        stringBuilder.append(ageRestrict);
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
