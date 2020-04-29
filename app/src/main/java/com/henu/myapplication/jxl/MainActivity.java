package com.henu.myapplication.jxl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

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
        initView();

    }

    private void initView() {
        mloopPager = (ViewPager) this.findViewById(R.id.looper_pager);
        mLooperPagerAdapter =new LooperPagerAdapter();
        mLooperPagerAdapter.setData(sPics);
        mloopPager.setAdapter(mLooperPagerAdapter);


    }
}
