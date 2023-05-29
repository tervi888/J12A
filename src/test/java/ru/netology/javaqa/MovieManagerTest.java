package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void addFilm() {
        MovieManager manager = new MovieManager();
        manager.add("The Bladshot");
        manager.add("Forward");
        manager.add("Hotel");
        manager.add("Gentlemen");
        manager.add("The invisible man");
        manager.add("Troll");
        manager.add("Number one");

        String[] expected = {"The Bladshot", "Forward", "Hotel", "Gentlemen", "The invisible man", "Troll", "Number one"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addFilm1() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addFilm2() {
        MovieManager manager = new MovieManager();
        manager.add("The Bladshot");


        String[] expected = {"The Bladshot"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLimit() {
        MovieManager manager = new MovieManager();

        manager.add("Hotel");
        manager.add("Gentlemen");
        manager.add("The invisible man");
        manager.add("Troll");
        manager.add("Number one");

        String[] expected = {"Number one", "Troll", "The invisible man", "Gentlemen", "Hotel"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLimit1() {
        MovieManager manager = new MovieManager();

        manager.add("Hotel");
        manager.add("Gentlemen");
        manager.add("The invisible man");


        String[] expected = {"The invisible man", "Gentlemen", "Hotel"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLimit3() {
        MovieManager manager = new MovieManager(5);

        manager.add("Forward");
        manager.add("Hotel");
        manager.add("Gentlemen");
        manager.add("The invisible man");
        manager.add("Troll");
        manager.add("Number one");

        String[] expected = {"Number one", "Troll", "The invisible man", "Gentlemen", "Hotel"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
