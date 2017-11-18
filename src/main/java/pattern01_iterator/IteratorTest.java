package pattern01_iterator;

import java.util.Iterator;

/**
 * Author: Rivers
 * Date: 2017/11/17 22:01
 */
public class IteratorTest {

    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(5);
        shelf.appendBook(new Book("Core Java"));
        shelf.appendBook(new Book("Effective Java"));
        shelf.appendBook(new Book("Lucene in Action"));
        shelf.appendBook(new Book("Spring in Action"));
        shelf.appendBook(new Book("高性能MySQL"));
        Iterator iterator = shelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
