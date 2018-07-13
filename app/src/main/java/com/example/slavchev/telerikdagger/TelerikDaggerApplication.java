package com.example.slavchev.telerikdagger;

import android.app.Application;

import com.example.slavchev.telerikdagger.data.DataModule;

import dagger.Component;

public class TelerikDaggerApplication  extends Application{

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerTelerikDaggerApplication_ApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .dataModule(new DataModule(this))
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }

    @Component(modules = { DataModule.class, ApplicationModule.class })
    public interface ApplicationComponent {
        void inject(MainActivity mainActivity);
    }
}
