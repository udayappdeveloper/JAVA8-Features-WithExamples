package com.dateandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExamples {

	public static void main(String[] args) {
		// getTheCurrentDate();
		// getTheCurrentTime();
		// getCurrentDateAndTime();
		// getCuurentDateAndTimeInOneFormat();

		// printMonthDaySecond();
		// printSomeSpecificDate();

		// getCurrentZonedDateAndTime();

		// getZonedDateAndTime();
		//checkingPeriod();
		checkingDuration();
	}

	private static void getTheCurrentDate() {
		LocalDate date = LocalDate.now();
		System.out.println("the current date is " + date);
	}

	private static void getTheCurrentTime() {
		LocalTime time = LocalTime.now();
		System.out.println("the current time is " + time);
	}

	private static void getCurrentDateAndTime() {
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : " + current);

	}

	private static void getCuurentDateAndTimeInOneFormat() {
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = current.format(format);
		System.out.println("in formatted manner " + formatedDateTime);
	}

	private static void printMonthDaySecond() {
		LocalDateTime current = LocalDateTime.now();
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int hours = current.getHour();
		int seconds = current.getSecond();
		System.out.println("Month : " + month + " day : " + day + " hours :" + hours + " seconds : " + seconds);
	}

	private static void printSomeSpecificDate() {

		LocalDate date2 = LocalDate.of(1960, 1, 26);
		System.out.println("the republic day :" + date2);

	}

	private static void getCurrentZonedDateAndTime() {

		// Function to get Zoned Date and Time
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedCurrentDate = date.format(format1);

		System.out.println("formatted current Date and" + " Time : " + formattedCurrentDate);

		// to get the current zone
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("the current zone is " + currentZone.getZone());
	}

	private static void getZonedDateAndTime() {

		ZonedDateTime currentZone = ZonedDateTime.now();
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");

		ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);

		System.out.println("tokyo time zone is " + tokyoZone);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatedDateTime = tokyoZone.format(format);

		System.out.println("formatted tokyo time zone " + formatedDateTime);

	}

	private static void checkingPeriod() {

		LocalDate date1 = LocalDate.now();

		LocalDate date2 = LocalDate.of(2016, Month.OCTOBER, 22);

		Period gap = Period.between(date2, date1);
		System.out.println("gap between dates " + "is a period of " + gap.getYears());
	}

	private static void checkingDuration() {

		LocalTime time1 = LocalTime.now();
		System.out.println("the current time is " + time1);

		Duration fiveHours = Duration.ofHours(5);

		// adding five hours to the current
		// time and storing it in time2
		LocalTime time2 = time1.plus(fiveHours);

		//System.out.println("after adding five hours " + "of duration " + time2);

		Duration gap = Duration.between(time2, time1);
		System.out.println("duration gap between time1" + " & time2 is " + gap.getSeconds());
	}

}
