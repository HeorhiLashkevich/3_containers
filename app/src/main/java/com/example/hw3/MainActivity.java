package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.edittext);
        ImageView imageView = findViewById(R.id.imageView);
        Button imageButton =
                findViewById(R.id.imageButton);
        View.OnClickListener onClickListener = view -> {
            try {
                Picasso.get().load(editText.getText().toString()).into(imageView);
                if (imageView.getDrawable() == null) {
                    Toast.makeText(getApplicationContext(), "Wrong link1",
                                    Toast.LENGTH_SHORT)
                            .show();
                }
            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "Empty link",
                                Toast.LENGTH_SHORT)
                        .show();

            }
        };
        imageButton.setOnClickListener(onClickListener);
    }

}