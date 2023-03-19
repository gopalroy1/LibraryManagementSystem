package Gopal.Student_Libraray_Management.DTOs;

import Gopal.Student_Libraray_Management.Enum.Genere;

public class BookResquestDto {

    private String name;

    private int pages;

    private Genere genre;

    private int authorId;
    ///////Constructors

    public BookResquestDto() {
    }


    ////Geter and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genere getGenre() {
        return genre;
    }

    public void setGenre(Genere genre) {
        this.genre = genre;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
