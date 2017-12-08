package com.example.a508_11.foodpayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginForm extends AppCompatActivity implements View.OnClickListener{
    Button btnCanceLogin, btnBack2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form_);

        btnCanceLogin=(Button)findViewById(R.id.btnCanceLogin);
        btnBack2=(Button)findViewById(R.id.btnBack2);

        btnCanceLogin.setOnClickListener(this);
        btnBack2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCanceLogin:
                Intent intent1 = new Intent(this, TableSelect.class);
                startActivity(intent1);
                break;
            case R.id.btnBack2:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
