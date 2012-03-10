package net.rdrei.android.absshadow.test;

import net.rdrei.android.absshadow.test.shadow.ShadowSherlockActivity;

import org.junit.runners.model.InitializationError;

import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.RobolectricTestRunner;

public class CustomTestRunner extends RobolectricTestRunner {

    public CustomTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
		addClassOrPackageToInstrument("com.actionbarsherlock.app.SherlockActivity");
    }

    @Override
    protected void bindShadowClasses() {
        super.bindShadowClasses();
		Robolectric.bindShadowClass(ShadowSherlockActivity.class);
    }
}
