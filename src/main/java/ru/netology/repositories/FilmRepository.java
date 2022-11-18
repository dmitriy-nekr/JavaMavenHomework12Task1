package ru.netology.repositories;

import ru.netology.domain.Film;

public class FilmRepository {
    private Film[] films = new Film[0];

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
        int resultLenght = 10;
        if (resultLenght > all.length) {
            resultLenght = all.length;
        }
        Film[] reversed = new Film[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public Film[] findLast(int resultLength) {
        Film[] all = findAll();
        Film[] reversed = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}
