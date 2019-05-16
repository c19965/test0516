package com.example.test0514;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton1;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mButton1 = (Button) findViewById(R.id.myButton1);
    mButton1.setOnClickListener(new Button.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            // TODO Auto-generated method stub
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle(R.string.app_about)
                    .setMessage(R.string.app_about_msg)
                    .setPositiveButton(R.string.str_ok,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialoginterface, int i) {  /* do something here */ }
                            }
       ).show();


    }
});
        }

/*
        @Override
        protected void onActivityResult(int requestCode,
                                        int resultCode, Intent data)  {
            switch (resultCode) {
                case RESULT_OK: /* 取得数据，并显示于画面上
                    Bundle bunde = data.getExtras();
                    String sex = bunde.getString("sex");
                    double height = bunde.getDouble("height");
                    et.setText(""+height);
                    if(sex.equals("M")) {
                        rb1.setChecked(true);
                    }
                    else {
                        rb2.setChecked(true);
                    }
                    break;
                default:
                    break;
            }
        }*/
    }


