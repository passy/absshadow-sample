package net.rdrei.android.absshadow.test;

import net.rdrei.android.absshadow.SecondActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CustomTestRunner.class)
public class SecondActivityTest {

    @Test
    public void initialize() {
        SecondActivity activity = new SecondActivity();
        activity.onCreate(null);
    }
}
