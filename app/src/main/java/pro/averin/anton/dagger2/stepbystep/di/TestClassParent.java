package pro.averin.anton.dagger2.stepbystep.di;

import android.util.Log;

import javax.inject.Inject;

public class TestClassParent {

    private final TestClassDependency testClassDependency;

    @Inject
    public TestClassParent(TestClassDependency testClassDependency) {
        this.testClassDependency = testClassDependency;
    }

    public void call() {
        Log.d("TestClassParent", "call");
        if (testClassDependency != null) {
            testClassDependency.call();
        }
    }
}
