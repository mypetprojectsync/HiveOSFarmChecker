package com.example.hiveosfarmchecker.DI.module;

import androidx.lifecycle.ViewModelProvider;

import com.example.hiveosfarmchecker.MainActivity;
import com.example.hiveosfarmchecker.MainActivityViewModel;

import dagger.Module;
import dagger.Provides;

@Module(includes = MainActivityModule.class)
public class ModelModule {

    @Provides
    public MainActivityViewModel provideModel(MainActivity mainActivity) {
        return new ViewModelProvider(mainActivity).get(MainActivityViewModel.class);
    }
}
