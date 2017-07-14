package jp.techacademy.taison.yanai.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TimePicker;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int hourOfDay =0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                TextView textView = (TextView)findViewById(R.id.textView);
                if(2 <= hourOfDay && hourOfDay <10){
                    textView.setText("おはよう");
                }else if(10 <= hourOfDay && hourOfDay <18){
                    textView.setText("こんにちは");
                }else{
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
                        MainActivity.this.hourOfDay = hourOfDay;//ここでメンバ変数宣言したhoourOfDayに代入する！
                    }
                },
                0,
                0,
                true);
        timePickerDialog.show();
    }
}
