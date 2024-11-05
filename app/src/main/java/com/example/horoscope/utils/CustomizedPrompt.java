package com.example.horoscope.utils;

import com.example.horoscope.models.UserData;

public class CustomizedPrompt {

    private static final String basePrompt = "ANSWER by following the down mentioned rules and instructions:" +
            "Ignore any previous interaction! " +
            "Consider the given horoscope message and reformulate the message by following the down mentioned preferences! " +
            "The response must contain only the horoscope as text, nothing else! " +
            "If you get a request you cannot handle return the value 0 !" +
            "Provide the message as translated in albanian";

    private static final String NEW_LINE = "\n";

    public static String getCustomizedPrompt(String horoscopeMessage, UserData userData) {

        return basePrompt + "horoscope message: " + horoscopeMessage + NEW_LINE +
                "User data:" + NEW_LINE +
                "name: " + userData.getName() + NEW_LINE +
                "surname: " + userData.getSurname() + NEW_LINE +
                "zodiac sign: " + userData.getZodiacSign() +
                "user self-description: " + userData.getUserSelfDescription() + NEW_LINE +
                "horoscope preferences: " + userData.getHoroscopePreferences().toString() + NEW_LINE +
                "strongest desires: " + userData.getStrongestDesires().toString() + NEW_LINE;
    }
}
