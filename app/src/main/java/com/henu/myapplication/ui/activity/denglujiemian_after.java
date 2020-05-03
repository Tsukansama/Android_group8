package com.henu.myapplication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import android.annotation.SuppressLint;
import android.os.Bundle;

import com.henu.myapplication.ui.Adapters.ListViewAdapter;
import com.henu.myapplication.ui.Adapters.LooperPagerAdapter;
import com.henu.myapplication.R;
import com.henu.myapplication.beans.Datas;
import com.henu.myapplication.beans.ItemBean;

import java.util.ArrayList;
import java.util.List;

public class denglujiemian_after extends AppCompatActivity {
    private List<ItemBean> mData;
    private RecyclerView mlist;
    private LooperPagerAdapter mLooperPagerAdapter;
    private static List<Integer>sPics = new ArrayList<>();
    private ViewPager mloopPager;

    static{
        sPics.add(R.mipmap.lunbo1);
        sPics.add(R.mipmap.lunbo2);
    }
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denglujiemian_after);
        mlist = (RecyclerView) this.findViewById(R.id.recycler_view);
        initView();
        initData();
    }

    //这个方法用于初始化模拟数据
    private void initData() {
        //List<databata>-----adapeter-----setadapter------展示数据
        mData = new ArrayList<>();
        for (int i = 0; i < Datas.icons.length; i++) {
            ItemBean data = new ItemBean();
            data.icon = Datas.icons[i];
            data.title = "我是第" + i + "个条目";
            //添加到集合里
            mData.add(data);
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mlist.setLayoutManager(layoutManager);
        ListViewAdapter adapter = new ListViewAdapter(mData);
        mlist.setAdapter(adapter);


    }
    private void initView() {
        mloopPager = (ViewPager) this.findViewById(R.id.looper_pager);
        mLooperPagerAdapter =new LooperPagerAdapter();
        mLooperPagerAdapter.setData(sPics);
        mloopPager.setAdapter(mLooperPagerAdapter);


    }
}
