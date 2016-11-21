package net;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import config.AppConfig;
import config.UrlConfig;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 房庆丰 on 2016/11/1.
 */

public class BaseRetorfit {
    private static BaseRetorfit mBaseRetorfit;
    private static Retrofit mRetrofit;

    private BaseRetorfit() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                HttpUrl httpUrl = request.url().newBuilder().build();
                Request.Builder builderReauest = new Request.Builder();
                builderReauest.addHeader("user-agent", "android")
                        .addHeader("Accept", "application/x-www-form-urlencoded")
                        .addHeader("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
                Request newReauest = builderReauest.url(httpUrl).build();
                return chain.proceed(newReauest);
            }
        });
        if (AppConfig.isDebug) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(logging);
        }
        builder.connectTimeout(5000,TimeUnit.SECONDS);
        builder.readTimeout(5000, TimeUnit.SECONDS);
        builder.retryOnConnectionFailure(false);
        OkHttpClient client = builder.build();

        Retrofit.Builder builderRetorfit = new Retrofit.Builder();
        builderRetorfit.baseUrl(UrlConfig.Base_url);
        builderRetorfit.addConverterFactory(GsonConverterFactory.create());
        mRetrofit = builderRetorfit.client(client).build();
    }

    public static void initRetrofit() {
        if (mBaseRetorfit == null) {
            mBaseRetorfit = new BaseRetorfit();
        }
    }

    public static Retrofit getmRetrofit() {
        return mRetrofit;
    }
}
