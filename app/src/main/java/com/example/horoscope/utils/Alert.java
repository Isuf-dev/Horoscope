package com.example.horoscope.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.horoscope.R;

public class Alert {

    private AlertDialog alertDialog;
    private final ImageView alertIcon;
    private final TextView alertTitle;
    private final TextView alertMessage;
    private Button alertButton;

    @SuppressLint({"SetTextI18n", "ResourceAsColor"})
    public Alert(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LinearLayout layout = new LinearLayout(activity);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(50, 50, 50, 50);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundResource(R.drawable.background_warning);

        alertIcon = new ImageView(activity);
        alertIcon.setLayoutParams(new LinearLayout.LayoutParams(
                100,
                100
        ));

        alertTitle = new TextView(activity);
        alertTitle.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        alertTitle.setTextSize(18);
        alertTitle.setGravity(Gravity.CENTER);

        alertMessage = new TextView(activity);
        alertMessage.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        alertMessage.setGravity(Gravity.CENTER);

        alertButton = new Button(activity);
        alertButton.setText("Close");
        alertButton.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        alertButton.setOnClickListener(v -> alertDialog.dismiss());

        layout.addView(alertIcon);
        layout.addView(alertTitle);
        layout.addView(alertMessage);
        layout.addView(alertButton);

        builder.setView(layout);
        builder.setCancelable(true);

        alertDialog = builder.create();
    }

    public void showAlert(String title, String message, Drawable icon) {
        if (alertDialog != null) {
            if (icon != null) alertIcon.setImageDrawable(icon);
            alertTitle.setText(title);
            alertMessage.setText(message);
            alertDialog.show();
        }
    }
}