package com.example.themovieapp.serviceapi;

import com.example.themovieapp.Model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    // acts as bridge b/w your app and api
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_kay") String apiKey);
}
