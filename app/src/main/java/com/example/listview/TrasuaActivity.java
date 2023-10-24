package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TrasuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasua);

        Button btn = (Button) findViewById(R.id.btnbacktrasua);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(TrasuaActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        ListView listView = findViewById(R.id.listviewTrasua);
        List<String> list = new ArrayList<>();
        list.add("Tra sua truyen thong");
        list.add("Tra sua tran chau");
        list.add("Tra sua macha");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
    }
}