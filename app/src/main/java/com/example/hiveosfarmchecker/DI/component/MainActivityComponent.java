package com.example.hiveosfarmchecker.DI.component;

import com.example.hiveosfarmchecker.DI.interfaces.AppScope;
import com.example.hiveosfarmchecker.DI.module.MainActivityModule;
import com.example.hiveosfarmchecker.DI.module.ModelModule;
import com.example.hiveosfarmchecker.MainActivity;

import dagger.Component;

@AppScope
@Component(modules = {MainActivityModule.class, ModelModule.class})

public interface MainActivityComponent {
    void injectMainActivity(MainActivity mainActivity);
}
