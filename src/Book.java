import java.util.Objects;

public class Book {
    private String bookName; // описание свойств (полей) класса Book
    private Author authorName; // описание свойств (полей) класса Book
    private int publishingYear; // описание свойств (полей) класса Book

        public Book(String bookName, Author author, int publishingYear){  // конструктор объектов класса Book
            this.bookName = bookName; //присваивание полю bookName, принадлежащего классу Book, значения параметра bookName, переданного конструктору класса Book
            this.authorName = author; //присваивание полю authorName, принадлежащего классу Book, значения параметра author, переданного конструктору класса Book
            this.publishingYear = publishingYear; //присваивание полю publishingYear, принадлежащего классу Book, значения параметра publishingYear, переданного конструктору класса Book
        }
        public String getBookName () {  // геттер — метод, который возвращает значение поля bookName
            return this.bookName;
        }
        public Author getAuthor () {  // геттер — метод, который возвращает значение поля author
            return this.authorName;
        }
        public int getPublishingYear () {  // геттер — метод, который возвращает значение поля publishingYear
            return this.publishingYear;
        }
        public void setPublishingYear ( int publishingYear)
        {  // сеттер — метод, который меняет значение поля publishingYear
            this.publishingYear = publishingYear; // Записываем значение параметра age в поле publishingYear
        }

        @Override
        public String toString () {
            return bookName + " " + authorName + " " + publishingYear;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publishingYear);
    }
}
