package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);
        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            String valueUsername = extras.getString("username");
            usernameText.setText(valueUsername);

            String valueName = extras.getString("name");
            nameText.setText(valueName);

            int valueAge = extras.getInt("age");
            ageText.setText(Integer.toString(valueAge));
        }
    }
}
