package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		TextView btn = (TextView) findViewById(R.id.forgot_password);
		Button button = (Button) findViewById(R.id.btn_login2);

		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
				startActivity(intent);
			}
		});

		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(LoginActivity.this, SuccessLoginActivity.class);
				startActivity(i);
			}
		});

	}

}
