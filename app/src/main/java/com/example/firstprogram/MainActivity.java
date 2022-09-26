package com.example.firstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnChangeTextClick(View view) {
        TextView tvMain = (TextView)findViewById(R.id.tvMain);
        tvMain.setText("NEW TEXT");
    }

    public void onBtnChangeTextColor(View view) {
        TextView tvMain = (TextView)findViewById(R.id.tvMain);
        tvMain.setTextColor(Color.rgb(200,0,0));
    }

    //SOME VERY IMPORTANT CHANGES(NO)
    //Some more changes

}