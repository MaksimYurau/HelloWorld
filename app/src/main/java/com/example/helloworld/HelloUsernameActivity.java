package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.helloworld.BuildConfig.LOG;
import static com.example.helloworld.BuildConfig.LOG_TAG;

public class HelloUsernameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_username);

        final EditText nameEditText;
        final TextView messageText;
        Button btnSubmit;

        nameEditText = findViewById(R.id.input_name);
        messageText = findViewById(R.id.message_text);
        btnSubmit = findViewById(R.id.btn_submit);

        messageText.setVisibility(View.INVISIBLE);

        btnSubmit.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            String message = getString(R.string.hello_username, name);
            messageText.setText(message);
            messageText.setVisibility(View.VISIBLE);
        });
    }

    @Override
    protected void onStart() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onStop");
        super.onStop();
    }

    @Override
    protected void onResume() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onDestroy");
        super.onDestroy();
    }
}
