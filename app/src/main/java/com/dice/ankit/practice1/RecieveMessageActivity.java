package com.dice.ankit.practice1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends Activity {
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        Intent intent = getIntent();
        String text = intent.getStringExtra(EXTRA_MESSAGE);
        ((TextView) (findViewById(R.id.receivedMessage))).setText(text);

    }
}
