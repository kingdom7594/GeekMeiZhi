package com.example.wuji.geekmeizhi;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Size;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.example.wuji.geekmeizhi.Model.Bean.Bean;
import com.example.wuji.geekmeizhi.Model.Data.GetData;
import com.example.wuji.geekmeizhi.Presenter.Mpresenter;
import com.example.wuji.geekmeizhi.Presenter.MpresenterImp;
import com.example.wuji.geekmeizhi.UI.AboutMe;
import com.example.wuji.geekmeizhi.UI.Meizhi.GirlDetailActivity;
import com.example.wuji.geekmeizhi.UI.Meizhi.GirlDetailPaperAdapter;
import com.example.wuji.geekmeizhi.UI.Meizhi.GirlsAdaptor;
import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, Mpresenter.Dataloding  {


    @BindView(R.id.toolbar) Toolbar toolbar;
    //@BindView(R.id.fab) FloatingActionButton fab;
    @BindView(R.id.drawer_layout) DrawerLayout drawer;
    @BindView(R.id.nav_view) NavigationView navigationView;
    @BindView(R.id.my_recycler_view) XRecyclerView mRecyclerView;





    ArrayList<Bean.ResultsBean> mdatas ;
    private  GirlsAdaptor mAdapter;
    private MainActivity mainActivity;
    //Mpresenter.Dataloding dataloding;
    private  MpresenterImp MpresenterImp;
    GirlDetailPaperAdapter mGirlDetailPaperAdapter;
    String type="福利";
    int count=20;
    int page=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        mdatas= new ArrayList<>();
        MpresenterImp= new MpresenterImp(this);
        //mGirldetailActivity=new GirlDetailActivity();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);



        //创建默认的线性LayoutManager
        StaggeredGridLayoutManager mLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        //mRecyclerView.setHasFixedSize(true);





        mAdapter=new GirlsAdaptor(this,mdatas);
        mRecyclerView.setAdapter(mAdapter);

        MpresenterImp.getgirls(type, count, page,false);

        //创建并设置Adapter
        mRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {


                MpresenterImp.getgirls(type, count, page,true);
                mRecyclerView.refreshComplete();
            }

            @Override
            public void onLoadMore() {

                if(mdatas.size()%20==0) {

                    page++;
                    MpresenterImp.getgirls(type, count, page, false);
                    mRecyclerView.loadMoreComplete();
                }
            }
        });


        mAdapter.setOnRecyclerClikListener(new GirlsAdaptor.OnRecyclerClikListener() {
            @Override
            public void onItemClick(GirlsAdaptor.ViewHolder viewHolder, int position){

                Intent intent=new Intent(getApplication(),GirlDetailActivity.class);


                if(mdatas.size()>20) {

                    intent.putExtra("current",position + 20 *( page-1));

                }
                else {

                    intent.putExtra("current", position);
                }
                //mGirldetailActivity.mViewPager.setCurrentItem(position);
                intent.putParcelableArrayListExtra("girl",mdatas);
                startActivity(intent);
               // mGirldetailActivity.mViewPager.setCurrentItem(position);
            }

        });


    }



    @Override
    public void refresh(List<Bean.ResultsBean > datas){

        //mdatas.clear();

        mAdapter.replaceData(datas);

    }


    @Override
    public void lodingmore(List<Bean.ResultsBean > datas) {

        mdatas.addAll(datas);
        mAdapter.replaceData( datas);
    }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

            Intent intent=new Intent(this, AboutMe.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action


        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
