public class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPg(Movie[] movies) {
        Movie[] movieRatingPg = new Movie[movies.length];
        int value = 0;
        for (Movie pgMovie : movies) {
            if (pgMovie.rating.equals("PG")) {
                movieRatingPg[value] = pgMovie;
                value += 1;
            }
        }
        return movieRatingPg;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie[] movies = new Movie[4];
        movies[0] = new Movie("goodMovie", "abStudio", "PG");
        movies[1] = new Movie("superMovie", "ab1Studio", "PG");
        movies[2] = new Movie("niceMovie", "ab2Studio", "hi");
        movies[3] = new Movie("wonderMovie", "ab3Studio", "PG");
        Movie[] movieRatingPg = Movie.getPg(movies);
        System.out.println("The movies with PG rating are");
        for (Movie pgMovie : movieRatingPg) {
            if (pgMovie != null)
                System.out.println(pgMovie.title);
        }


    }

}
