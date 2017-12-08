package com.example.a508_11.foodpayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSelect extends AppCompatActivity implements View.OnClickListener{

    Button btnReservation, btnDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_select_);

        btnReservation=(Button)findViewById(R.id.btnReservation);
        btnDelivery=(Button)findViewById(R.id.btnDelivery);

        btnReservation.setOnClickListener(this);
        btnDelivery.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnReservation:
                Intent intent1 = new Intent(this, TableSelect.class);
                startActivity(intent1);
                break;
            case R.id.btnDelivery:
                Intent intent2 = new Intent(this, FoodSelect.class);
                startActivity(intent2);
                break;
        }
    }
}
