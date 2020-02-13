package com.kitesoft.ex24activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //제목줄(ActionBar) 객체를 얻어오기
        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("Second Activity"); //제목줄 제목(Title)변경
    }
}
