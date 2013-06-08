package net.rdrei.android.absshadow;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import android.os.Bundle;

public class MainActivity extends SherlockActivity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ActionBar actionBar = this.getSupportActionBar();
		actionBar.setDisplayShowTitleEnabled(true);
	}
}
