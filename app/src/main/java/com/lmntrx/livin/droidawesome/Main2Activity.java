package com.lmntrx.livin.droidawesome;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.lmntrx.livin.library.droidawesome.DroidAwesomeImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ((DroidAwesomeImageView)findViewById(R.id.bell))
                .setIcon(getString(R.string.fa_settings_gears),
                        72f,
                        ContextCompat.getColor(this,R.color.primary_icon_color));
    }
}
