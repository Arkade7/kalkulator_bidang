package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText editPanjang, editLebar;
    public TextView txtLuas, txtKeliling;
    public Button btnPersegiPanjang, btnLingkaran, btnSegitiga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editLebar = findViewById(R.id.editLebar);
        editPanjang = findViewById(R.id.editPanjang);
        txtKeliling = findViewById(R.id.txtKeliling);
        txtLuas = findViewById(R.id.txtLuas);
        btnPersegiPanjang = findViewById(R.id.btnPersegiPanjang);
        btnLingkaran = findViewById(R.id.btnLingkaran);
        btnSegitiga = findViewById(R.id.btnSegitiga);

        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilaiA = editPanjang.getText().toString();
                String nilaiB = editLebar.getText().toString();

                Integer panjang = Integer.parseInt(nilaiA);
                Integer lebar = Integer.parseInt(nilaiB);
                double luas = panjang*lebar;
                double keliling = (2*panjang)+(2*lebar);
                txtKeliling.setText(String.valueOf(keliling));
                txtLuas.setText(String.valueOf(luas));
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilaiA = editPanjang.getText().toString();
                Integer diameter = Integer.parseInt(nilaiA);
                double jari = diameter/2;
                double luas = Math.PI*Math.pow(jari,2);
                double keliling = Math.PI*diameter;
                txtKeliling.setText(String.valueOf(keliling));
                txtLuas.setText(String.valueOf(luas));
            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilaiA = editPanjang.getText().toString();
                String nilaiB = editLebar.getText().toString();

                Integer alas = Integer.parseInt(nilaiA);
                Integer tinggi = Integer.parseInt(nilaiB);
                double luas = 0.5*alas*tinggi;
                double sisi = Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
                double keliling = sisi+alas+tinggi;
                txtKeliling.setText(String.valueOf(keliling));
                txtLuas.setText(String.valueOf(luas));
            }
        });
    }
}