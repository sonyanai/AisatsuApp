package jp.techacademy.taison.yanai.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TimePicker;
import android.view.View;
import android.util.Log;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        showTimePickerDialog();
    }

    private void showTimePickerDialog(){
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener(){
                    @Override
                    public  void  onTimeSet(TimePicker view, int hourOfDay, int minute){
                        Log.d("UI_PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
                    }
                },
                13,
                0,
                true);
        timePickerDialog.show();
    }
}
