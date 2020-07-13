package com.aueui.contact;

import android.content.Intent;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


import com.aueui.contact.Activities.Contact_details;
import com.aueui.contact.Activities.New_contact;
import com.aueui.contact.Base.BaseActivity;

public class MainActivity extends BaseActivity {
    private LinearLayout contact_details;
    private Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        initView();
        contact_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(MainActivity.this, Contact_details.class));
                } catch (Exception e) {
                }
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, New_contact.class);
                startActivity(intent);

            }
        });



    }
    private void initView() {

        contact_details= findViewById(R.id.contact_details);

    }
    }
