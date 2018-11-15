package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game_2 extends AppCompatActivity implements View.OnClickListener{
    private int lc;
    private Button bt_back, bt_pause, bt_next, bt_lonhon, bt_behon, bt_bang;
    private TextView tv_ve1, tv_ve2, tv_countdown;
    private String v1, v2;
    private Intent intent;
    private int n1, n2;
    int d;
    int status;//da chon 1 dap an
    int sao=0;//tinh so cau dung
    int check;//kiem tra dung sai
    CountDownTimer timer;
    int n=0;
    int N;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        init();
        kecha();
    }
    public void init()
    {
        intent = getIntent();
        lc = intent.getIntExtra("chuong", -1);
        switch (lc)
        {
            case 1:N=10;
            break;
            case 2: N=20;
            break;
            case 3:N=40;
            break;
            case 4: N=60;
            break;
            case 5:N=100;
            break;
        }
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
        status=0;
        check=0;
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
                    if(status==0)
                    {
                        sao+=1;
                        check=1;
                        status=1;
                    }
                    timer.cancel();
                }
                else
                {
                    bt_behon.setBackgroundResource(R.drawable.besai);
                    status=1;
                }
                break;
            case R.id.bt_lonhon:
                if(n1>n2)
                {
                    bt_lonhon.setBackgroundResource(R.drawable.londung);
                    if(status==0)
                    {
                        sao+=1;
                        check=1;
                        status=1;
                    }
                    timer.cancel();
                }
                else {
                    bt_lonhon.setBackgroundResource(R.drawable.lonsai);
                    status=1;
                }
                break;
            case R.id.bt_bang:
                if(n1==n2)
                {
                    bt_bang.setBackgroundResource(R.drawable.bangdung);
                    if(status==0)
                    {
                        sao+=1;
                        check=1;
                        status=1;
                    }
                    timer.cancel();
                }
                else {
                    bt_bang.setBackgroundResource(R.drawable.bangsai);
                    status=1;
                }
                break;
            case R.id.next:

               if(status==1) {
                   timer.cancel();
                   if (n < 10) {
                       kecha();
                       n++;
                   } else
                       {
                           AlertDialog.Builder builder = new AlertDialog.Builder(this);
                           builder.setTitle("BẠN ĐÃ HOÀN THÀNH BÀI TẬP ");
                           builder.setMessage("Bạn đã trả lời đúng " + sao);
                           builder.setCancelable(false);
                           builder.setIcon(R.drawable.bt_quatao);

                           builder.setPositiveButton(
                                   "OK",
                                   new DialogInterface.OnClickListener() {
                                       public void onClick(DialogInterface dialog, int id) {
                                           intent.putExtra("sao", sao);
                                           setResult(2, intent);
                                           finish();
                                           dialog.cancel();
                                       }
                                   });
                           AlertDialog alertdialog = builder.create();
                           alertdialog.show();
                       }
               }
                else Toast.makeText(this, "Bạn phải chon ít nhất một đáp án trước khi tiếp tục!",Toast.LENGTH_SHORT).show();
               break;
            case R.id.nut_thoat:
                finish();
                break;

        }
    }
    public void random(int i)
    {
        Random rd= new Random();
        switch (i)
        {

            case 1:

                n1=rd.nextInt(N-1)+1;
                n2=rd.nextInt(N-1)+1;
                v1=n1+"";
                v2=n2+"";
                break;
            case 2:
                int c;
                c=rd.nextInt(2);
                if(c==0)
                {
                int i1, i2;
                n1=rd.nextInt(N-1)+1;
                n2=rd.nextInt(N-1)+1;
                i1= rd.nextInt(n1-1)+1;
                i2=n1-i1;
                v1=i1+" + "+i2+"";
                v2=n2+"";
                }else {
                    int i1, i2;
                    n1=rd.nextInt(N-1)+1;
                    n2=rd.nextInt(N-1)+1;
                    i1= rd.nextInt(n2-1)+1;
                    i2=n2-i1;
                    v2=i1+" + "+i2+"";
                    v1=n1+"";
                }
                break;
            case 3:
              int i1, i2;
              n1=rd.nextInt(N-1)+1;
              i1=rd.nextInt(n1-1)+1;
              i2=n1-i1;
              v1= i1+" + "+i2+"";
              n2=rd.nextInt(N-1)+1;
              i1=rd.nextInt(n2-1)+1;
              i2=n2-i1;
              v2=i1+" + "+i2+"";
             break;


        }


    }

}
