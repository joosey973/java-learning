package SixsthPractice;

import SixsthPractice.Events.Event;
import SixsthPractice.Events.Movie;
import SixsthPractice.Events.Theater;

public class Prog2 {
    public static Movie[] getMovies() {
        Movie[] movies = {
            new Movie("Интерстеллар", 2014, 13),
            new Movie("Леон", 1994, 0),
            new Movie("Астрал", 0, 0),
            new Movie(null, 0, 0)
        };

        return movies;
    }

    public static Theater[] getTheatres() {
        Theater[] theaters = {
            new Theater("Гамлет", 1601, 16),
            new Theater("Ревизор", 1994, 0),
            new Theater("Вишнёвый сад", 0, 0),
            new Theater(null, 0, 0)
        };

        return theaters;
    }

    public static <T extends Event> void validateEvent(T events[]) {
        for (T event: events) {
            if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAgeRestrict() == 0) {
                throw new RuntimeException("Некооректное событие:\n" + event);
            }

            System.out.println(event);
        }
    }

    public static void main(String[] args) {
        validateEvent(getMovies());
        validateEvent(getTheatres());
    }
}
