package net.rdrei.android.absshadow;

import roboguice.activity.RoboFragmentActivity;
import android.os.Bundle;

import com.actionbarsherlock.app.ActionBar;
import com.google.inject.Inject;

public class SecondActivity extends RoboFragmentActivity {
	@Inject
	private ActionBar actionBar;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		actionBar.setDisplayShowTitleEnabled(true);
	}

}
