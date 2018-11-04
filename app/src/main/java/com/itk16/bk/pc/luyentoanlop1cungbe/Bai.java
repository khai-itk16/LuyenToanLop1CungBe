package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.itk16.bk.pc.luyentoanlop1cungbe.adapter.CustomAdapter;
import com.itk16.bk.pc.luyentoanlop1cungbe.model.Lesson;

import java.util.ArrayList;
import java.util.HashMap;

public class Bai extends AppCompatActivity implements View.OnClickListener {
    private Button bt_back;
    private ListView listView;
    private Integer bai;
    private static HashMap map = new HashMap<Integer, Integer>();
    private ArrayList<Lesson> ArrayLesson=new ArrayList<>();

    static {
        map.put(1, R.layout.activity_bai1);
        map.put(2, R.layout.activity_bai2);
        map.put(3, R.layout.activity_bai3);
        map.put(4, R.layout.activity_bai4);
        map.put(5, R.layout.activity_bai5);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bai = getIntent().getIntExtra("bai", -1);
        setContentView((Integer)map.get(bai));
        loadFackdata();
        khaibao();
        setevent();
        CustomAdapter customAdapter = new CustomAdapter(Bai.this,R.layout.item,ArrayLesson);
        listView.setAdapter(customAdapter);

    }

    public void khaibao()
    {
        bt_back=(Button)findViewById(R.id.nut_thoat);
        listView=(ListView)findViewById(R.id.lv);
    }

    public void setevent()
    {
        bt_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
                case R.id.nut_thoat:
                finish();
                break;

        }
    }
    public void loadFackdata()
    {
        ArrayLesson.add(new Lesson("Bài 1", false,"Làm quen các số 1,2,3,4.",2));
        ArrayLesson.add(new Lesson("Bài 2", false,"Làm quen các số 5,6,7,8.",1));
        ArrayLesson.add(new Lesson("Bài 3", false,"Làm quen các số 9,10,11,12.",0));
        ArrayLesson.add(new Lesson("Bài 4", true,"Làm quen các số 13,2,3.",0));
        ArrayLesson.add(new Lesson("Bài 5", true,"Làm quen các số 1,2,3.",0));
        ArrayLesson.add(new Lesson("Bài 6", true,"Làm quen các số 1,2,3,4.",0));
        ArrayLesson.add(new Lesson("Bài 7", true,"Làm quen các số 5,6,7,8.",0));
        ArrayLesson.add(new Lesson("Bài 8", true,"Làm quen các số 9,10,11,12.",0));
        ArrayLesson.add(new Lesson("Bài 9", true,"Làm quen các số 13,2,3.",0));
        ArrayLesson.add(new Lesson("Bài 10", true,"Làm quen các số 1,2,3.",0));

    }
}
