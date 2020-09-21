package com.example.tk1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//update
public class MainActivity extends AppCompatActivity {
    private EditText edtSoA,edtSoB,edtSoC;
    private TextView txvKetQua;
    private Button btnNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSoA =(EditText) findViewById(R.id.edtSoA);
        edtSoB =(EditText) findViewById(R.id.edtSoB);
        edtSoC =(EditText) findViewById(R.id.edtSoC);
        btnNhap =(Button) findViewById(R.id.btnNhap);
        txvKetQua =(TextView) findViewById(R.id.txvKetQua);
        txvKetQua.setText("0");
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivityForResult(intent,999);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 999 && resultCode == RESULT_OK){
            String nghiem = data.getStringExtra("nghiemp").toString();
            txvKetQua.setText(nghiem);
        }
    }
}