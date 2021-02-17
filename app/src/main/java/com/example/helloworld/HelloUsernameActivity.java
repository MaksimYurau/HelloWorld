package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloUsernameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_username);

        final EditText nameEditText;
        final TextView messageText;
        Button btnSubmit;

        nameEditText = findViewById(R.id.input_name);
        messageText = findViewById(R.id.message_text);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            messageText.setText("Привет," + name);
        });
    }
}
