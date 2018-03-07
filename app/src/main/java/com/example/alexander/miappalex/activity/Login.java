package com.example.alexander.miappalex.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alexander.miappalex.Adapter.ContainerActivity;
import com.example.alexander.miappalex.R;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private Button bt1;
    private TextView bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cast();

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);


    }

    private void cast() {

        bt1=(Button)findViewById(R.id.btL1Id);
        bt2=(TextView) findViewById(R.id.tvL4ID);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btL1Id:
                Intent intent = new Intent(Login.this,ContainerActivity.class);
                startActivity(intent);
                break;

            case R.id.tvL4ID:
                Intent intent1 = new Intent(Login.this,Creeate_account.class);
                startActivity(intent1);
                break;
            }

        }

    }

