//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Author author1 = new Author("Anton", "Chekhov");
        Author author2 = new Author("Alexander", "Pushkin");
        Book book1 = new Book("Horse surname", author1, 1885);
        Book book2 = new Book("Ruslan and Lyudmila", author2, 1820);

        System.out.println("book1.getBookTitle() = " + book1.getBookTitle());
        System.out.println("book1.getAuthor().getName() = " + book1.getAuthor().getName());
        System.out.println("book1.getAuthor().getSurname() = " + book1.getAuthor().getSurname());
        System.out.println("book1.getYearOfRelease() = " + book1.getYearOfRelease() + "\n");
        System.out.println("book2.getBookTitle() = " + book2.getBookTitle());
        System.out.println("book2.getAuthor().getName() = " + book2.getAuthor().getName());
        System.out.println("book2.getAuthor().getSurname() = " + book2.getAuthor().getSurname());
        System.out.println("book2.getYearOfRelease() = " + book2.getYearOfRelease() + "\n");

        book1.setYearOfRelease(2024);
        System.out.println("После изменения года издания первой книги: ");
        System.out.println("book1.getYearOfRelease() = " + book1.getYearOfRelease() + "\n");
        System.out.println(book1.toString());
        System.out.println(author2.toString());
    }
}