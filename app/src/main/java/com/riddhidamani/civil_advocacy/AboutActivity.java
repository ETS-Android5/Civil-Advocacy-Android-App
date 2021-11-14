package com.riddhidamani.civil_advocacy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.Objects;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_about);
        TextView apiURL = (TextView) findViewById(R.id.apiAtrributionLink);
        apiURL.setMovementMethod(LinkMovementMethod.getInstance());
    }

}