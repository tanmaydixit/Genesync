package com.jogdand.genesync;

import android.app.Application;

import io.realm.Realm;

/**
 * @author Rushikesh Jogdand.
 */

public class Genesync extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
