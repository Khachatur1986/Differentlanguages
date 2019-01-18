package com.example.khach.differentlanguages;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.khach.differentlanguages.helper.LocaleHelper;

public class MainActivity extends AppCompatActivity {
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.app_name);

        textview = findViewById(R.id.textview);
        textview.setText(R.string.hello);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.choose_language, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.language_en) {
            LocaleHelper.setLocale(getApplicationContext(), "en");
        } else if (item.getItemId() == R.id.language_hy) {
            LocaleHelper.setLocale(getApplicationContext(), "hy");
        } else if (item.getItemId() == R.id.language_ru) {
            LocaleHelper.setLocale(getApplicationContext(), "ru");
        }
        recreate();
        return true;
    }
}