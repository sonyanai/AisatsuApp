package jp.techacademy.taison.yanai.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TimePicker;
import android.view.View;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                 int hourOfDay=10;
                TextView textView = (TextView)findViewById(R.id.textView);
                if(2 <= hourOfDay){
                    textView.setText("おはよう");
                }else if(10 <= hourOfDay){
                    textView.setText("こんにちは");
                }else if(18 <= hourOfDay || hourOfDay < 2){
                    textView.setText("こんばんは");
                }
            }
        });

        showTimePickerDialog();
    }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Log.d("UI_PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
                    }
                },
                0,
                0,
                true);
        timePickerDialog.show();
    }
}
