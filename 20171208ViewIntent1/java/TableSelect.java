package com.example.a508_11.foodpayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableSelect extends AppCompatActivity implements View.OnClickListener{

    Button btnTable1, btnTable2, btnTable3, btnTable4, btnTable5, btnTable6, btnTable7, btnTable8 , btnBack3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_select_);

        btnTable1=(Button)findViewById(R.id.btnTable1);
        btnTable2=(Button)findViewById(R.id.btnTable2);
        btnTable3=(Button)findViewById(R.id.btnTable3);
        btnTable4=(Button)findViewById(R.id.btnTable4);
        btnTable5=(Button)findViewById(R.id.btnTable5);
        btnTable6=(Button)findViewById(R.id.btnTable6);
        btnTable7=(Button)findViewById(R.id.btnTable7);
        btnTable8=(Button)findViewById(R.id.btnTable8);

        btnBack3=(Button)findViewById(R.id.btnBack3);

        btnTable1.setOnClickListener(this);
        btnTable2.setOnClickListener(this);
        btnTable3.setOnClickListener(this);
        btnTable4.setOnClickListener(this);
        btnTable5.setOnClickListener(this);
        btnTable6.setOnClickListener(this);
        btnTable7.setOnClickListener(this);
        btnTable8.setOnClickListener(this);
        btnBack3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){

                case R.id.btnTable1:
                    Intent intent1 = new Intent(this, TableInfo.class);
                    startActivity(intent1);
                    break;
                case R.id.btnTable2:
                    Intent intent2 = new Intent(this, TableInfo.class);
                    startActivity(intent2);
                    break;
                case R.id.btnTable3:
                    Intent intent3 = new Intent(this, TableInfo.class);
                    startActivity(intent3);
                    break;
                case R.id.btnTable4:
                    Intent intent4 = new Intent(this, TableInfo.class);
                    startActivity(intent4);
                    break;
                case R.id.btnTable5:
                    Intent intent5 = new Intent(this, TableInfo.class);
                    startActivity(intent5);
                    break;
                case R.id.btnTable6:
                    Intent intent6 = new Intent(this, TableInfo.class);
                    startActivity(intent6);
                    break;
                case R.id.btnTable7:
                    Intent intent7 = new Intent(this, TableInfo.class);
                    startActivity(intent7);
                    break;
                case R.id.btnTable8:
                    Intent intent8 = new Intent(this, TableInfo.class);
                    startActivity(intent8);
                    break;
                case R.id.btnBack3:
                    Intent intent9 = new Intent(this, MainActivity.class);
                    startActivity(intent9);
                    break;
            }
    }
}
