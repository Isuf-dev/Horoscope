package com.example.horoscope.utils;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ChatGPTClient {
    private static final String TAG = "ChatGPTClient";
    private static final String API_URL = "https://api.openai.com/v1/engines/gpt-3.5-turbo/completions";
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    private final OkHttpClient client;
    private final String apiKey;

    public ChatGPTClient(String apiKey) {
        this.client = new OkHttpClient();
        this.apiKey = apiKey;
    }

    public String sendPrompt(String prompt) {
        try {
            // Create JSON request body
            JSONObject jsonBody = new JSONObject();
            jsonBody.put("model", "gpt-3.5-turbo");  // Model choice
            JSONArray messagesArray = new JSONArray();
            JSONObject messageObject = new JSONObject();
            messageObject.put("role", "user");
            messageObject.put("content", prompt);
            messagesArray.put(messageObject);
            jsonBody.put("messages", messagesArray);

            RequestBody body = RequestBody.create(jsonBody.toString(), JSON);

            // Create request
            Request request = new Request.Builder()
                    .url(API_URL)
                    .header("Authorization", "Bearer " + apiKey)
                    .post(body)
                    .build();

            // Execute request
            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful() && response.body() != null) {
                    String responseBody = response.body().string();
                    JSONObject responseJson = new JSONObject(responseBody);
                    return responseJson.getJSONArray("choices")
                            .getJSONObject(0)
                            .getJSONObject("message")
                            .getString("content");
                } else {
                    Log.e(TAG, "Request failed: " + response.message());
                    return "Error: " + response.message();
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Exception in sendPrompt: " + e.getMessage());
            return "Exception: " + e.getMessage();
        }
    }
}
