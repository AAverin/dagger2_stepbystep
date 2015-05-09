package pro.averin.anton.dagger2.stepbystep.di;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import pro.averin.anton.dagger2.stepbystep.MainActivity;

@Component(modules = SDKClassesModule.class)
public interface SDKClassesComponent {

    void injectTo(MainActivity mainActivity);
}
