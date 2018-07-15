package com.muaz.tut.gradle.gradletutorial;

import android.app.Application;
import android.util.Log;

/**
 * Created by muazekici on 4.07.2018.
 */

public class App extends Application {



    public static final String BASE_URL = BuildConfig.API_URL;


    @Override
    public void onCreate() {

        super.onCreate();



        //Create service (retrofit etc with this way)


        //Control logging from here
        Log.d("IS_HTTP_LOG",BuildConfig.LOG_HTTP_REQUESTS+"");
    }
}
