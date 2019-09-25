package com.yundin.styleruhw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AuthActivity extends AppCompatActivity {

    EditText loginEditText;
    EditText passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = loginEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                if (isAuthDataCorrect(login, password)) {
                    goToNextScreen();
                } else {
                    passwordEditText.setError("Auth data is incorrect!");
                }
            }
        });
    }

    /**
     * Checks if authorisation data is correct
     * @param login login from user's input
     * @param password password from user's input
     * @return true if login's length is six digits and password equals "qwerty", false otherwise
     */
    private boolean isAuthDataCorrect(String login, String password) {
        return false;
    }

    /**
     * Just moving us to next activity
     */
    private void goToNextScreen() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
