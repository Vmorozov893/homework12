import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return this.name + " " + this.surname;
    }

    public boolean equals(Author author2) {
        if (this == author2) return true;
        if (author2 == null || this.getClass() != author2.getClass()) return false;
        Author author = (Author) author2;
        return this.name.equals(author.name) && this.surname.equals(author.surname);
    }

    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
