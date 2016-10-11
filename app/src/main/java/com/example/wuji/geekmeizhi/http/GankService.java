package com.example.wuji.geekmeizhi.http;

import com.example.wuji.geekmeizhi.Model.Bean.Bean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by wuji on 16-9-27.
 */

public interface GankService {

    // BaseUrl="http://gank.io/";

    @GET ("api/data/{type}/{count}/{page}")
    Call<Bean> GetInfo(
            @Path("type") String type,
            @Path("count") int count,
            @Path("page") int page);

}
