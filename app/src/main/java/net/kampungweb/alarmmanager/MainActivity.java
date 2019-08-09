package net.kampungweb.alarmmanager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOneTimeAlarmDate;
    TextView tvOneTimeAlarmDate;
    Button btnOneTimeAlarmTime;
    TextView tvOneTimeAlarmTime;
    EditText edtOneTimealarmMessage;
    Button btnSetOneTimeAlarm;

    Button btnRepeatingAlarmTime;
    TextView tvRepeatingTimeAlarmTime;
    EditText edtRepeatingAlarmMessage;
    Button btnSetRepeatingAlarm;
    Button btnCancelAlarm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOneTimeAlarmDate = findViewById(R.id.btn_one_time_alarm_date);
        tvOneTimeAlarmDate = findViewById(R.id.tv_one_time_alarm_date);
        btnOneTimeAlarmTime = findViewById(R.id.btn_one_time_alarm_time);
        tvOneTimeAlarmTime = findViewById(R.id.tv_one_time_alarm_time);
        edtOneTimealarmMessage = findViewById(R.id.edt_one_time_alarm_message);
        btnSetOneTimeAlarm = findViewById(R.id.btn_set_one_time_alarm);

        btnRepeatingAlarmTime = findViewById(R.id.btn_repeating_time_alarm_time);
        tvRepeatingTimeAlarmTime = findViewById(R.id.tv_repeating_time_alarm_time);
        edtRepeatingAlarmMessage = findViewById(R.id.edt_repeating_alarm_message);
        btnSetRepeatingAlarm = findViewById(R.id.btn_set_repeating_alarm);
        btnCancelAlarm = findViewById(R.id.btn_cancel_alarm);

        btnOneTimeAlarmDate.setOnClickListener(this);
        btnOneTimeAlarmTime.setOnClickListener(this);
        btnSetOneTimeAlarm.setOnClickListener(this);
        btnRepeatingAlarmTime.setOnClickListener(this);
        btnSetRepeatingAlarm.setOnClickListener(this);
        btnCancelAlarm.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_one_time_alarm_date) {
            Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.btn_one_time_alarm_time) {
            Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.btn_set_one_time_alarm) {
            Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.btn_repeating_time_alarm_time) {
            Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.btn_set_repeating_alarm) {
            Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.btn_cancel_alarm) {
            Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
