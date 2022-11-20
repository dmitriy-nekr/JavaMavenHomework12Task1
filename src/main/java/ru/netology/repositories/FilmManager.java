package ru.netology.repositories;

import ru.netology.domain.Film;

public class FilmManager {
    private Film[] films = new Film[0];
    private int resultLength = 10;

    public FilmManager() {

    }

    public FilmManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void addFilm(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {
        Film[] all = findAll();
        int a = getResultLength();
        if (a > all.length) {
            a = all.length;
        }
        Film[] reversed = new Film[a];
        for (int i = 0; i < a; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public int getResultLength() {
        return resultLength;
    }
}


/*
    public Film[] findLast() {
        Film[] all = findAll();
        Film[] reversed = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}

 */
