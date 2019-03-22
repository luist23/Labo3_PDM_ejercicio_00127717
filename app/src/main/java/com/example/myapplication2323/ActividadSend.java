package com.example.myapplication2323;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication2323.utils.appConstant;

public class ActividadSend extends AppCompatActivity {

    private Button mSend;
    private TextView mUser,mPassword,mEmail,mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_send);

        sincronizar();
        Intent mIntent = getIntent();
        if (mIntent!=null){
            mUser.setText(mIntent.getStringExtra(appConstant.KEY1));
            mPassword.setText(mIntent.getStringExtra(appConstant.KEY2));
            mEmail.setText(mIntent.getStringExtra(appConstant.KEY3));
            mGender.setText(mIntent.getStringExtra(appConstant.KEY4));
        }

        mSend.setOnClickListener(v->{
            Intent mIntent2 = new Intent();
            mIntent2.setType("text/plain");
            mIntent2.setAction(Intent.ACTION_SEND);//voy a mandar algo... de tipo texto plan î
            mIntent2.putExtra(Intent.EXTRA_TEXT,send(mIntent));
            startActivity(mIntent2);
        });
    }

    private String send (Intent mIntent){
        String mensaje="";
            mensaje+=mIntent.getStringExtra(appConstant.KEY1)+'\n';
        mensaje+=mIntent.getStringExtra(appConstant.KEY2)+'\n';
        mensaje+=mIntent.getStringExtra(appConstant.KEY3)+'\n';
        mensaje+=mIntent.getStringExtra(appConstant.KEY4);
        return mensaje;
    }

    private void sincronizar (){
        mSend = findViewById(R.id.bt_share_activity);
        mUser = findViewById(R.id.tv_username);
        mEmail = findViewById(R.id.tv_email);
        mGender = findViewById(R.id.tv_gender);
        mPassword = findViewById(R.id.tv_password);
    }
}
