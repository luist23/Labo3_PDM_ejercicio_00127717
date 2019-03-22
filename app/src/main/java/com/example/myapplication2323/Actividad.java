package com.example.myapplication2323;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication2323.utils.appConstant;

public class Actividad extends AppCompatActivity {

    private Button mSend;
    private EditText mUser,mPassword,mEmail,mGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad);
        sincronizar();
        mSend.setOnClickListener(v->{
            Intent mIntent = new Intent(Actividad.this,ActividadSend.class);
            mIntent.putExtra(appConstant.KEY1,mUser.getText().toString());
            mIntent.putExtra(appConstant.KEY2,mPassword.getText().toString());
            mIntent.putExtra(appConstant.KEY3,mEmail.getText().toString());
            mIntent.putExtra(appConstant.KEY4,mGender.getText().toString());

            startActivity(mIntent);
        });

    }

    private void sincronizar (){
        mSend = findViewById(R.id.bt_send);
        mUser = findViewById(R.id.Et_username);
        mEmail = findViewById(R.id.Et_email);
        mGender = findViewById(R.id.Et_gender);
        mPassword = findViewById(R.id.Et_password);
    }
}
