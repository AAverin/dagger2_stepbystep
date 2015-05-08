package pro.averin.anton.dagger2.stepbystep;

import android.os.Bundle;

import javax.inject.Inject;

import pro.averin.anton.dagger2.stepbystep.di.DaggerTestClassComponent;
import pro.averin.anton.dagger2.stepbystep.di.TestClassComponent;
import pro.averin.anton.dagger2.stepbystep.di.TestClassParent;


public class MainActivity extends BaseActivity {

    @Inject TestClassParent testClassParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TestClassComponent testComponent = DaggerTestClassComponent.builder().build();
        testComponent.injectTo(this);

        testClassParent.call();
    }
}
