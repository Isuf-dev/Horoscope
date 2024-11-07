package com.example.horoscope;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

        startupNextBtn = findViewById(R.id.startup_next_btn);

        startupNextBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingInflatedId")
            @Override
            public void onClick(View v) {
                username = findViewById(R.id.editTxtName);
                surname = findViewById(R.id.editTxtSurname);
                userDescription = findViewById(R.id.editTxtDescription);
                System.setProperty("username",username.toString());
                System.setProperty("surname",surname.toString());
                System.setProperty("userDescription",userDescription.toString());
                setContentView(R.layout.activity_zodiac_sign);
            }
        });




    }
}
