package pattern01_iterator;

import java.util.Iterator;

/**
 * Author: Rivers
 * Date: 2017/11/17 21:49
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return books.length;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
