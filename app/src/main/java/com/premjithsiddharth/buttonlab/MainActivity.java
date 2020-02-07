package com.premjithsiddharth.buttonlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textone;
    Button buttonTwo;
    TextView textmultiply;
    int x = 0;
    int y = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.main_button);
        textone = findViewById(R.id.main_text);
        buttonTwo = findViewById(R.id.sub_button);
        textmultiply = findViewById(R.id.sub_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("message", "Here is some text!");
                x++;
                textone.setText("" + x);
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("message2", "Here is more text!");
                y++;
                int multiplication = x*y;
                textmultiply.setText("" + multiplication);
            }
        });
    }
}
