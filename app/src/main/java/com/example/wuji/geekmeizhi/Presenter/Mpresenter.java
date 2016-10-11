package com.example.wuji.geekmeizhi.Presenter;

import com.example.wuji.geekmeizhi.Model.Bean.Bean;

import java.util.List;

/**
 * Created by wuji on 16-9-28.
 */

public interface Mpresenter {


    interface Dataloding{

        void refresh(List<Bean.ResultsBean > datas);
        void lodingmore(List<Bean.ResultsBean> datas);

    }


    interface presenter {

        void getgirls(String type, int count, int page, boolean Isrefresh);


    }
}
