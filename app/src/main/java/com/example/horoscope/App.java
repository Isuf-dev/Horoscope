package com.example.horoscope;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.horoscope.utils.Alert;

public class App extends AppCompatActivity {

    //TODO add a separator to distinct the different values of preferences when written as concatenated string to System.properties
    EditText username;
    EditText surname;
    EditText userDescription;

    Button firstButton;
    Button secondButton;
    Button startupNextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//     TODO set after the button is clicked   setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_startup);
        Activity currentActivity = this;

        startupNextBtn = findViewById(R.id.preferences_next_btn);

        startupNextBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"MissingInflatedId", "UseCompatLoadingForDrawables"})
            @Override
            public void onClick(View v) {
                username = findViewById(R.id.editTxtName);
                surname = findViewById(R.id.editTxtSurname);
                userDescription = findViewById(R.id.editTxtDescription);

                if (username.getText().toString().trim().isEmpty() || username.getText().toString().trim().isBlank() ||
                        surname.getText().toString().trim().isEmpty() || surname.getText().toString().trim().isBlank() ||
                        userDescription.getText().toString().trim().isEmpty() || userDescription.getText().toString().trim().isBlank()) {
                    Alert customAlert = new Alert(currentActivity);
                    customAlert.showAlert("Warning",
                            "You Have to fill all the fields",
                            getDrawable(R.drawable.icon_warning));
                } else {
                    System.setProperty("username", username.toString());
                    System.setProperty("surname", surname.toString());
                    System.setProperty("userDescription", userDescription.toString());
                    setContentView(R.layout.activity_preferences);
                }
            }
        });

    }
}
