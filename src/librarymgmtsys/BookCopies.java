package librarymgmtsys;

import java.util.Date;

public class BookCopies {
    private String bookCopyID;

    private Date borrowedDate;

    public BookCopies(String bookCopyID,Date borrowedDate){
        this.bookCopyID = bookCopyID;
        this.borrowedDate = borrowedDate;
    }

    public String getBookCopyID() {
        return bookCopyID;
    }

    public void setBookCopyID(String bookCopyID) {
        this.bookCopyID = bookCopyID;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    @Override
    public String toString() {
        return "BookCopies{" +
                "bookCopyID='" + bookCopyID + '\'' +
                ", borrowedDate=" + borrowedDate +
                '}';
    }
}
