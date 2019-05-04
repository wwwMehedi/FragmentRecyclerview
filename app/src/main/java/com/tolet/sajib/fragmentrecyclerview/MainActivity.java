package com.tolet.sajib.fragmentrecyclerview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tolet.sajib.fragmentrecyclerview.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager viewPager;
private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayoutid);
        viewPager=findViewById(R.id.viewpagerid);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        //Add fragment
        adapter.AddFragment(new Fragmentcall(),"Call");
        adapter.AddFragment(new FragmentContact(),"Contact");
        adapter.AddFragment(new FragmentFav(),"favourite");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.call);
        tabLayout.getTabAt(1).setIcon(R.drawable.contact);
        tabLayout.getTabAt(2).setIcon(R.drawable.fav);
    }
}
