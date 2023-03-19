package Gopal.Student_Libraray_Management.DTOs;

public class IssueBookReqDto {
    private int bookId;
    private int cardId;
    ////Constructors

    public IssueBookReqDto() {
    }
    ////Getter and setters

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
    ////////////////
}
