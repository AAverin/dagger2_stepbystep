package pro.averin.anton.dagger2.stepbystep.di;

import android.app.Activity;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pro.averin.anton.dagger2.stepbystep.BaseApplication;

@Module
public class SDKClassesModule {

    private final BaseApplication context;
    public SDKClassesModule(BaseApplication context) {
        this.context = context;
    }

    @Provides
    SharedPreferences provideSharedPreferences() {
        return context.getSharedPreferences("my_shared_preferences.pref", Activity.MODE_PRIVATE);
    }

}
