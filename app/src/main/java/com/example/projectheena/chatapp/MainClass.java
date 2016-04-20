package com.example.projectheena.chatapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by projectheena on 19/4/16.
 */
public class MainClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
