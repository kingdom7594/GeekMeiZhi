package com.example.wuji.geekmeizhi.UI.Meizhi;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.wuji.geekmeizhi.Model.Bean.Bean;
import com.example.wuji.geekmeizhi.R;

import java.util.ArrayList;
import java.util.List;

import uk.co.senab.photoview.PhotoView;

/**
 * Created by wuji on 16-10-6.
 */

public class GirlDetailPaperAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList<ImageView> imageViews;
    private ArrayList<Bean.ResultsBean> datas;
    private LayoutInflater layoutInflater;
    private View mCurrentView;
    int Current;
    PhotoView photoView;

    public GirlDetailPaperAdapter(Context context, ArrayList<Bean.ResultsBean>  datas,int current) {
        mContext = context;
        this.datas = datas;
        Current=current;
        layoutInflater = LayoutInflater.from(this.mContext);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);

       //position= Current;



        mCurrentView = (View) object;
    }

    public View getPrimaryItem() {
        return mCurrentView;
    }

    @Override
    public View instantiateItem(ViewGroup container, int position) {
        //position=Current;
        //position++;

        photoView=new PhotoView(container.getContext());
        String girlUrl=datas.get(position).getUrl();
        Glide.with(mContext)
                .load(girlUrl)
                .into(photoView);
        ;
        container.addView(photoView);
        return photoView;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

}
