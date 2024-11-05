package com.example.horoscope.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HoroscopeApiClient {

    // Base URL of the horoscope API
    //        daily
    //        monthly
    //        weekly
    private static final String BASE_URL = "https://horoscope-app-api.vercel.app/api/v1/get-horoscope";

    /**
     * Fetches the daily horoscope for the specified sign and day.
     *
     * @param sign The zodiac sign (e.g., Aries, Taurus, Gemini, etc.)
     * @param day  The day for the horoscope (e.g., "YESTERDAY", "TODAY", "TOMORROW", or "YYYY-MM-DD" format)
     * @return The JSON response as a string.
     * @throws Exception if an error occurs during the request.
     */
    public String getDailyHoroscope(String sign, String day) throws Exception {
        String requestUrl = String.format("%s?sign=%s&day=%s", BASE_URL + "/daily", sign, day);

        // Initialize the URL and open a connection
        URL url = new URL(requestUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // Set request method and headers
        conn.setRequestMethod("GET");
        conn.setRequestProperty("accept", "application/json");

        // Check for successful response code (HTTP 200 OK)
        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            return content.toString();  // Return the JSON response as a string
        } else {
            throw new Exception("Failed to fetch horoscope. Response Code: " + responseCode);
        }
    }

    public String getWeeklyHoroscope(String sign) throws Exception {
        String requestUrl = String.format("%s?sign=%s", BASE_URL + "/weekly", sign);

        // Initialize the URL and open a connection
        URL url = new URL(requestUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // Set request method and headers
        conn.setRequestMethod("GET");
        conn.setRequestProperty("accept", "application/json");

        // Check for successful response code (HTTP 200 OK)
        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            return content.toString();  // Return the JSON response as a string
        } else {
            throw new Exception("Failed to fetch horoscope. Response Code: " + responseCode);
        }
    }

    public String getMonthlyHoroscope(String sign) throws Exception {
        String requestUrl = String.format("%s?sign=%s", BASE_URL + "/monthly", sign);

        // Initialize the URL and open a connection
        URL url = new URL(requestUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // Set request method and headers
        conn.setRequestMethod("GET");
        conn.setRequestProperty("accept", "application/json");

        // Check for successful response code (HTTP 200 OK)
        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            return content.toString();  // Return the JSON response as a string
        } else {
            throw new Exception("Failed to fetch horoscope. Response Code: " + responseCode);
        }
    }
}
