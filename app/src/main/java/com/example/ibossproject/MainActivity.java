package com.example.ibossproject;

import android.content.ClipData;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bottomButton1, bottomButton2, bottomButton3;
    private FragmentManager fmgr;
    private MainFragment f1;
    private ItemFragment f2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomButton1 = findViewById(R.id.bottomButton1);
        bottomButton2 = findViewById(R.id.bottomButton2);
        bottomButton3 = findViewById(R.id.bottomButton3);

        fmgr = getSupportFragmentManager();
        f1 = new MainFragment();
        f2 = new ItemFragment();

        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container, f1);
        transaction.commit();
        bottom_btn_color_update(0xa8edfa, 0x72cddd, 0x72cddd);
    }

    private void bottom_btn_color_update(@ColorInt int color1, @ColorInt int color2, @ColorInt int color3)
    {
        bottomButton1.setBackgroundColor(color1 + 0xFF000000);
        bottomButton2.setBackgroundColor(color2 + 0xFF000000);
        bottomButton3.setBackgroundColor(color3 + 0xFF000000);
    }
    public void set_main_fragment_click(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f1);
        transaction.commit();
        bottom_btn_color_update(0xa8edfa, 0x72cddd, 0x72cddd);
    }

    public void set_item_fragment_click(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f2);
        transaction.commit();
        bottom_btn_color_update(0x72cddd, 0xa8edfa, 0x72cddd);
    }
}
