package com.henu.myapplication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.henu.myapplication.ui.Adapters.LooperPagerAdapter;
import com.henu.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private LooperPagerAdapter mLooperPagerAdapter;
    private static List<Integer>sPics = new ArrayList<>();
    private ViewPager mloopPager;

    static{
        sPics.add(R.mipmap.lunbo1);
        sPics.add(R.mipmap.lunbo2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=findViewById(R.id.button_denglu);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,denglujiemian.class);
                startActivity(intent);
            }
        });
        initView();

    }

    private void initView() {
        mloopPager = (ViewPager) this.findViewById(R.id.looper_pager);
        mLooperPagerAdapter =new LooperPagerAdapter();
        mLooperPagerAdapter.setData(sPics);
        mloopPager.setAdapter(mLooperPagerAdapter);


    }
}
