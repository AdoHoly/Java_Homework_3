package BorrowingPackage;

import BookPackage.Book;
import SubscriberPackage.Subscriber;

import java.time.LocalDate;

public class Borrowing {
    public Borrowing(Book book_borrowed, Subscriber subscriber_borrowing, LocalDate borrowing_date){
        this.book_borrowed = book_borrowed;
        this.subscriber_borrowing = subscriber_borrowing;
        this.borrowing_date = borrowing_date;
    }

    Book book_borrowed;
    Subscriber subscriber_borrowing;
    LocalDate borrowing_date;
    LocalDate returnDate;

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
