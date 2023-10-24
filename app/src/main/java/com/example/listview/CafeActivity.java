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

public class CafeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        Button btn = (Button) findViewById(R.id.btnbackcafe);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(CafeActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        ListView listView = findViewById(R.id.listviewCafe);
        List<String> list = new ArrayList<>();
        list.add("Cafe den");
        list.add("Cafe sua da");
        list.add("Cafe Muoi");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

    }
}