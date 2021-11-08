package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    List<LocalDateTime> timeList = new ArrayList<>();

    public Movie(String title, List<LocalDateTime> timeList) {
        this.title = title;
        this.timeList = timeList;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getTimeList() {
        return timeList;
    }
}
