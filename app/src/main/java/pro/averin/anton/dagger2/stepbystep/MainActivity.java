package pro.averin.anton.dagger2.stepbystep;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import pro.averin.anton.dagger2.stepbystep.di.CustomTestClass;
import pro.averin.anton.dagger2.stepbystep.di.DaggerSDKClassesComponent;
import pro.averin.anton.dagger2.stepbystep.di.SDKClassesComponent;
import pro.averin.anton.dagger2.stepbystep.di.SDKClassesModule;

public class MainActivity extends BaseActivity {

    @Inject
    SharedPreferences mySharedPreferences;
    @Inject
    CustomTestClass customTestClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BaseApplication baseApplication = (BaseApplication) getApplicationContext();

        SDKClassesComponent sdkClassesComponent = DaggerSDKClassesComponent.builder()
                .sDKClassesModule(new SDKClassesModule(baseApplication))
                .build();
        sdkClassesComponent.injectTo(this);

        Log.e("MainActivity", "Injecting shared preferences = " + mySharedPreferences);
        Log.e("MainActivity", "Injecting custom class = " + customTestClass);
    }
}
