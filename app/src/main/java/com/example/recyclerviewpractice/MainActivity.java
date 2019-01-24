package com.example.recyclerviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view = (RecyclerView)findViewById(R.id.main_recyclerview);

        //그리드뷰로 만들것으로 정의 하는 부분분
       RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        view.setLayoutManager(layoutManager);

        // 어댑터를 연결 시켜주는 부분
        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter();
        view.setAdapter(myRecyclerViewAdapter);

    }
}
