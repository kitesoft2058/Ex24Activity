package com.kitesoft.ex24activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("Third Activity");

        //제목줄(Actionbar)의 제목(Title)왼쪽에 '뒤로가기'화살표 아이콘이 생기면서 클릭하면 parentActivityName으로 지정된 액티비티로 이동되도록..[Up키라고 부름]
        //AndroidManifest.xml에서 <activity android:name=".ThirdActivity"에 추가 속성으로 android:parentActivityName=".MainActivity" 지정
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
}
