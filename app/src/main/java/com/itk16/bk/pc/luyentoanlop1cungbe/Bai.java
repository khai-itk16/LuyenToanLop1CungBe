package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

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
        CustomAdapter customAdapter= new CustomAdapter(this,R.layout.item,ArrayLesson);
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
       // listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
                case R.id.nut_thoat:
                finish();
                break;
                default:
                    break;

        }
    }
    public void loadFackdata()
    {
        Lesson ls1 = new Lesson("Bai 1", 0,"Lam quen cac so 1,2,3,4.",0);
        Lesson ls2 = new Lesson("Bai 2", 1,"Lam quen cac so 5,6,7,8.",0);
        Lesson ls3 = new Lesson("Bai 3", 1,"Lam quen cac so 9,10,11,12.",0);
        Lesson ls4 = new Lesson("Bai 4", 1,"Lam quen cac so 13,2,3.",0);
        Lesson ls5 = new Lesson("Bai 5", 1,"Lam quen cac so 1,2,3.",0);

        ArrayLesson.add(ls1);
        ArrayLesson.add(ls2);
        ArrayLesson.add(ls3);
        ArrayLesson.add(ls4);
        ArrayLesson.add(ls5);

    }
}
