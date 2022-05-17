package models;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Contact {

    private String name;
    private String phoneNumber;
    private String dateOfBirth;
    private int age;

    public Contact(String name, String phoneNumber, String dateOfBirth) throws ParseException {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date toDate = formatter.parse(dateOfBirth);// Convert string to date format.
        formatter.setLenient(false);// This will ensuire the date is entered in the specified format
        long toMilli1 = toDate.getTime(); // Convert dateOfBiith to milliseconds since 1970
        long toMilli2 = new Date().getTime(); // Convert today's date to milliseconds since 1970
        long ageMilli = toMilli2 - toMilli1; // age in milliseconds
        long ageInDays = TimeUnit.MILLISECONDS.toDays(ageMilli); // This is the age represented in days
        this.age = (int) (ageInDays / 365); // This is the actual age.

    }

}
