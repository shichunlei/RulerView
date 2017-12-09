package com.chingtech.rulerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.chingtech.rulerview.library.RulerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RulerView rulerview = findViewById(R.id.ruler);

        rulerview.initViewParam(78, 20, 180f, 1f);
        rulerview.setChooseValueChangeListener(new RulerView.OnChooseResulterListener() {
            @Override
            public void onChooseValueChange(float value) {
                // TODO do some work
            }
        });

        RulerView rulerview2 = findViewById(R.id.ruler2);

        rulerview2.initViewParam(50, 20, 80f, 0.1f);
        rulerview2.setChooseValueChangeListener(new RulerView.OnChooseResulterListener() {
            @Override
            public void onChooseValueChange(float value) {
                // TODO do some work
            }
        });
    }
}
