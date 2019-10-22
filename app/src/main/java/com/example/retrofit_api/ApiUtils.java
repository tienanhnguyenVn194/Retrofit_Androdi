package com.example.retrofit_api;

import com.example.retrofit_api.data.model.remote.RetrofitClient;
import com.example.retrofit_api.data.model.remote.SOService;

public class ApiUtils {

        public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

        public static SOService getSOService() {
            return RetrofitClient.getClient(BASE_URL).create(SOService.class);
        }
    }
