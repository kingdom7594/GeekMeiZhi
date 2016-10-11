package com.example.wuji.geekmeizhi.UI.Meizhi;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.wuji.geekmeizhi.Model.Bean.Bean;
import com.example.wuji.geekmeizhi.R;

import java.util.ArrayList;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

public class GirlDetailActivity extends AppCompatActivity {

    private GirlDetailPaperAdapter mGirlDetailPaperAdapter;
    public ViewPager mViewPager;
    private ArrayList<Bean.ResultsBean> datas;
    int Current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //imageViews= new ArrayList<>();
        datas=getIntent().getParcelableArrayListExtra("girl");
        Current=getIntent().getIntExtra("current",1);
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mGirlDetailPaperAdapter = new GirlDetailPaperAdapter(this,datas,Current);
        mViewPager.setAdapter(mGirlDetailPaperAdapter);
        mViewPager.setCurrentItem(Current);
        //mGirlDetailPaperAdapter.getPrimaryItem();
        //mViewPager.setCurrentItem(Current);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_girl_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
