package net.rdrei.android.absshadow.test;

import net.rdrei.android.absshadow.MainActivity;
import org.junit.runner.RunWith;
import org.junit.Test;

@RunWith(CustomTestRunner.class)
public class MainActivityTest {

	@Test
	public void initialize() {
		MainActivity activity = new MainActivity();
		activity.onCreate(null);
	}
}
