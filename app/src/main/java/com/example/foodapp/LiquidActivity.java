/*
 * Food App
 * https://www.instagram.com/adityatprtma/
 * Created on 08-march-2023.
 * Created by : Adityatprtma
 */
package com.example.foodapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.cuberto.liquid_swipe.LiquidPager;


public class LiquidActivity extends AppCompatActivity {
    public Button btn;
    LiquidPager pager;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquid);

        pager=findViewById(R.id.pager);
        viewPager=new ViewPager(getSupportFragmentManager(),1);
        pager.setAdapter(viewPager);
    }
}