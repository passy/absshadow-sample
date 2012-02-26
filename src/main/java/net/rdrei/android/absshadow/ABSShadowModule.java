package net.rdrei.android.absshadow;

import com.actionbarsherlock.app.ActionBar;
import com.google.inject.AbstractModule;

public class ABSShadowModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ActionBar.class).toProvider(ActionBarProvider.class);
	}
}
