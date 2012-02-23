package net.rdrei.android.absshadow;

import android.support.v4.app.FragmentActivity;
import com.actionbarsherlock.app.ActionBar;
import android.os.Bundle;

public class MainActivity extends FragmentActivity
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
