package movie;

public class Movie {



private static int totalMovie = 0;



private String title;

private String director;

private int year;



public Movie (String title, String director, int year) {

this.title = title;

this.director = director;

this.year = year;
    
totalMovie++;
}

public void displayMovieDetails() {

System.out.println("Title:" + title);
System.out.println( "Director :"+director);
System.out.println("Year:" + year);
}

public static int getTotalMovies() {
    return totalMovie;
}

}
