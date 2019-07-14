package ke.co.skylinedesign.acl40challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewActivity extends AppCompatActivity {

	private WebView mWebView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(true);

		String url = getIntent().getStringExtra("aboutUrl");

		// ensure there is url available
		if (url.isEmpty() || url == null) finish();

		mWebView = findViewById(R.id.webview);

		WebSettings mSettings = mWebView.getSettings();

		mSettings.setJavaScriptEnabled(true);

		mWebView.setWebViewClient(new WebViewClient());

		mWebView.loadUrl(url);
	}

	@Override
	public boolean onSupportNavigateUp() {
		onBackPressed();
		return true;
	}
}
