package com.example.custombuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;







public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button purple = findViewById(R.id.click_me);
        Button colorful = findViewById(R.id.click_me_two);

        purple.setOnClickListener(new ClickHandler());
        colorful.setOnClickListener(new ClickHandler());
    }

    private class ClickHandler implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,
                    ((Button) v).getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
