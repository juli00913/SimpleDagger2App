package com.example.slavchev.telerikdagger.data;

import android.content.Context;

import com.example.slavchev.telerikdagger.data.base.BaseData;

import java.util.ArrayList;

import javax.inject.Inject;

import io.reactivex.Observable;

public class LocalData<T> implements BaseData<T> {

    private final ArrayList<T> items;

    private Context context;

    @Inject
    public LocalData(Context context) {
        this.items = new ArrayList<T>();
        this.context = context;
    }

    @Override
    public Observable<T[]> getAll() {
        return Observable.just((T[])this.items.toArray());
    }

    @Override
    public Observable<T> getById(Object id) {
        return Observable.just(null);
    }

    @Override
    public Observable add(T item) {
        items.add(item);
        return Observable.just(item);
    }
}
