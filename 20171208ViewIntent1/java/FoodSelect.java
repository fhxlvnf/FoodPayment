package com.example.a508_11.foodpayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import;
import;

public class FoodSelect extends AppCompatActivity implements View.OnClickListener{
    Button btnLunch, btnCook1, btnCook2,btnCook3,btnCancelReservation, btnCancelDelivery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_select_);

        btnLunch=(Button)findViewById(R.id.btnLunch);
        btnCook1=(Button)findViewById(R.id.btnCook1);
        btnCook2=(Button)findViewById(R.id.btnCook1);
        btnCook3=(Button)findViewById(R.id.btnCook1);
        btnCancelReservation=(Button)findViewById(R.id.btnCancelReservation);
        btnCancelDelivery=(Button)findViewById(R.id.btnCancelDelivery);

        btnLunch.setOnClickListener(this);
        btnCook1.setOnClickListener(this);
        btnCook2.setOnClickListener(this);
        btnCook3.setOnClickListener(this);
        btnCancelReservation.setOnClickListener(this);
        btnCancelDelivery.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLunch:
                Intent intent1 = new Intent(this, FoodList.class);
                startActivity(intent1);
                break;
            case R.id.btnCook1:
                Intent intent2 = new Intent(this, FoodList.class);
                startActivity(intent2);
                break;
            case R.id.btnCook2:
                Intent intent3 = new Intent(this, FoodList.class);
                startActivity(intent3);
                break;
            case R.id.btnCook3:
                Intent intent4 = new Intent(this, FoodList.class);
                startActivity(intent4);
                break;
            case R.id.btnCancelReservation:
                Intent intent5 = new Intent(this, MainActivity.class);
                startActivity(intent5);
                break;
            case R.id.btnCancelDelivery:
                Intent intent6 = new Intent(this, MainActivity.class);
                startActivity(intent6);
                break;
        }
    }
}