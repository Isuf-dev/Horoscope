package com.example.horoscope;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Optional;
import java.util.stream.Stream;

public class App extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Optional<Integer> result = Stream.of(1, 2, 3,6,7,8).map(e -> e * 10).reduce((a, b) -> a + b);
        Integer sum = result.get();
        System.out.println(sum);

    }
}
