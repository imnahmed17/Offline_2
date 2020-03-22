package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private Button button1;
    private ImageView pandaImageView, panda1ImageView, panda2ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button = (Button) findViewById(R.id.prev_Page_ButtonId);
        button1 = (Button) findViewById(R.id.next_Page_ButtonId);
        pandaImageView = (ImageView) findViewById(R.id.pandaId);
        panda1ImageView = (ImageView) findViewById(R.id.panda1Id);
        panda2ImageView = (ImageView) findViewById(R.id.panda2Id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondActivity();
            }
        });

        pandaImageView.setOnClickListener(this);
        panda1ImageView.setOnClickListener(this);
        panda2ImageView.setOnClickListener(this);
    }

    public void secondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.pandaId)
        {
            pandaImageView.setVisibility(View.GONE);
            panda1ImageView.setVisibility(View.VISIBLE);
        }
        else if(v.getId() == R.id.panda1Id)
        {
            panda1ImageView.setVisibility(View.GONE);
            panda2ImageView.setVisibility(View.VISIBLE);
        }
        else if(v.getId() == R.id.panda2Id)
        {
            panda2ImageView.setVisibility(View.GONE);
            pandaImageView.setVisibility(View.VISIBLE);
        }
    }
}