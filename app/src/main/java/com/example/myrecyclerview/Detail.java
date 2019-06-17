package com.example.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    String nama, remarks;
    TextView namaPresident, remarksPresident;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();

        namaPresident = findViewById(R.id.textName);
        remarksPresident = findViewById(R.id.textRemarks);

        nama = bundle.getString("nama");
        remarks = bundle.getString("remarks");

        namaPresident.setText(nama);
        remarksPresident.setText(remarks);
    }
}
