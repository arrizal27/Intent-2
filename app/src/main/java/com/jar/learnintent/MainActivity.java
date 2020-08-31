package com.jar.learnintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button expintent;
    Button impintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expintent = findViewById(R.id.expintent);
        expintent.setOnClickListener(this);
        impintent = findViewById(R.id.impintent);
        impintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.expintent:
                Intent explicit = new Intent(MainActivity.this,IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.impintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://w3schools.com"));
                startActivity(implicit);
                break;
        }
    }
}