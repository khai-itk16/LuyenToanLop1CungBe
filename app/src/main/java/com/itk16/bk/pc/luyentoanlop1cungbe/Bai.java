package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class Bai extends AppCompatActivity implements View.OnClickListener {
    private Button bt_back;
    private Button bt_1;
    private Button bt_2;
    private Button bt_3;
    private Button bt_4;
    private Button bt_5;
    private Button bt_6;
    private Integer bai;
    private static HashMap map = new HashMap<Integer, Integer>();

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

        khaibao();
        setevent();
    }

    public void khaibao()
    {
        bt_back=(Button)findViewById(R.id.nut_thoat);
        bt_1=(Button)findViewById(R.id.bt_1);
        bt_2=(Button)findViewById(R.id.bt_2);
        bt_3=(Button)findViewById(R.id.bt_3);
        bt_4=(Button)findViewById(R.id.bt_4);
        bt_5=(Button)findViewById(R.id.bt_5);
        bt_6=(Button)findViewById(R.id.bt_6);
    }

    public void setevent()
    {
        bt_back.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.nut_thoat:
                finish();
                break;
            case R.id.bt_1:
                break;
            case R.id.bt_2:
                break;
            case R.id.bt_3:
                break;
            case R.id.bt_4:
                break;
            case R.id.bt_5:
                break;
            case R.id.bt_6:
                break;
        }
    }
}
