package com.teamsavezone.smartcart;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);

        RealmConfiguration expConfig = new RealmConfiguration.Builder().build();
        RealmConfiguration userConfig = new RealmConfiguration.Builder().build();

        Realm.setDefaultConfiguration(expConfig);
        Realm.setDefaultConfiguration(userConfig);
    }
}