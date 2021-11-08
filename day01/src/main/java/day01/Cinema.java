package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    List<Movie> movies = new ArrayList<>();

    public void addMovie (Movie movie){
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> moviesAtTime = new ArrayList<>();
        for (Movie film : movies) {
            for (LocalDateTime timeNow : film.timeList) {
                if (timeNow.isEqual(time)) {
                    moviesAtTime.add(film.getTitle());
                }
            }
        }
        return moviesAtTime;
    }
}
