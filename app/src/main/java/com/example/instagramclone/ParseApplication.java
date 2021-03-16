package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("otwQzamquj5icuiUkOi5sDQTyTjMRgaXfDqcZR4j")
                .clientKey("ir1aqAHgFSgHGDiV7nTNkOmHkGNyFw6AVl3T0bSR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
