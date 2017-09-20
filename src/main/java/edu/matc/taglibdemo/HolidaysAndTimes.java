package edu.matc.taglibdemo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.util.Map;
import java.util.TreeMap;

public class HolidaysAndTimes {
    private Map<String, String> holidaysLlist;
    private String holidayMessage;
    private LocalTime currentTime;
    private String greeting = "";

    public HolidaysAndTimes() {
        this.creatingListofHolidays();
    }

    private void creatingListofHolidays() {
        holidaysLlist = new TreeMap<>();
        holidaysLlist.put("--01-01", "New Years Day");
        holidaysLlist.put("--01-16", "Martin Luther King Jr. Day");
        holidaysLlist.put("--05-29", "Memorial Day");
        holidaysLlist.put("--07-04", "Independence Day");
        holidaysLlist.put("--09-04", "Labor Day");
        holidaysLlist.put("--11-23", "Thanksgiving");
        holidaysLlist.put("--12-24", "Christmas Eve");
        holidaysLlist.put("--12-25", "Christmas Day");
        holidaysLlist.put("--12-31", "New Year's Eve Day");
    }

    public String checkingForHoliday(String currentDate) {
        holidayMessage = "";
        if (holidaysLlist.containsKey(currentDate)) {
            holidayMessage = ", Happy " + holidaysLlist.get(currentDate);
        }

        return holidayMessage;
    }

    public String checkingForTime(String time) {

        currentTime = LocalTime.parse(time);
        String evening = "17:59";
        String night = "19:59";

        if (currentTime.isBefore(LocalTime.NOON)) {
            greeting = "Good morning";
        } else if(currentTime.isAfter(LocalTime.NOON) && currentTime.isBefore(LocalTime.parse(evening))) {
            greeting = "Good afternoon";
        } else if(currentTime.isAfter(LocalTime.parse(evening)) && currentTime.isBefore(LocalTime.parse(night))) {
            greeting = "Good evening";
        } else {
            greeting = "Good night";
        }
        return  greeting;
    }
}
