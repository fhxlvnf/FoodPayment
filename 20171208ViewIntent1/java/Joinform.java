package com.example.a508_11.foodpayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Joinform extends AppCompatActivity implements View.OnClickListener{
    Button btnCancelJoin, btnBack1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joinform_);


        btnCancelJoin=(Button)findViewById(R.id.btnCancelJoin);
        btnBack1=(Button)findViewById(R.id.btnBack1);


        btnCancelJoin.setOnClickListener(this);
        btnBack1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCancelJoin:
                Intent intent1 = new Intent(this, LoginForm.class);
                startActivity(intent1);
                break;
            case R.id.btnBack1:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
