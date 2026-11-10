package ThirdPractice;

public class Author {
    private final String name;
    private Book[] books;

    public Author() {
        name = "Unknown";
    }

    public Author(String authorName, Book[] authorBooks) {
        name = authorName;
        books = authorBooks.clone();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Информация об авторе:\n\n");
        stringBuilder.append("Имя автора: ");
        stringBuilder.append(name);
        stringBuilder.append("\n");
        stringBuilder.append("Названия книг: ");
        for (int i = 0; i < books.length; i++) {
            stringBuilder.append(books[i].getTitle());
            if (!(i == books.length - 1)) stringBuilder.append(", ");
        }

        stringBuilder.append("\n\n");
        
        for (Book book: books) {
            stringBuilder.append(book.toString());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Book[] books = {new Book("Мешок с костями", "ЫВАОЫывальывьалывьаылваьы", 310),
            new Book("Сияние", "ЫВАОЫывальывьалывьаылваьы", 520),
            new Book("Мизери", "ЫВАОЫывальывьалывьаылваьы", 510),
        };

        Author author = new Author("Стивен Кинг", books);

        System.out.println(author);
    }
}
