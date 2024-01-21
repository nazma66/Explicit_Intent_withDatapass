package com.nazma_humayra.explicit_intent_withdatapass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button button2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button2 = findViewById(R.id.bt_2);
        textView = findViewById(R.id.tv_1);

        String string_value = getIntent().getExtras().getString("MessageKey");
        textView.setText(string_value);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(ii);
            }
        });
    }
}