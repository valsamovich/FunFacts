package com.samovich.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

// Layout: http://treehouse-code-samples.s3.amazonaws.com/Android/fun_facts_mockups.png
// Colors: http://treehouse-code-samples.s3.amazonaws.com/Android/fun_facts_colors.html

/**
 * Created by Valery Samovich on 1/4/16.
 */
public class FunFactsActivity extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();

    // Declare view variables
    private TextView mFactTextView;
    private Button mShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();

                // Update the screen with our dynamic fact
                mFactTextView.setText(fact);
            }
        };

        mShowFactButton.setOnClickListener(listener);
    }
}
