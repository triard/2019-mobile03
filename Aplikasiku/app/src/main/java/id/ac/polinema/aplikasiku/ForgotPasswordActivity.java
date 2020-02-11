package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPasswordActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forgot_password);

		Button button = (Button) findViewById(R.id.btn_sendreq);

		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ForgotPasswordActivity.this, ResetPasswordActivity.class);
				startActivity(intent);
			}
		});
	}
}
