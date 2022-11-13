
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import ru.netology.repositories.FilmRepository;

public class FilmRepositoryTest {

    Film film1 = new Film("Batman");
    Film film2 = new Film("Avengers");
    Film film3 = new Film("King of lions");
    Film film4 = new Film("Lebovsky");
    Film film5 = new Film("Top Gun");
    Film film6 = new Film("Brothers in Arms");
    Film film7 = new Film("Shortgun");
    Film film8 = new Film("Lost");
    Film film9 = new Film("Mickey Mouse");
    Film film10 = new Film("Cats and Dogs");
    Film film11 = new Film("Colombo");
    Film film12 = new Film("Sherlock");

    @Test
    public void shouldAddFilm() {
        FilmRepository repo = new FilmRepository();
        repo.addFilm(film1);
        repo.addFilm(film2);
        repo.addFilm(film3);
        repo.addFilm(film4);
        repo.addFilm(film5);
        repo.addFilm(film6);
        Film[] expected = {film1, film2, film3, film4, film5, film6};
        Film[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmRepository repo = new FilmRepository();
        repo.addFilm(film1);
        repo.addFilm(film2);
        repo.addFilm(film3);
        repo.addFilm(film4);
        repo.addFilm(film5);
        repo.addFilm(film6);
        Film[] expected = {film6, film5, film4, film3, film2};
        Film[] actual = repo.findLast(5);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast1() {
        FilmRepository repo = new FilmRepository();
        repo.addFilm(film1);
        repo.addFilm(film2);
        repo.addFilm(film3);
        repo.addFilm(film4);
        repo.addFilm(film5);
        repo.addFilm(film6);
        repo.addFilm(film7);
        repo.addFilm(film8);
        repo.addFilm(film9);
        repo.addFilm(film10);
        repo.addFilm(film11);
        repo.addFilm(film12);

        Film[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};
        Film[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast2() {
        FilmRepository repo = new FilmRepository();
        repo.addFilm(film1);
        repo.addFilm(film2);
        repo.addFilm(film3);
        repo.addFilm(film4);
        repo.addFilm(film5);
        repo.addFilm(film6);
        repo.addFilm(film7);


        Film[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Film[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
