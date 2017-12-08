package com.example.a508_11.foodpayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableInfo extends AppCompatActivity implements View.OnClickListener{

    Button btnCalendar, btnBack4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_info_);


        btnCalendar=(Button)findViewById(R.id.btnCalendar);
        btnBack4=(Button)findViewById(R.id.btnBack4);


        btnCalendar.setOnClickListener(this);
        btnBack4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCalendar:
                Intent intent1 = new Intent(this, FoodSelect.class);
                startActivity(intent1);
                break;
            case R.id.btnBack4:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
