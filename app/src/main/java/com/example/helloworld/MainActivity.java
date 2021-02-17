package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_hello_world).setOnClickListener(this);
        findViewById(R.id.btn_hello_user).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hello_world) {
            startActivity(new Intent(this, HelloWorldActivity.class));
        } else if (v.getId() == R.id.btn_hello_user) {
            startActivity(new Intent(this, HelloUsernameActivity.class));
        }
    }
}