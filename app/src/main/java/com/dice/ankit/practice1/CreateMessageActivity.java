package com.dice.ankit.practice1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        Intent intent = new Intent(this, RecieveMessageActivity.class);
        String enteredText = ((EditText) findViewById(R.id.enterTextField)).getText().toString();

        intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE, enteredText);
        startActivity(intent);
    }

    public void onSend(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        String enteredText = ((EditText) findViewById(R.id.enterTextField)).getText().toString();
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_TEXT, enteredText);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);

    }
}
