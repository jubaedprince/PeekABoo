package com.example.jubaed.peekaboo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button showOrhideButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showOrhideButton = (Button) findViewById(R.id.showOrhideButton);
        showOrhideButton.setText("Show");
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);
    }

    public void showOrhide(View view){
        Button button = (Button) view;
        if(button.getText().toString().equals("Show")){
            imageView.setVisibility(View.VISIBLE);
            showOrhideButton.setText("Hide");
        }else if(button.getText().toString().equals("Hide")){
            imageView.setVisibility(View.INVISIBLE);
            showOrhideButton.setText("Show");
        }
    }
}
