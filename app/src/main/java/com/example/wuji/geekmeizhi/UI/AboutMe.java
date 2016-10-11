package com.example.wuji.geekmeizhi.UI;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.wuji.geekmeizhi.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AboutMe extends AppCompatActivity {


    @BindView(R.id.toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        ButterKnife.bind(this);
        toolbar.setTitle("Kingdom");
        setSupportActionBar(toolbar);




    }
}
