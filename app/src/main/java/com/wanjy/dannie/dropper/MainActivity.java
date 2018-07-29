package com.wanjy.dannie.dropper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.wanjy.dannie.dropper.R;

public class MainActivity extends AppCompatActivity {
    private Button mLogin, mRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogin = (Button) findViewById(R.id.login);
        mRegister = (Button) findViewById(R.id.register);

        startService(new Intent(MainActivity.this, onAppKilled.class));

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
