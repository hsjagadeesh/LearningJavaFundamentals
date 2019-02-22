package com.learning.java.dates;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HackerRankExcercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int returnDay = scanner.nextInt();
        int returnMon = scanner.nextInt();
        int returnYear = scanner.nextInt();

        int actualDay = scanner.nextInt();
        int actualMon = scanner.nextInt();
        int actualYear = scanner.nextInt();

        LocalDate returnDate = LocalDate.of(returnYear, returnMon, returnDay);
        LocalDate actualDate = LocalDate.of(actualYear, actualMon, actualDay);

        Period between = Period.between(actualDate, returnDate);
        if(between.getYears() > 0 ) {
            System.out.println(10000);
        } else if(between.getMonths() > 0) {
            System.out.println(500 * between.getMonths());
        } else if(between.getDays() > 0) {
            System.out.println((between.getDays()) * 15);
        } else {
            System.out.println(0);
        }

    }
}
