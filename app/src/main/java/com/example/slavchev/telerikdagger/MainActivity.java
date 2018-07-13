package com.example.slavchev.telerikdagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.slavchev.telerikdagger.data.LocalData;
import com.example.slavchev.telerikdagger.data.base.BaseData;
import com.example.slavchev.telerikdagger.data.models.Superhero;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public BaseData<Superhero> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.injectDependencies();
        data.getAll();
    }

    private void injectDependencies() {
        ((TelerikDaggerApplication)getApplication()).getComponent().inject(this) ;
    }
}
