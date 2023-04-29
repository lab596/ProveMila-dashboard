package ui30;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ui30.R;

public class MainActivity extends AppCompatActivity {
    private View settingTab;
    //Tire pressure variables
    private TextView topRightTire;
    private TextView bottomRightTire;
    private TextView topLeftTire;
    private TextView bottomLeftTire;
    //main car attributes
    private TextView battery;
    private TextView speed;
    private TextView range;
    //car vitals
    private TextView batteryTemp;
    private TextView motorTemp;

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

        // Initialize TextView variables here
        topRightTire = findViewById(R.id.rightTP_top);
        bottomRightTire = findViewById(R.id.rightTP_bottom);
        topLeftTire = findViewById(R.id.leftTP_top);
        bottomLeftTire = findViewById(R.id.leftTP_bottom);
        battery = findViewById(R.id.battery_text);
        speed = findViewById(R.id.speed_text);
        range = findViewById(R.id.range_text);
        batteryTemp = findViewById(R.id.batteryTemp);
        motorTemp = findViewById(R.id.motorTemp);
        //topLeftTire.setText("deez");
    }

    public void openSettings() {
        Intent intent = new Intent(this, MainSetting.class);
        startActivity(intent);
    }
}
