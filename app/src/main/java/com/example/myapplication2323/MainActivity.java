package com.example.myapplication2323;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication2323.utils.appConstant;

public class MainActivity extends AppCompatActivity {

    private Button mBUtton, mButtonShare, mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBUtton = findViewById(R.id.bt_open);
        mButtonShare = findViewById(R.id.bt_share);
        mActivity = findViewById(R.id.bt_activity);
        mBUtton.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this,Main2Activity.class);
            mIntent.putExtra(appConstant.KEY,"hola actividad 2");
            //serializable ... teinen que heredar los objetos para poder mandarlos en un intent
            startActivity(mIntent);
        });
        mActivity.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this,Actividad.class);
            mIntent.putExtra(appConstant.KEY,"hola actividad");
            //serializable ... teinen que heredar los objetos para poder mandarlos en un intent
            startActivity(mIntent);
        });

        mButtonShare.setOnClickListener(v->{
            Intent mIntent = new Intent();
            //investigar los mimetype
            mIntent.setType("text/plain");
            mIntent.setAction(Intent.ACTION_SEND);//voy a mandar algo... de tipo texto plan î
            mIntent.putExtra(Intent.EXTRA_TEXT,"jefe... voy a llegar tarde :v");
            startActivity(mIntent);
        });

    }
}
