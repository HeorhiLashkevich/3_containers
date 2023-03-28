package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.edittext);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Button imageButton =
                (Button) findViewById(R.id.imageButton);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load(editText.getText().toString()).into(imageView);
            }
        };
        imageButton.setOnClickListener(onClickListener);
    }

}