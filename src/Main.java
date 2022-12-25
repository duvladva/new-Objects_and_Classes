public class Main {
    public static void main(String[] args) {
        System.out.println("Задание: Напишите небольшой библиотечный справочник, где хранится информация о книгах.");

        Author alexandrPushkin = new Author("Alexandr", "Pushkin"); // на основе класса Author создаем объект и записываем ссылку на него в объектную переменную alexandrPushkin
        System.out.println("alexandrPushkin.getFirstName() = " + alexandrPushkin.getFirstName()); // Вызываем геттер getFirstName() из объекта, созданного на основе класса Author
        System.out.println("alexandrPushkin.getLastName() = " + alexandrPushkin.getLastName()); // Вызываем геттер getLastName() из объекта, созданного на основе класса Author

        System.out.println("alexandrPushkin = " + alexandrPushkin); // выводим в консоль объект alexandrPushkin, имеющий метод toString
        System.out.println("Хеш-код для alexandrPushkin = " + alexandrPushkin.hashCode());// выводим в консоль хеш-кода объекта alexandrPushkin

        Author mikhailSholokhov = new Author("Mikhail", "Sholokhov"); // на основе класса Author создаем объект и записываем ссылку на него в объектную переменную mikhailSholokhov
        System.out.println("mikhailSholokhov.getFirstName() = " + mikhailSholokhov.getFirstName()); // Вызываем геттер getFirstName() из объекта, созданного на основе класса Author
        System.out.println("mikhailSholokhov.getLastName() = " + mikhailSholokhov.getLastName()); // Вызываем геттер getLastName() из объекта, созданного на основе класса Author

        System.out.println("mikhailSholokhov = " + mikhailSholokhov); // выводим в консоль объект mikhailSholokhov, имеющий метод toString
        System.out.println("Хеш-код для mikhailSholokhov = " + mikhailSholokhov.hashCode());// выводим в консоль хеш-кода объекта mikhailSholokhov

        Author alexandrBelyaev = new Author("Alexandr", "Belyaev");// из класса Author создаем объект для проверки работы метода equals через сравнение полей firstName
        System.out.println("alexandrBelyaev = " + alexandrBelyaev); // выводим в консоль объект alexandrBelyaev, имеющий метод toString
        System.out.println("Хеш-код для alexandrBelyaev = " + alexandrBelyaev.hashCode());// выводим в консоль хеш-кода объекта alexandrBelyaev

        Book dubrovsky = new Book("Dubrovsky", alexandrPushkin, 1841); // на основе класса Book создаем объект и записываем ссылку на него в объектную переменную dubrovsky
        System.out.println("dubrovsky.getBookName() = " + dubrovsky.getBookName()); // Вызываем геттер getBookName() из объекта, созданного на основе класса Book
        System.out.println("dubrovsky.getAuthor() = " + dubrovsky.getAuthor()); // Вызываем геттер getBookName() из объекта, созданного на основе класса Book
        System.out.println("dubrovsky.getPublishingYear() = " + dubrovsky.getPublishingYear()); // Вызываем геттер getPublishingYear() из объекта, созданного на основе класса Book
        System.out.println("dubrovsky = " + dubrovsky); // выводим в консоль объект dubrovsky, имеющий метод toString
        System.out.println("Хеш-код для dubrovsky = " + dubrovsky.hashCode());// выводим в консоль хеш-кода объекта dubrovsky
        System.out.println("Сравнение объектов alexandrPushkin и alexandrBelyaev методом equals. Результат: " + alexandrPushkin.equals(alexandrBelyaev));

        Book tihiyDon = new Book("Tihiy Don", mikhailSholokhov, 1928); // на основе класса Book создаем объект и записываем ссылку на него в объектную переменную tihiyDon
        System.out.println("tihiyDon.getBookName() = " + tihiyDon.getBookName()); // Вызываем геттер getBookName() из объекта, созданного на основе класса Book
        System.out.println("tihiyDon.getAuthor() = " + tihiyDon.getAuthor()); // Вызываем геттер getBookName() из объекта, созданного на основе класса Book
        System.out.println("tihiyDon.getPublishingYear() = " + tihiyDon.getPublishingYear()); // Вызываем геттер getPublishingYear() из объекта, созданного на основе класса Book
        System.out.println("tihiyDon = " + tihiyDon); // выводим в консоль объект tihiyDon, имеющий метод toString
        System.out.println("Хеш-код для tihiyDon = " + tihiyDon.hashCode());// выводим в консоль хеш-кода объекта tihiyDon

        Book vecnyKhleb = new Book("Vechny Khleb", alexandrBelyaev, 1928); //из класса Book создаем объект для проверки работы метода equals через сравнение полей publishingYear
        System.out.println("vecnyKhleb = " + vecnyKhleb); // выводим в консоль объект vecnyKhleb, имеющий метод toString
        System.out.println("Хеш-код для vecnyKhleb = " + vecnyKhleb.hashCode());// выводим в консоль хеш-кода объекта vecnyKhleb

        System.out.println("Сравнение объектов tihiyDon и vecnyKhleb методом equals. Результат: " + tihiyDon.equals(vecnyKhleb));

        tihiyDon.setPublishingYear(1940); // измение года публикации книги tihiyDon с помощью сеттера.
        System.out.println("tihiyDon.getPublishingYear() = " + tihiyDon.getPublishingYear()); // Вызываем геттер getPublishingYear() из объекта, созданного на основе класса Book
    }
}