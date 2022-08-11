// Complete-Java II-Arrays Movie Exercise

package Movies;

import Person.Person;

import util.Input;

import java.util.Arrays;

import static Movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void main(String[] args) {
        movies = MoviesArray.findAll();
        showMovies();
    }

    private static Movie[] movies;

    // Method to initiate movie menu and pass through user input
    private static void showMovies() {
        Input input = new Input();
        System.out.println("""
                                
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the sci-fi category
                6 - add a movie
                """);
        String userResponse = input.getString("Enter your choice:");
        int counter = 1;
        // Switch to handle various user inputs
        switch (userResponse) {
            case "1" -> {
                System.out.println("\nAll movies:\n");
                for (int i = 0; i < movies.length; i++) {
                    System.out.println("#" + counter + " " + movies[i].getName() + " -- " + movies[i].getCategory());
                    counter++;
                }
                showMovies();
            }
            case "2" -> {
                System.out.println("\nAnimated movies:\n");
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase("animated")) {
                        System.out.println("#" + counter + " " + movies[i].getName() + " -- " + movies[i].getCategory());
                        counter++;
                    }
                }
                showMovies();
            }
            case "3" -> {
                System.out.println("\nDrama movies:\n");
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(("#" + counter + " " + movies[i].getName() + " -- " + movies[i].getCategory()));
                        counter++;
                    }
                }
                showMovies();
            }
            case "4" -> {
                System.out.println("\nHorror movies:\n");
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equalsIgnoreCase("horror")) {
                        System.out.println("#" + counter + " " + movies[i].getName() + " -- " + movies[i].getCategory());
                        counter++;
                    }
                }
                showMovies();
            }
            case "5" -> {
                System.out.println("\nSci-fi movies:\n");
                for (int i = 0; i < movies.length; i++) {
                    if (findAll()[i].getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println("#" + counter + " " + movies[i].getName() + " -- " + movies[i].getCategory());
                        counter++;
                    }
                }
                showMovies();
            }
            case "6" -> {
                Movie[] newMoviesArray = Arrays.copyOf(movies, movies.length + 1);
                String newMovieName = input.getString("Enter a movie name:");
                String newMovieCat = input.getString("Enter a movie category:");
                newMoviesArray[movies.length] = new Movie(newMovieName, newMovieCat.toLowerCase());
                movies = newMoviesArray;
                showMovies();
            }
            case "0" -> {
                System.out.println("Exiting");
            }
            default -> {
                System.out.println("Invalid input");
                showMovies();
            }
        }
    }
}