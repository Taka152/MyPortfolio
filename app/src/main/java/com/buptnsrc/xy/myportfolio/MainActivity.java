package com.buptnsrc.xy.myportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastForMovies(View view) {
        Context context = getApplicationContext();
        CharSequence text = "this button will launch my movie app";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void toastForStock(View view) {
        Context context = getApplicationContext();
        CharSequence text = "this button will launch my stock app";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void toastForBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "this button will launch my build it bigger app";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void toastForMaterial(View view) {
        Context context = getApplicationContext();
        CharSequence text = "this button will launch my material app";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void toastForUbiquitous(View view) {
        Context context = getApplicationContext();
        CharSequence text = "this button will launch my ubiquitous app";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    public void toastForCapstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "this button will launch my capstone app";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

}
