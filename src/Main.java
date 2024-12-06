import librarymgmtsys.Book;
import librarymgmtsys.BookCopies;
import librarymgmtsys.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Hello world!");
//                create_library <library_id> <no_of_racks>
//                add_book <book_id> <title> <comma_separated_authors> <comma_separated_publishers> <comma_separated_book_copy_ids>
//                remove_book_copy <book_copy_id>
//                borrow_book <book_id> <user_id> <due_date>
//                borrow_book_copy <book_copy_id> <user_id> <due_date>
//                return_book_copy <book_copy_id>
//                print_borrowed <user_id>
//                search <attribute> <attribute_value>
//                Possible values of attribute: book_id, author, publisher
//                exit

        Book book = new Book("book1" , "title1","author1","publisher1");
        String result = book.toString();
        System.out.println(result);

        String dateString = "22-10-2024";

        // Date format matching the string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date publishedDate = dateFormat.parse(dateString);

        BookCopies bookCopies = new BookCopies("book1",publishedDate);

        String result1 = bookCopies.toString();
        System.out.println(result1);

        User user = new User("user1","user1");
        System.out.println(user.toString());
    }
}