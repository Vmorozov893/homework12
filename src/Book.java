import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int yearOfRelease;

    public Book(String bookTitle, Author author, int yearOfRelease) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String toString() {
        return "Название книги " + this.bookTitle + ", автор " + this.author.toString() + ", год выпуска " + this.yearOfRelease;
    }

    public boolean equals(Book book2) {
        if (this == book2) return true;
        if (book2 == null || this.getClass() != book2.getClass()) return false;
        Book book = (Book) book2;
        return this.bookTitle.equals(book.bookTitle) && this.author.equals(book.author) && this.yearOfRelease == book.yearOfRelease;
    }

    public int hashCode() {
        return Objects.hash(bookTitle, author, yearOfRelease);
    }
}
