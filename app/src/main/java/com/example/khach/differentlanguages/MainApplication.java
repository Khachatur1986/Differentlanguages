package com.example.khach.differentlanguages;

import android.app.Application;

import com.example.khach.differentlanguages.helper.LocaleHelper;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        LocaleHelper.setStoredLanguage(this, "en");
        super.onCreate();
    }
}
