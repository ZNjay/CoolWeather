package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    //添加方法，使用OkHttp来发送HTTP请求的功能
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        //创建OkHttp实例
        OkHttpClient client = new OkHttpClient();
        //要想发一条HTTP请求，就需要创建一个Request对象
        Request request = new Request.Builder().url(address).build();
        //然后调用newCall()方法来创建一个Call对象，并调用它的execte()方法发送请求
        //并获取服务器返回的数据
        client.newCall(request).enqueue(callback);
    }
}
