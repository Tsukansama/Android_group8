package com.henu.myapplication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.henu.myapplication.R;

public class denglujiemian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denglujiemian);
        Button btn_denglujiemian_zc=findViewById(R.id.zhuce);
        btn_denglujiemian_zc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_zc=new Intent(denglujiemian.this,zhuce.class);
                startActivity(intent_zc);
            }
        });
    }
}
