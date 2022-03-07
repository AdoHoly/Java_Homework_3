package BorrowingPackage;

import BookPackage.Book;
import SubscriberPackage.Subscriber;

import java.time.LocalDate;

public class Borrowing {
    public Borrowing(Book book_borrowed, Subscriber subscriber_borrowing, LocalDate borrowDate){
        this.book_borrowed = book_borrowed;
        this.subscriber_borrowing = subscriber_borrowing;
        this.borrowDate = borrowDate;
    }

    Book book_borrowed;
    Subscriber subscriber_borrowing;
    LocalDate borrowDate;
    LocalDate returnDate;

    public void setReturnDate(LocalDate now) {
        this.returnDate = now;
    }
}
