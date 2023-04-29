package ui30;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ui30.R;

public class MainSetting extends AppCompatActivity {
    private View mainTab;
    private TextView motorTemp;
    private TextView coolantTemp;
    private TextView battery;
    private TextView coolantPressure;
    private TextView amps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //region fullscreen code [to be placed before setContentView]
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_settings);
        //Hiding navigation bar
        View overlay1 = findViewById(R.id.settingsLayout);
        overlay1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        //Giving button attributes to top icons to move between settings and main pages
        mainTab = findViewById(R.id.imageView5);
        mainTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
         motorTemp = findViewById(R.id.motortemp);
         coolantTemp = findViewById(R.id.coolantTemp2);
         battery = findViewById(R.id.battery3);
         coolantPressure = findViewById(R.id.coolantPressure);
         amps = findViewById(R.id.amps);

    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
