package net.kampungweb.alarmmanager;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOneTimeAlarmDate;
    TextView tvOneTimeAlarmDate;
    Button btnOneTimeAlarmTime;
    AppCompatTextView tvOneTimeAlarmTime;
    EditText edtOneTimealarmMessage;
    Button btnSetOneTimeAlarm;

    Button btnRepeatingAlarmTime;
    TextView tvRepeatingTimeAlarmTime;
    EditText edtRepeatingAlarmMessage;
    Button btnSetRepeatingAlarm;
    Button btnCancelAlarm;

    TimePickerDialog timePickerDialog;

    private Calendar calOneTimeDate;
    private Calendar calOneTimeTime;
    private Calendar calRepeatTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOneTimeAlarmDate = findViewById(R.id.btn_one_time_alarm_date);
        tvOneTimeAlarmDate = findViewById(R.id.tv_one_time_alarm_date);
        btnOneTimeAlarmTime = findViewById(R.id.btn_one_time_alarm_time);
       // tvOneTimeAlarmTime = findViewById(R.id.tv_one_time_alarm_time);
        edtOneTimealarmMessage = findViewById(R.id.edt_one_time_alarm_message);
        btnSetOneTimeAlarm = findViewById(R.id.btn_set_one_time_alarm);

        btnRepeatingAlarmTime = findViewById(R.id.btn_repeating_time_alarm_time);
        tvRepeatingTimeAlarmTime = findViewById(R.id.tv_repeating_time_alarm_time);
        //edtRepeatingAlarmMessage = findViewById(R.id.edt_repeating_alarm_message);
        btnSetRepeatingAlarm = findViewById(R.id.btn_set_repeating_alarm);
       // btnCancelAlarm = findViewById(R.id.btn_cancel_alarm);

        btnOneTimeAlarmDate.setOnClickListener(this);
        btnOneTimeAlarmTime.setOnClickListener(this);
        btnSetOneTimeAlarm.setOnClickListener(this);
        btnRepeatingAlarmTime.setOnClickListener(this);
        btnSetRepeatingAlarm.setOnClickListener(this);
//        btnCancelAlarm.setOnClickListener(this);

        calOneTimeDate = Calendar.getInstance();
        calOneTimeTime = Calendar.getInstance();
        calRepeatTime = Calendar.getInstance();

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_one_time_alarm_date) {
            //Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();

            //Add instance Calendar Picker Dialog
            final Calendar currentDate = Calendar.getInstance();
            new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    calOneTimeDate.set(year, monthOfYear, dayOfMonth);
                    tvOneTimeAlarmDate.setText(dateFormat.format(calOneTimeDate.getTime()));
                }
            }, currentDate.get(Calendar.YEAR), currentDate.get(Calendar.MONTH), currentDate.get(Calendar.DAY_OF_MONTH)).show();

        } else if (view.getId() == R.id.btn_one_time_alarm_time) {
            Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();

            //Add instance Calendar Time Picker Dialog
            final Calendar currentTime = Calendar.getInstance();
            timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

                    currentTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
                    currentTime.set(Calendar.MINUTE, minute);
                    //btnOneTimeAlarmTime.setText(timeFormat.format(currentTime.getTime()));
                    if (tvOneTimeAlarmTime != null) {
                        tvOneTimeAlarmTime.setText(timeFormat.format(currentTime.getTime()));
                    } else if (true){
                        Toast.makeText(getApplicationContext(),"how to fix it", Toast.LENGTH_LONG).show();
                        tvOneTimeAlarmTime.setText(timeFormat.format(currentTime.toString().toCharArray()));
                    }


                }
            }, currentTime.get(Calendar.HOUR_OF_DAY), currentTime.get(Calendar.MINUTE), false);
            timePickerDialog.show();


        } else if (view.getId() == R.id.btn_set_one_time_alarm) {
            Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String oneTimeDate = dateFormat.format(calOneTimeDate.getTime());
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            String oneTimeTime = timeFormat.format((calOneTimeTime.getTime()));
            String oneTimeMessage = edtOneTimealarmMessage.getText().toString();

        } else if (view.getId() == R.id.btn_repeating_time_alarm_time) {
            Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.btn_set_repeating_alarm) {
            Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
