package com.example.wuji.geekmeizhi.Presenter;

import com.example.wuji.geekmeizhi.Model.Bean.Bean;
import com.example.wuji.geekmeizhi.Model.Data.GetData;
import com.example.wuji.geekmeizhi.Model.Data.GetDataImp;

import java.util.List;

/**
 * Created by wuji on 16-9-28.
 */

public class MpresenterImp implements Mpresenter.presenter {


    private Mpresenter.Dataloding mdataloding;
    private GetDataImp mGetDataImp=new GetDataImp();

    public MpresenterImp(Mpresenter.Dataloding dataloding){

        mdataloding=dataloding;
    }


    @Override
    public  void getgirls(String type, int count, int page, final boolean Isrefresh){

        mGetDataImp.getgirls(type, count, page,new  GetData.LoadingMore(){


            @Override
            public void onGirlsLoaded(List<Bean.ResultsBean> datas){
                if(Isrefresh){

                        mdataloding .refresh(datas);}
                else{

                        mdataloding.lodingmore(datas);}

            }






        } );


    }



}
