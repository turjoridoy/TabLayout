package com.ridoy.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.ridoy.tablayout.adapter.ViewPagerAdapter;
import com.ridoy.tablayout.fragment.CallFragment;
import com.ridoy.tablayout.fragment.ChatFragment;
import com.ridoy.tablayout.fragment.ContactFragment;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        setSupportActionBar(toolbar);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ChatFragment(), "CHAT");
        adapter.addFragment(new CallFragment(), "CALL");
        adapter.addFragment(new ContactFragment(), "CONTACT");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
