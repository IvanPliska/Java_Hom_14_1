package ru.netology.javaqa38.Homework_13_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    Book book_1 = new Book(1, "Piter Pan", 150, "Ivan Petrov");
    Book book_2 = new Book(2, "Mike and Molly", 350, "Ilya Kirov");
    Book book_3 = new Book(3, "Summer", 210, "Lidia Komarova");

    Smartphone smartphone_1 = new Smartphone(1, "Iphone13", 60_000);
    Smartphone smartphone_2 = new Smartphone(2, "Iphone12", 45_000);
    Smartphone smartphone_3 = new Smartphone(3, "Iphone10", 25_000);

    Product product_1 = new Product(1, "Iphone", 60);

    @Test

    public void findBookWithoutName() {
        manager.add(book_1);
        manager.add(book_2);
        manager.add(book_3);

        Product[] actual = manager.searchBy("Oleg");
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void findBookForNameBook1() {
        manager.add(book_1);
        manager.add(book_2);
        manager.add(book_3);

        Product[] actual = manager.searchBy("Piter");
        Product[] expected = {book_1};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void findBookForNameBook2() {
        manager.add(book_1);
        manager.add(book_2);
        manager.add(book_3);

        Product[] actual = manager.searchBy("Mike");
        Product[] expected = {book_2};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void findBookForNameBook3() {
        manager.add(book_1);
        manager.add(book_2);
        manager.add(book_3);

        Product[] actual = manager.searchBy("Summer");
        Product[] expected = {book_3};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void findSmartphoneWithoutName() {
        manager.add(smartphone_1);
        manager.add(smartphone_2);
        manager.add(smartphone_3);

        Product[] actual = manager.searchBy("Sony");
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void findSmartphone_1() {
        manager.add(smartphone_1);
        manager.add(smartphone_2);
        manager.add(smartphone_3);

        Product[] actual = manager.searchBy("Iphone");
        Product[] expected = {smartphone_1, smartphone_2,smartphone_3};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void findAll() {
        manager.add(smartphone_1);
        manager.add(smartphone_2);
        manager.add(smartphone_3);
        manager.add(book_1);
        manager.add(book_2);
        manager.add(book_3);
        manager.add(product_1);

        Product[] actual = manager.searchBy("13");
        Product[] expected = {smartphone_1};

        assertArrayEquals(expected, actual);
    }
}
