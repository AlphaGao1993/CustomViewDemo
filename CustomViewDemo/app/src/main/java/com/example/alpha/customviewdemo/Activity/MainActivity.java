package com.example.alpha.customviewdemo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.alpha.customviewdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.wheelDemo)
    Button wheelDemo;
    @BindView(R.id.carousel)
    Button carousel;
    @BindView(R.id.popup_window)
    Button popup_window;
    @BindView(R.id.toggle_button)
    Button toggle_button;
    @BindView(R.id.refeash_button)
    Button refeashButton;
    @BindView(R.id.slide_button)
    Button slideButton;
    @BindView(R.id.oval_button)
    Button ovalButton;
    @BindView(R.id.viewpager_button)
    Button viewpagerButton;
    @BindView(R.id.circle_button)
    Button clrcleButton;
    @BindView(R.id.recycle_button)
    Button recycleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.wheelDemo, R.id.carousel, R.id.popup_window, R.id.toggle_button,
            R.id.refeash_button, R.id.slide_button, R.id.oval_button, R.id.viewpager_button,
            R.id.circle_button,R.id.recycle_button})
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.wheelDemo:
                intent.setClass(this, WheeledMenuActivity.class);
                break;
            case R.id.carousel:
                intent.setClass(this, CarouselActivity.class);
                break;
            case R.id.popup_window:
                intent.setClass(this, PopupWindowActivity.class);
                break;
            case R.id.toggle_button:
                intent.setClass(this, ToggleActivity.class);
                break;
            case R.id.refeash_button:
                intent.setClass(this, RefeathActivity.class);
                break;
            case R.id.slide_button:
                intent.setClass(this, SlideMenuAvtiviy.class);
                break;
            case R.id.oval_button:
                intent.setClass(this, OvalWeatherActivity.class);
                break;
            case R.id.viewpager_button:
                intent.setClass(this, ViewPagerActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                break;
            case R.id.circle_button:
                intent.setClass(this, CircleViewActivity.class);
                break;
            case R.id.recycle_button:
                intent.setClass(this, RecyclerViewActivity.class);
                break;
        }
        startActivity(intent);
    }
}
