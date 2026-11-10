package ThirdPractice;

public class Book {
    private final String title;
    private final String text;
    private final int pages;

    public Book() {
        this.title = "Unknown";
        this.text = "...";
        this.pages = 0;
    }

    public Book(String ti, String txt, int pg) {
        this.title = ti;
        this.text = txt;
        this.pages = pg;
    }

    public int getPages() {
        return this.pages;
    }

    public String getTitle() {
        return this.title;
    }

    public static void compareTwoBooks(Book book1, Book book2) {
        if (book1.getPages() < book2.getPages()) {
            System.out.printf("Количество страниц в книге %s меньше, чем в %s", book1.getTitle(), book2.getTitle());
        } else if (book1.getPages() == book2.getPages()) {
            System.out.printf("Количество страниц в книге %s и %s равно", book1.getTitle(), book2.getTitle());
        } else {
            System.out.printf("Количество страниц в книге %s больше, чем в %s", book1.getTitle(), book2.getTitle());
        }
        System.out.println();
    }

    public void printText() {
        System.out.println("Книга выведена на печать. Текст:");
        System.out.println(text + "\n");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Информация о книге:\n\n");
        stringBuilder.append("Название книги: ");
        stringBuilder.append(this.title);
        stringBuilder.append("\n");
        stringBuilder.append("Количество страниц: ");
        stringBuilder.append(this.pages);
        stringBuilder.append("\n");
        stringBuilder.append("Текст книги: ");
        stringBuilder.append(this.text);
        stringBuilder.append("\n\n");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Преступление и наказание", "ЫВАОЫывальывьалывьаылваьы", 300);
        Book book2 = new Book("Мешок с костями", "ЫВАОЫывальывьалывьаылваьы", 310);

        Book.compareTwoBooks(book1, book2);
        System.out.println(book1);
        System.out.println(book2);

        book1.printText();
        book2.printText();
    }

}
