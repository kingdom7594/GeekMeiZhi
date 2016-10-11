package com.example.wuji.geekmeizhi.UI.Meizhi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wuji.geekmeizhi.Model.Bean.Bean;
import com.example.wuji.geekmeizhi.Presenter.Mpresenter;
import com.example.wuji.geekmeizhi.Presenter.MpresenterImp;
import com.example.wuji.geekmeizhi.R;

import java.util.List;

/**
 * Created by wuji on 16-9-29.
 */

public class GirlsAdaptor extends RecyclerView.Adapter<GirlsAdaptor.ViewHolder>  {

    /**
     * Created by wuji on 16-9-9.
     */

        private List<Bean.ResultsBean> datas;
        private Context mcontext;
        public OnRecyclerClikListener mOnRecyclerClikListener;

        public GirlsAdaptor(Context mcontext ,List<Bean.ResultsBean> datas) {
            this.datas = datas;
            this.mcontext=mcontext;
        }

        //创建新View，被LayoutManager所调用
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item,viewGroup,false);
            ViewHolder vh = new ViewHolder(view);
            return vh;
        }
        //将数据与界面进行绑定的操作
        @Override
        public void onBindViewHolder(final ViewHolder viewHolder, final int position) {

             // viewHolder.mTextView.setText(datas.get(position).getDesc());
            viewHolder.mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mOnRecyclerClikListener != null) {
                        mOnRecyclerClikListener.onItemClick(viewHolder, position);
                    }

                }
            });

            Glide.with(mcontext).
                    load(datas.get(position).getUrl()).
                    //placeholder(R.drawable.github).
                            into(viewHolder.mImageView);

        }


        public void setList(List<Bean.ResultsBean> datas) {
        this.datas = datas;
    }

        public void replaceData(List<Bean.ResultsBean> datas){
             setList(datas);
             notifyDataSetChanged();
        }

        public interface OnRecyclerClikListener{
             void onItemClick(ViewHolder viewHolder, int position);

        }

        public void setOnRecyclerClikListener(OnRecyclerClikListener onRecyclerClikListener){

            this.mOnRecyclerClikListener=onRecyclerClikListener;
        }


        //获取数据的数量
        @Override
        public int getItemCount() {
            return datas.size();
        }


        //自定义的ViewHolder，持有每个Item的的所有界面元素
        public static class ViewHolder extends RecyclerView.ViewHolder {
            public TextView mTextView;
            public ImageView mImageView;
            public ViewHolder(View view){
                super(view);
                mTextView = (TextView) view.findViewById(R.id.text);
                mImageView=(ImageView) view.findViewById(R.id.pic);
            }
        }


}
