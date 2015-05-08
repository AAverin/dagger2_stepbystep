package pro.averin.anton.dagger2.stepbystep.di;

import javax.inject.Singleton;

import dagger.Component;
import pro.averin.anton.dagger2.stepbystep.MainActivity;

@Singleton
@Component
public interface TestClassComponent {
    TestClassDependency testClassDependency();
}
