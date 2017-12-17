package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        Button myButton = (Button) findViewById(R.id.askButton);

        final int[] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This code gets executed when the button is pressed

                // Create a random number generator
                Random randomNumberGenerator = new Random();

                // Make the random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(5);

                // grab a random dice image from the diceArray. Then tell the ImageView to display
                // this image
                ballDisplay.setImageResource(ballArray[number]);

                Log.d("magiceightball", "Random number is: " +number);

            }
        });


    }
}
