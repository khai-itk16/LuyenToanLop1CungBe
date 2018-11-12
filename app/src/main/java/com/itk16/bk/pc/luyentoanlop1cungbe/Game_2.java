package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Game_2 extends AppCompatActivity implements View.OnClickListener{
    private int lc;
    private Button bt_back, bt_pause, bt_next, bt_lonhon, bt_behon, bt_bang;
    private TextView tv_ve1, tv_ve2, tv_countdown;
    private String v1, v2;
    private int n1, n2;
    int d;
    CountDownTimer timer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        init();
        kecha();
    }
    public void init()
    {

       bt_back=(Button)findViewById(R.id.nut_thoat);
       bt_pause=(Button)findViewById(R.id.bt_dung);
       bt_behon=(Button)findViewById(R.id.bt_behon);
       bt_lonhon=(Button)findViewById(R.id.bt_lonhon);
       bt_bang=(Button)findViewById(R.id.bt_bang);
       bt_next=(Button)findViewById(R.id.next) ;
       tv_countdown=(TextView)findViewById(R.id.tv_countdown);
       tv_ve1=(TextView)findViewById(R.id.tv_ve1);
       tv_ve2=(TextView)findViewById(R.id.tv_ve2);


       bt_next.setOnClickListener(this);
       bt_bang.setOnClickListener(this);
       bt_lonhon.setOnClickListener(this);
       bt_behon.setOnClickListener(this);
       bt_pause.setOnClickListener(this);
       bt_back.setOnClickListener(this);
    }
    public void kecha()
    {
        random(2);
        bt_behon.setBackgroundResource(R.drawable.be);
        bt_lonhon.setBackgroundResource(R.drawable.lon);
        bt_bang.setBackgroundResource(R.drawable.dau_bang);
        tv_ve1.setText(v1);
        tv_ve2.setText(v2);
         timer= new CountDownTimer(15000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tv_countdown.setText("00:"+millisUntilFinished/1000+"");
            }

            @Override
            public void onFinish() {
                tv_countdown.setText("Hết giờ");
            }
        }.start();
    }



    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bt_behon:
                if(n1<n2)
                {
                    bt_behon.setBackgroundResource(R.drawable.bedung);
                    timer.cancel();
                }
                else bt_behon.setBackgroundResource(R.drawable.besai);
                break;
            case R.id.bt_lonhon:
                if(n1>n2)
                {
                    bt_lonhon.setBackgroundResource(R.drawable.londung);
                    timer.cancel();
                }
                else bt_lonhon.setBackgroundResource(R.drawable.lonsai);
                break;
            case R.id.bt_bang:
                if(n1==n2)
                {
                    bt_bang.setBackgroundResource(R.drawable.bangdung);
                    timer.cancel();
                }
                else bt_bang.setBackgroundResource(R.drawable.bangsai);
                break;
            case R.id.next:
                timer.cancel();
                kecha();
                break;

        }
    }
    public void random(int i)
    {
        Random rd= new Random();
        switch (i)
        {

            case 1:

                n1=rd.nextInt(9)+1;
                n2=rd.nextInt(9)+1;
                v1=n1+"";
                v2=n2+"";
                break;
            case 2:
                int c;
                c=rd.nextInt(2);
                if(c==0)
                {
                int i1, i2;
                n1=rd.nextInt(9)+1;
                n2=rd.nextInt(9)+1;
                i1= rd.nextInt(n1);
                i2=n1-i1;
                v1=i1+" + "+i2+"";
                v2=n2+"";
                }else {
                    int i1, i2;
                    n1=rd.nextInt(9)+1;
                    n2=rd.nextInt(9)+1;
                    i1= rd.nextInt(n1);
                    i2=n2-i1;
                    v2=i1+" + "+i2+"";
                    v1=n1+"";
                }
                break;
            case 3:
              int i1, i2;
              n1=rd.nextInt(9)+1;
              i1=rd.nextInt(n1);
              i2=n1-i1;
              v1= i1+" + "+i2+"";
              n2=rd.nextInt(9)+1;
              i1=rd.nextInt(n2);
              i2=n2-i1;
              v2=i1+" + "+i2+"";
             break;


        }


    }

}
