package com.example.horoscope.models;

import java.util.Arrays;
import java.util.List;

public class UserData {
    String name;
    String surname;
    String zodiacSign;
    String userSelfDescription;
    public List<String> strongestDesires;

    //TODO allow user to pick via radio buttons
    public static final List<String> ZODIAC_SIGNS = Arrays.asList(
            "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo",
            "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"
    );

    //TODO allow user to select via checkboxes
    List<String> horoscopePreferences = List.of("Love & Relationships",
            "Career & Professional Growth",
            "Health & Wellness",
            "Finance & Wealth",
            "Personal Development & Spiritual Growth",
            "Family & Home Life",
            "Friendships & Social Life",
            "Education & Learning Opportunities",
            "Travel & Adventure",
            "Creativity & Hobbies");

    public UserData(String name, String surname, String zodiacSign, String userSelfDescription, List<String> strongestDesires, List<String> horoscopePreferences) {
        this.name = name;
        this.surname = surname;
        this.zodiacSign = zodiacSign;
        this.userSelfDescription = userSelfDescription;
        this.strongestDesires = strongestDesires;
        this.horoscopePreferences = horoscopePreferences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public String getUserSelfDescription() {
        return userSelfDescription;
    }

    public void setUserSelfDescription(String userSelfDescription) {
        this.userSelfDescription = userSelfDescription;
    }

    public List<String> getStrongestDesires() {
        return strongestDesires;
    }

    public void setStrongestDesires(List<String> strongestDesires) {
        this.strongestDesires = strongestDesires;
    }

    public List<String> getHoroscopePreferences() {
        return horoscopePreferences;
    }

    public void setHoroscopePreferences(List<String> horoscopePreferences) {
        this.horoscopePreferences = horoscopePreferences;
    }
}
