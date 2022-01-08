package com.example.instagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LXfw0IRnQ46p39Cv0Jc69a5L3MFF01kyGjq8iJZm")
                .clientKey("VN3HUFQ2bZuDtpzvkc3HiEqLBfNYgeGMN5KeoPs4")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
