package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreTest {
    public static void main(String [] args) {

        MovieStore showMovies = new MovieStore();
        String movies = showMovies.getMovies().entrySet().stream()
                .flatMap(set -> set.getValue().stream())
                .map(list -> list.toString())
                .collect(Collectors.joining("!"));
        System.out.println(movies);
    }
}
