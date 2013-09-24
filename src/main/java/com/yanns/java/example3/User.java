package com.yanns.java.example3;

import java.util.Calendar;
import java.util.Date;

public class User {

    private final String name;
    private final String gender;
    private final Date dateOfBirth;

    public User(String name, String gender, Date dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Integer getAge() {
        if (dateOfBirth == null) {
            return null;
        }
        Date now = new Date();
        long difference = now.getTime() - dateOfBirth.getTime();
        Calendar yearCalculator = Calendar.getInstance();
        yearCalculator.setTimeInMillis(difference);
        return yearCalculator.get(Calendar.YEAR);
    }
}
