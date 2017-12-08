package com.example.a508_11.foodpayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button  btnJoin, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJoin=(Button)findViewById(R.id.btnJoin);
        btnLogin=(Button)findViewById(R.id.btnLogin);

        btnJoin.setOnClickListener(this);
        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case  R.id.btnJoin:
                    Intent intent1 = new Intent(this, Joinform.class);
                    startActivity(intent1);
                    break;

                case R.id.btnLogin:
                    Intent intent2 = new Intent(this, LoginForm.class);
                    startActivity(intent2);
                    break;
            }
    }
}
