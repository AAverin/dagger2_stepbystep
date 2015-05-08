package pro.averin.anton.dagger2.stepbystep.di;

import android.util.Log;

import javax.inject.Inject;

public class TestClassDependency {

    @Inject
    public TestClassDependency() {

    }

    public void call() {
        Log.e("TestClassDependency", "call");
    }
}
