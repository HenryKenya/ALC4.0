package ke.co.skylinedesign.acl40challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button profileBtn = findViewById(R.id.button_profile);

		Button webviewBtn = findViewById(R.id.button_webview);

		TextView testLink = findViewById(R.id.text_test_link);

		// url https://andela.com/alc/

		final Intent profileIntent = new Intent(this, ProfileActivity.class);

		final Intent webviewIntent = new Intent(this, WebviewActivity.class);

		final Intent testLinkIntent = new Intent(this, WebviewActivity.class);

		webviewIntent.putExtra("aboutUrl", "https://andela.com/alc/");

		testLinkIntent.putExtra("aboutUrl", "https://henrydru.herokuapp.com/");

		// set listener for starting profile
		profileBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(profileIntent);
			}
		});

		// open webview
		webviewBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(webviewIntent);
			}
		});

		// open test link
		testLink.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(testLinkIntent);
			}
		});
	}
}
