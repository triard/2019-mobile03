package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);

		Button button = (Button) findViewById(R.id.btn_login);
		button.setOnClickListener(new View.OnClickListener(

		){

			@Override
			public void onClick(View v) {
				Intent i = new Intent(WelcomeActivity.this, LoginActivity.class);
				startActivity(i);
			}
		});
	}
}
