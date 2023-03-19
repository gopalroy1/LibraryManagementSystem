package Gopal.Student_Libraray_Management.DTOs;

import Gopal.Student_Libraray_Management.Enum.Genere;

public class BookResponseDto {
    private String name;
    private int pages;
    private Genere genere;

    //Getter and setters

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

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
    //////////////////////////
}
