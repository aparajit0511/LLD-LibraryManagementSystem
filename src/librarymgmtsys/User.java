package librarymgmtsys;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userID;

    private String userName;
    private List<Integer> borrowedBook = new ArrayList<>(5);

    public User(String userID,String userName){
        this.userID = userID;
        this.userName = userName;
//        this.borrowedBook = borrowedBook;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    public List<Integer> getBorrowedBook() {
//        return borrowedBook;
//    }
//
//    public void setBorrowedBook(List<Integer> borrowedBook) {
//        this.borrowedBook = borrowedBook;
//    }


    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", borrowedBook=" + borrowedBook +
                '}';
    }
}
