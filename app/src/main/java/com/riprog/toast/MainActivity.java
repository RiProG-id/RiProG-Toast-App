package com.riprog.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String text = getIntent().getStringExtra("toasttext");
		if (text == null || text.trim().isEmpty()) {
			text = "RiProG Toast aktif";
		}

		Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 100);
		toast.show();

		finish();
	}
}

