package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Author firstWriter = new Author("Борис", "Акунин");
        Book firstBook = new Book("Сулажин", firstWriter,2019 );
        Author secondWriter = new Author("Адам", "Пшехшта");
        Book secondBook = new Book("Адепт", secondWriter, 2020);

        System.out.println(firstBook);
        System.out.println(secondBook);

        System.out.println("Совпадают ли имена писателей? ");
        System.out.println(firstWriter.equals(secondWriter));

        System.out.println("Книги идентичные? ");
        System.out.println(firstBook.equals(secondBook));

    }
}
