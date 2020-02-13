package com.kitesoft.ex24activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View v){
        // SecondActivity class 실행..
        // SecondActivity에 가서 실행시켜주는 택배아저씨같은 객체 생성 ( Intent )
        Intent intent= new Intent(this, SecondActivity.class);
        startActivity(intent);

        //Activity를 종료(메모리에서 제거)
        finish();
    }

    public void clickBtn2(View v){
        //ThirdActivity class 실행..
        Intent intent= new Intent(this, ThirdActivity.class);
        startActivity(intent);

        //ThirdActivity에서 Up키로 이 MainActivity로 돌아오려면 이 액티비티는 메모리에서 없어지면 안되므로
        //finish()하지 않음.
    }
}
