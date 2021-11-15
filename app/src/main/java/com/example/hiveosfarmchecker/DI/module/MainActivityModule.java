package com.example.hiveosfarmchecker.DI.module;

import android.content.Context;

import com.example.hiveosfarmchecker.DI.interfaces.AppScope;
import com.example.hiveosfarmchecker.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    private final MainActivity mainActivity;
    private final Context context;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        this.context = mainActivity.getBaseContext();
    }

    @Provides

    public MainActivity mainActivity() {
        return mainActivity;
    }

    @AppScope
    @Provides
    public Context context() {
        return context;
    }

}
