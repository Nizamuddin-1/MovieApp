package com.example.themovieapp.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.themovieapp.Model.Movie;
import com.example.themovieapp.Model.MovieRepository;
import com.example.themovieapp.serviceapi.MovieApiService;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private MovieRepository repository;

    public MainActivityViewModel(@NonNull @androidx.annotation.NonNull Application application, MovieRepository repository) {
        super(application);
        this.repository =  new MovieRepository(application);
    }
    public LiveData<List<Movie>> getAllMovies(){
        return repository.getMutableLiveData();
    }
}
