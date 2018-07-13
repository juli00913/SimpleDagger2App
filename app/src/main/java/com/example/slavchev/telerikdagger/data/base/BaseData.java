package com.example.slavchev.telerikdagger.data.base;


import io.reactivex.Observable;

public interface BaseData<T>  {

    Observable<T[]> getAll();
    Observable<T> getById(Object id);
    Observable<T> add(T item);

}
