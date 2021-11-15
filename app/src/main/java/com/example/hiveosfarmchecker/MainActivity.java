package com.example.hiveosfarmchecker;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hiveosfarmchecker.DI.component.DaggerMainActivityComponent;
import com.example.hiveosfarmchecker.DI.component.MainActivityComponent;
import com.example.hiveosfarmchecker.DI.module.MainActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivityViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityComponent component = DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .build();
        component.injectMainActivity(this);

        TextView textView = findViewById(R.id.hello_tv);
        textView.setText(model.hello());
    }
}