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

}
