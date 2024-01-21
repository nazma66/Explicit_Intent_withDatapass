package com.nazma_humayra.explicit_intent_withdatapass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.bt_1);
        editText = findViewById(R.id.et_1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ii = new Intent(MainActivity.this,SecondActivity.class);

                String message1 = editText.getText().toString().trim();
                ii.putExtra("MessageKey",message1);
                startActivity(ii);

//                startActivity(new Intent(MainActivity.this,SecondActivity.class));

//                startActivity(new Intent(getApplicationContext(),SecondActivity.class));

            }
        });
    }
}