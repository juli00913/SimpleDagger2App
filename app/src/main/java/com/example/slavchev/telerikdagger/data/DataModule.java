package com.example.slavchev.telerikdagger.data;

import android.content.Context;

import com.example.slavchev.telerikdagger.data.base.BaseData;
import com.example.slavchev.telerikdagger.data.models.Superhero;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    private final Context context;

    public DataModule(Context context) {
        this.context = context;
    }

    @Provides
    BaseData<Superhero> provideSuperheroData() {
        return new LocalData<>(context);
    }

}
