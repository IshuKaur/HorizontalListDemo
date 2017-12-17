package com.example.ishpreetkaur.horizontallistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter recyclerAdapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] names = {"Apple Pie","Banana Bread",
            "Cupcake","Donut",
            "Eclair","Froyo",
            "GingerBread", "HoneyComb",
            "Ice cream Sandwich","Jelly Bean",
            "Kitkat","Lollipop",
            "Marshmellow","Nougat",
            "Oreo"};
    String[] version_name = {"1.0","1.1",
            "1.5","1.6",
            "2.0 – 2.1","2.2 – 2.2.3",
            "2.3 – 2.3.7","3.0 – 3.2.6",
            "4.0 – 4.0.4","4.1 – 4.3.1",
            "4.4 – 4.4.4","5.0 – 5.1.1",
            "6.0 – 6.0.1","7.0 – 7.1.2",
            "8.0 – 8.1"};

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerAdapter = new CustomAdapter(names,version_name);
        layoutManager = new LinearLayoutManager(this);
        //  recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
