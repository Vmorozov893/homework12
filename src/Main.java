//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Author author1 = new Author("Антон", "Чехов");
        Author author2 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Лошадиная фамилия", author1, 1885);
        Book book2 = new Book("Лошадиная фамилия", author1, 1820);


        System.out.println("\n" + book1.toString() + "\n");
        System.out.println(author1.toString() + "\n");
        System.out.println("\n" + book2.toString() + "\n");
        System.out.println(author2.toString() + "\n");


        System.out.println(author1.equals(author2) + "\n");

        System.out.println(book1.equals(book2) + "\n");

        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("author2.hashCode() = " + author2.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode() + "\n");

        book2.setYearOfRelease(1885);

        System.out.println("book1.equals(book2) = " + book1.equals(book2) + "\n");

        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("author2.hashCode() = " + author2.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
    }
}