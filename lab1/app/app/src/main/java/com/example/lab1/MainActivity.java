package com.example.lab1;

import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }

//注册一个监听器
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case  R.id.btn1://弹出对话框
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Log in");
                dialog.setMessage("Log in Successfully!");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    @Override
                    public  void onClick(DialogInterface dialog, int which){
                    }
                });
                dialog.setPositiveButton("Cancel",new DialogInterface.OnClickListener(){
                    @Override
                    public  void onClick(DialogInterface dialog, int which){
                    }
                });
                dialog.show();
                /*if(progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                }else {
                    progressBar.setVisibility(View.GONE);
                }*/
                break;
            default:
                break;
        }
    }
}
