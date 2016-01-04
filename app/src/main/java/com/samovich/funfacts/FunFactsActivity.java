package com.samovich.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

// Layout: http://treehouse-code-samples.s3.amazonaws.com/Android/fun_facts_mockups.png
// Colors: http://treehouse-code-samples.s3.amazonaws.com/Android/fun_facts_colors.html

public class FunFactsActivity extends AppCompatActivity {

    // View variables
    private TextView mFactTextView;
    private Button mShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
    }
}
