package com.example.tk1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText edtA,edtB,edtC;
    private Button btnTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edtA =(EditText) findViewById(R.id.edtA);
        edtB =(EditText) findViewById(R.id.edtB);
        edtC =(EditText) findViewById(R.id.edtC);
        btnTinh =(Button) findViewById(R.id.btnTinh);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(edtA.getText().toString());
                double b = Double.parseDouble(edtB.getText().toString());
                double c = Double.parseDouble(edtC.getText().toString());
                PhuongTrinhBacHai phuongTrinhBacHai = new PhuongTrinhBacHai(a,b,c);
                Intent travel = new Intent();
                travel.putExtra("nghiemp",phuongTrinhBacHai.nghiem().toString());
                setResult(RESULT_OK,travel);
                finish();
            }
        });
    }
}