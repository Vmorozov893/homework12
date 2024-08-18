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
}
