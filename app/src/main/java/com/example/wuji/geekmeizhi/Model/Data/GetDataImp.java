package com.example.wuji.geekmeizhi.Model.Data;

import com.example.wuji.geekmeizhi.Model.Bean.Bean;
import com.example.wuji.geekmeizhi.http.GankService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wuji on 16-9-27.
 */

public class GetDataImp implements GetData{

    @Override
    public  void getgirls(String type, int count, int page, final GetData.LoadingMore callback) {
        Retrofit mretrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/")
                .addConverterFactory(GsonConverterFactory.create())
                //.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        GankService service = mretrofit.create(GankService.class);
        Call<Bean> girls = service.GetInfo(type, count, page);


        girls.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {

                List<Bean.ResultsBean> datas = response.body().getResults();
                //myAdapter.replaceData(datas);
                callback.onGirlsLoaded( datas);

            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {

            }
        });

    }
}
