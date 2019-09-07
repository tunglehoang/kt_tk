package com.example.student.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvkq;
    EditText edttaikhoan,edttaikhoan2;
    CheckBox ckluu;
    Button btnDangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edttaikhoan = (EditText)findViewById(R.id.edt_taikhoan);
        edttaikhoan2 = (EditText)findViewById(R.id.edt_taikhoan2);
        tvkq = (TextView) findViewById(R.id.tv_kq);
        ckluu =(CheckBox)findViewById(R.id.ck_luu);
        btnDangnhap = (Button)findViewById(R.id.btn_dangnhap);

        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ckluu.isChecked() == true){
                    Toast toast = Toast.makeText(MainActivity.this,"Chao mung ban dang nhap he thong,thong tin cua ban da duoc luu",Toast.LENGTH_LONG);
                    toast.show();
                }
                else{
                    Toast toast = Toast.makeText(MainActivity.this,"Chao mung ban dang nhap he thong,thong tin cua ban Khong duoc luu",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
