package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Author firstWriter = new Author("�����", "������");
        Book firstBook = new Book("�������", firstWriter,2019 );
        Author secondWriter = new Author("����", "�������");
        Book secondBook = new Book("�����", secondWriter, 2020);

        System.out.println(firstBook);
        System.out.println(secondBook);

        System.out.println("��������� �� ����� ���������? ");
        System.out.println(firstWriter.equals(secondWriter));

        System.out.println("����� ����������? ");
        System.out.println(firstBook.equals(secondBook));

    }
}
