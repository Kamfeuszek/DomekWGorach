package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button likebutton;
    private Button deleteButton;
    private TextView likesView;
    private int countLikes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likebutton = findViewById(R.id.likeButton);
        deleteButton = findViewById(R.id.deleteButton);
        likesView = findViewById(R.id.likesView);

        likebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countLikes++;
                updateCountLikes();
            }
        });
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(countLikes > 0) {
                    countLikes--;
                }
                updateCountLikes();
            }
        });
    }
    public void updateCountLikes() {
        likesView.setText(countLikes + " polubień");
    }
}