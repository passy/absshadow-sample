package net.rdrei.android.absshadow.test.shadow;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.SpinnerAdapter;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.xtremelabs.robolectric.internal.Implementation;
import com.xtremelabs.robolectric.internal.Implements;
import com.xtremelabs.robolectric.shadows.ShadowActivity;

@Implements(SherlockActivity.class)
public class ShadowSherlockActivity extends ShadowActivity {

	@Implementation
	public ActionBar getSupportActionBar() {
		return new ActionBar() {

			@Override
			public void show() {
			}

			@Override
			public void setTitle(int arg0) {
			}

			@Override
			public void setTitle(CharSequence arg0) {
			}

			@Override
			public void setSubtitle(int arg0) {
			}

			@Override
			public void setSubtitle(CharSequence arg0) {
			}

			@Override
			public void setSelectedNavigationItem(int arg0) {
			}

			@Override
			public void setNavigationMode(int arg0) {
			}

			@Override
			public void setLogo(Drawable arg0) {
			}

			@Override
			public void setLogo(int arg0) {
			}

			@Override
			public void setListNavigationCallbacks(SpinnerAdapter arg0,
					OnNavigationListener arg1) {
			}

			@Override
			public void setIcon(Drawable arg0) {
			}

			@Override
			public void setIcon(int arg0) {
			}

			@Override
			public void setDisplayUseLogoEnabled(boolean arg0) {
			}

			@Override
			public void setDisplayShowTitleEnabled(boolean arg0) {
			}

			@Override
			public void setDisplayShowHomeEnabled(boolean arg0) {
			}

			@Override
			public void setDisplayShowCustomEnabled(boolean arg0) {
			}

			@Override
			public void setDisplayOptions(int arg0, int arg1) {
			}

			@Override
			public void setDisplayOptions(int arg0) {
			}

			@Override
			public void setDisplayHomeAsUpEnabled(boolean arg0) {
			}

			@Override
			public void setCustomView(View arg0, LayoutParams arg1) {
			}

			@Override
			public void setCustomView(int arg0) {
			}

			@Override
			public void setCustomView(View arg0) {
			}

			@Override
			public void setBackgroundDrawable(Drawable arg0) {
			}

			@Override
			public void selectTab(Tab arg0) {
			}

			@Override
			public void removeTabAt(int arg0) {
			}

			@Override
			public void removeTab(Tab arg0) {
			}

			@Override
			public void removeOnMenuVisibilityListener(OnMenuVisibilityListener arg0) {
			}

			@Override
			public void removeAllTabs() {
			}

			@Override
			public Tab newTab() {
				return null;
			}

			@Override
			public boolean isShowing() {
				return false;
			}

			@Override
			public void hide() {
			}

			@Override
			public CharSequence getTitle() {
				return null;
			}

			@Override
			public int getTabCount() {
				return 0;
			}

			@Override
			public Tab getTabAt(int arg0) {
				return null;
			}

			@Override
			public CharSequence getSubtitle() {
				return null;
			}

			@Override
			public Tab getSelectedTab() {
				return null;
			}

			@Override
			public int getSelectedNavigationIndex() {
				return 0;
			}

			@Override
			public int getNavigationMode() {
				return 0;
			}

			@Override
			public int getNavigationItemCount() {
				return 0;
			}

			@Override
			public int getHeight() {
				return 0;
			}

			@Override
			public int getDisplayOptions() {
				return 0;
			}

			@Override
			public View getCustomView() {
				return null;
			}

			@Override
			public void addTab(Tab arg0, int arg1, boolean arg2) {

			}

			@Override
			public void addTab(Tab arg0, int arg1) {

			}

			@Override
			public void addTab(Tab arg0, boolean arg1) {

			}

			@Override
			public void addTab(Tab arg0) {

			}

			@Override
			public void addOnMenuVisibilityListener(OnMenuVisibilityListener arg0) {

			}
		};
	}

	@Implementation
	public void setContentView(int layoutResId) {
		super.setContentView(layoutResId);
	}
}
