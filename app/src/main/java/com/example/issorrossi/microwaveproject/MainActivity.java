package com.example.issorrossi.microwaveproject;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image;
    TextView tvDisplay;
    String timer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creates instance of TextView, linking to XML
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);

        //Creates instance of image but does not set it yet.
        image = (ImageView) findViewById(R.id.imagePop);
        image.setImageResource(R.mipmap.popcornplease);
        image.setVisibility(View.INVISIBLE);

        //Creates all instances to buttons. Links to XML
        Button btnOne = (Button) findViewById(R.id.btn1);
        btnOne.setOnClickListener(this);
        Button btnTwo = (Button) findViewById(R.id.btn2);
        btnTwo.setOnClickListener(this);
        Button btnThree = (Button) findViewById(R.id.btn3);
        btnThree.setOnClickListener(this);
        Button btnFour = (Button) findViewById(R.id.btn4);
        btnFour.setOnClickListener(this);
        Button btnFive = (Button) findViewById(R.id.btn5);
        btnFive.setOnClickListener(this);
        Button btnSix = (Button) findViewById(R.id.btn6);
        btnSix.setOnClickListener(this);
        Button btnSeven = (Button) findViewById(R.id.btn7);
        btnSeven.setOnClickListener(this);
        Button btnEight = (Button) findViewById(R.id.btn8);
        btnEight.setOnClickListener(this);
        Button btnNine = (Button) findViewById(R.id.btn9);
        btnNine.setOnClickListener(this);
        Button btnZero = (Button) findViewById(R.id.btn0);
        btnZero.setOnClickListener(this);
        Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
        Button btnStop = (Button) findViewById(R.id.btnStop);
        btnStop.setOnClickListener(this);
    }

    // uses one event handler to listen to all buttons and perform action if clicked
    @Override
    public void onClick(View v){

        //listens to each button id when pressed
        switch (v.getId()){

            case R.id.btn1:
                timer += "1";
                tvDisplay.setText(timer);
                break;
            case R.id.btn2:
                timer += "2";
                tvDisplay.setText(timer);
                break;
            case R.id.btn3:
                timer += "3";
                tvDisplay.setText(timer);
                break;
            case R.id.btn4:
                timer += "4";
                tvDisplay.setText(timer);
                break;
            case R.id.btn5:
                timer += "5";
                tvDisplay.setText(timer);
                break;
            case R.id.btn6:
                timer += "6";
                tvDisplay.setText(timer);
                break;
            case R.id.btn7:
                timer += "7";
                tvDisplay.setText(timer);
                break;
            case R.id.btn8:
                timer += "8";
                tvDisplay.setText(timer);
                break;
            case R.id.btn9:
                timer += "9";
                tvDisplay.setText(timer);
                break;
            case R.id.btn0:
                timer += "0";
                tvDisplay.setText(timer);
                break;
            case R.id.btnStart:
                timer();
                image.setVisibility(View.VISIBLE);
                timer = "";
                break;
            case R.id.btnStop:
                timer = "";
                tvDisplay.setText("");
                break;

        }
    }
    //Method to use a timer
    //Had to put object in a void method because CountDownTimer does
    //not allow dynamic variable changes.
    public void timer() {
        timer = timer + "000";
        long sum = Long.parseLong(timer);

        //creates instance of timer object
        CountDownTimer timerCount = new CountDownTimer(sum, 1000) {

            public void onTick(long millisUntilFinished) {
                tvDisplay.setText("" + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                tvDisplay.setText("done!");
                image.setVisibility(View.INVISIBLE);
            }


        }.start();
    }
}
