package com.lbm100.showhideui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button ;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

    }

    public  void onClick(View view) {

        if (textView.getVisibility() == View.GONE) {

            textView.setVisibility(View.VISIBLE);

        }else {

            textView.setVisibility(View.GONE);
        }

    }






}
