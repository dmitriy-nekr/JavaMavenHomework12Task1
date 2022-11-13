package ru.netology.domain;

public class Film {
    private String filmName;

    public Film() {

    }

    public Film(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}
