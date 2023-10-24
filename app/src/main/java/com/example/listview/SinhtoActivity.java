package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SinhtoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinhto);

        Button btn = (Button) findViewById(R.id.btnbacksinhto);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(SinhtoActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });


        ListView listView = findViewById(R.id.listviewSinhto);
        List<String> list = new ArrayList<>();
        list.add("Sinh to cam");
        list.add("Sinh to dua hau");
        list.add("Sinh to chuoi");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

    }
}