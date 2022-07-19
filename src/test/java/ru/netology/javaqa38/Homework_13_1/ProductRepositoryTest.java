package ru.netology.javaqa38.Homework_13_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    ProductRepository repository = new ProductRepository();

    Book book_1 = new Book(1, "Piter Pan", 150, "Ivan Petrov");
    Book book_2 = new Book(2, "Mike and Molly", 350, "Ilya Kirov");
    Book book_3 = new Book(3, "Summer", 210, "Lidia Komarova");

    Smartphone smartphone_1 = new Smartphone(1, "Iphone", 60_000);
    Smartphone smartphone_2 = new Smartphone(2, "Siemens", 45_000);
    Smartphone smartphone_3 = new Smartphone(3, "Nokia", 25_000);

    Product product_1 = new Product(1,"Iphone", 60_0000);

    @Test
    public void findAllBook () {
        repository.add(book_1);
        repository.add(book_2);
        repository.add(book_3);

        Product[] actual = {book_1,book_2,book_3};
        Product[] expected = repository.findAll();

        assertArrayEquals(actual,expected);
    }

    @Test
    public void findAllSmartphone () {
        repository.add(smartphone_1);
        repository.add(smartphone_2);
        repository.add(smartphone_3);

        Product[] actual = {smartphone_1,smartphone_2,smartphone_3};
        Product[] expected = repository.findAll();

        assertArrayEquals(actual,expected);
    }

    @Test

    public void removeBook () {
        repository.add(book_1);
        repository.add(book_2);
        repository.add(book_3);
        repository.removeById(book_1.getId());

        Product[] actual = {book_2,book_3};
        Product[] expected = repository.findAll();

        assertArrayEquals(actual,expected);
    }

    @Test

    public void showProductAll() {
        repository.add(product_1);
        repository.add(book_1);
        repository.add(book_2);
        repository.add(book_3);
        repository.add(smartphone_1);
        repository.add(smartphone_2);
        repository.add(smartphone_3);


        Product[] actual = {product_1, book_1,book_2, book_3, smartphone_1, smartphone_2, smartphone_3};
        Product[] expected = repository.findAll();

        assertArrayEquals(actual,expected);
    }

}
