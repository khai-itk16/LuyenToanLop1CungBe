package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu1 extends AppCompatActivity implements View.OnClickListener{
     private Button bt_back;
    private Button  bt1;
    private Button  bt2;
    private Button  bt3;
    private Button  bt4;
    private Button  bt5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        khaibao();
        setevnet();
    }
    public void khaibao()
    {
        bt_back = (Button)findViewById(R.id.bt_back);
        bt1= (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
    }
    public void setevnet()
    {
        bt_back.setOnClickListener((View.OnClickListener) this);
        bt1.setOnClickListener((View.OnClickListener) this);
        bt2.setOnClickListener((View.OnClickListener) this);
        bt3.setOnClickListener((View.OnClickListener) this);
        bt4.setOnClickListener((View.OnClickListener) this);
        bt5.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.bt_back :
                Intent it1 =new Intent(Menu1.this, Menu.class);
                startActivity(it1);
                break;
            case R.id.bt1:
                Intent it2 =new Intent(Menu1.this, Bai1.class);
                startActivity(it2);
                break;
            case R.id.bt2:
                Intent it3 =new Intent(Menu1.this, Bai2.class);
                startActivity(it3);
                break;
            case R.id.bt3:
                Intent it4 =new Intent(Menu1.this, Bai3.class);
                startActivity(it4);
                break;
            case R.id.bt4:
                Intent it5 =new Intent(Menu1.this, Bai4.class);
                startActivity(it5);
                break;
            case R.id.bt5:
                Intent it6 =new Intent(Menu1.this, Bai5.class);
                startActivity(it6);
                break;

        }

    }
}
