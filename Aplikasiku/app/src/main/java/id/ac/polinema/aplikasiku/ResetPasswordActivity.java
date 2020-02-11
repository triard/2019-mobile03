package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResetPasswordActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reset_password);

		Button button = (Button) findViewById(R.id.btn_changepass);

		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ResetPasswordActivity.this, SuccessResetPasswordActivity.class);
				startActivity(intent);
			}
		});
	}

	public void postChangePassword(View view) {
		Intent intent = new Intent(this, SuccessResetPasswordActivity.class);
		startActivity(intent);
	}
}
