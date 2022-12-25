import java.util.Objects;

public class Author {
    private String firstName;// описание свойств (полей) класса Author
    private String lastName; // описание свойств (полей) класса Author


    public Author(String firstName, String lastName)// конструктор для создания объектов класса Author

    {
        this.firstName = firstName; // присваивание полю firstName, принадлежащего классу Author, значения параметра firstName, переданного конструктору класса Author
        this.lastName = lastName; // присваивание полю lastName, принадлежащего классу Author, значения параметра lastName, переданного конструктору класса Author
    }
    public String getFirstName() {  // геттер — метод, который возвращает значение поля firstName
        return this.firstName;
    }
    public String getLastName() {  // геттер — метод, который возвращает значение поля lastName
        return this.lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}