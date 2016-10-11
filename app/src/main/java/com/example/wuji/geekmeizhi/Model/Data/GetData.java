package com.example.wuji.geekmeizhi.Model.Data;

import com.example.wuji.geekmeizhi.Model.Bean.Bean;

import java.util.List;

/**
 * Created by wuji on 16-9-27.
 */

public interface GetData {



    interface LoadingMore{

        void onGirlsLoaded(List<Bean.ResultsBean> datas);
    }


    void  getgirls(String type,int count,int page,LoadingMore call);
}
