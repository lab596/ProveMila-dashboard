package com.example.ui20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private View settingTab;
    //Tire pressure variables
    private TextView topRightTire = findViewById(R.id.rightTP_top);
    private TextView bottomRightTire = findViewById(R.id.rightTP_bottom);
    private TextView topLeftTire = findViewById(R.id.leftTP_top);
    private TextView bottomLeftTire = findViewById(R.id.leftTP_bottom);
    //main car attributes
    private TextView battery = findViewById(R.id.battery_text);
    private TextView speed = findViewById(R.id.speed_text);
    private TextView range = findViewById(R.id.range_text);
    //car vitals
    private TextView batteryTemp = findViewById(R.id.batteryTemp);
    private TextView motorTemp = findViewById(R.id.motorTemp);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //region fullscreen code [to be placed before setContentView]
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //Hiding navigation bar
        View overlay = findViewById(R.id.mainLayout);
        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        //Giving button attributes to top icons to move between settings and main pages
        settingTab = findViewById(R.id.secondScreen);
        settingTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings();
            }
        });
        //topRightTire.setText("Deez");
    }
    public void openSettings(){
        Intent intent = new Intent(this, MainSetting.class);
        startActivity(intent);
    }
}