package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class SignupNow extends AppCompatActivity {

    EditText inputEmail;
    EditText inputPhoneNumber;
    EditText inputPassword;
    Button signupbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_now);


        TextView btn = findViewById(R.id.account);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupNow.this, MainActivity.class));
            }
        });
        inputEmail = findViewById(R.id.inputEmail);
        inputPhoneNumber = findViewById(R.id.inputPhoneNumber);
        inputPassword = findViewById(R.id.inputPassword);
        signupbutton = findViewById(R.id.signupbutton);

        signupbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputEmail.getText().toString().equals("qwertyuiop@gmail.com") && inputPhoneNumber.getText().toString().equals("09123456789")
                        && inputPassword.getText().toString().equals("123456")) {
                    Toast.makeText(SignupNow.this, "Account Created!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SignupNow.this, "Creat Account Failed!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
