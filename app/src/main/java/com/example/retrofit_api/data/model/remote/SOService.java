package com.example.retrofit_api.data.model.remote;

import com.example.retrofit_api.data.model.model.SOAnswersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {

        /*
                @Path biến thay thế cho API endpoint
                @Query	xác định tên khoá truy vấn với giá trị của tham số được chú thích
                @Body	payload cho việc gọi POST
                @Header	thiết lập header với giá trị của tham số được chú thích
         */

        @GET("/answers?order=desc&sort=activity&site=stackoverflow")
        Call<SOAnswersResponse> getAnswers();

        @GET("/answers?order=desc&sort=activity&site=stackoverflow")
        Call<SOAnswersResponse> getAnswers(@Query("tagged") String tags);
}
