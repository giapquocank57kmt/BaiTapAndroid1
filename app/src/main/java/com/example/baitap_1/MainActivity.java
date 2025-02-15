package com.example.baitap_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtCanh;
    Button btnTinh, btnWeb;
    TextView chuvi, dientich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCanh = findViewById(R.id.edtCanh);
        btnTinh = findViewById(R.id.btnTinh);
        btnWeb = findViewById(R.id.btWeb);
        chuvi = findViewById(R.id.chuvi);
        dientich = findViewById(R.id.dientich);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HinhVuong hinhVuong = new HinhVuong();
                hinhVuong.setCanh(Integer.parseInt(edtCanh.getText().toString()));
                hinhVuong.tinh();
                chuvi.setText("Chu vi: "+hinhVuong.getChuvi().toString());
                dientich.setText("Diện tích: " + hinhVuong.getDientich().toString());
            }
        });

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                startActivity(intent);
            }
        });
    }
}