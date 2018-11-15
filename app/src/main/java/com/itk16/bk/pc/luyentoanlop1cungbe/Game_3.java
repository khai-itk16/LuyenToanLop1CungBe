package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.itk16.bk.pc.luyentoanlop1cungbe.adapter.Custom_GridView;
import com.itk16.bk.pc.luyentoanlop1cungbe.model.Item_anh;
import com.itk16.bk.pc.luyentoanlop1cungbe.model.List_Item_Anh;

import java.util.ArrayList;
import java.util.Random;

public class Game_3 extends AppCompatActivity implements View.OnClickListener{
    private Button btResponse1,btResponse2, btResponse3, btResponse4,btNext, btBack, btPause;
    private TextView tvCountdown,tvQuestion;
    private GridView gr_v;
    private List_Item_Anh LITA;//danh sach anh
    int k;//bien k dung de tao bien ramdom tuong ung voi mot con so trong bai hoc
    int a;// a dung de random ra mot anh bat ky trong LITA
    String Ch;//chua ten anh
    int[] Da={0,0,0,0};//mang dap an
    int da;//vi tri dap an dung
    CountDownTimer timer;
    int status;
    int sao;
    int check;
    int n=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
        init();
        kecha();
    }

    public void init()
    {
        btResponse1=(Button)findViewById(R.id.bt_da1);
        btResponse2=(Button)findViewById(R.id.bt_da2);
        btResponse3=(Button)findViewById(R.id.bt_da3);
        btResponse4=(Button)findViewById(R.id.bt_da4);
        btBack=(Button)findViewById(R.id.nut_thoat);
        btPause=(Button)findViewById(R.id.bt_pause);
        btNext=(Button)findViewById(R.id.next);
        tvCountdown=(TextView)findViewById(R.id.tv_countdown);
        tvQuestion=(TextView)findViewById(R.id.tv_Ch);
        gr_v= (GridView)findViewById(R.id.gr_v);
        btResponse1.setOnClickListener(this);
        btResponse2.setOnClickListener(this);
        btResponse3.setOnClickListener(this);
        btResponse4.setOnClickListener(this);
        btBack.setOnClickListener(this);
        btPause.setOnClickListener(this);
        btNext.setOnClickListener(this);
        LITA= new List_Item_Anh();


    }
    public  void kecha()
    {
        btResponse1.setBackgroundResource(R.drawable.dapan);
        btResponse2.setBackgroundResource(R.drawable.dapan);
        btResponse3.setBackgroundResource(R.drawable.dapan);
        btResponse4.setBackgroundResource(R.drawable.dapan);

        random();
        ArrayList<Item_anh> item_anhs= new ArrayList<>();
        for (int i= 0; i<k;i++)
        {
            item_anhs.add(new Item_anh(LITA.getmArrAnh().get(a).getmAnh(),LITA.getmArrAnh().get(a).getmTenAnh()));
        }
        Custom_GridView custom_gridView= new Custom_GridView(this, R.layout.item_anh,item_anhs, LITA.getmArrAnh().get(a).getmAnh());
        gr_v.setAdapter(custom_gridView);
        btResponse1.setText(Da[0]+"");
        btResponse2.setText(Da[1]+"");
        btResponse3.setText(Da[2]+"");
        btResponse4.setText(Da[3]+"");
        status=0;
        check=0;
        timer= new CountDownTimer(15000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvCountdown.setText("00:"+millisUntilFinished/1000+"");
            }

            @Override
            public void onFinish() {
                tvCountdown.setText("Hết giờ");

            }
        }.start();
    }

    public void random()
    {
        Random rd= new Random();
        a=rd.nextInt(LITA.getmArrAnh().size());
        k= rd.nextInt(10);
        Ch= "Có bao nhiêu "+LITA.getmArrAnh().get(a).getmTenAnh()+" trong hình vẽ ?";
        tvQuestion.setText(Ch);
        da=rd.nextInt(3);
        Da[da]=k;
        for (int i= 0; i<=3;i++)
        {
            if (i!=da)
            {
                do{
                    Da[i]=rd.nextInt(10);
                }while (Da[i]==k);
            }
        }

    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bt_da1:
                if(Da[0]==k)
                {
                    btResponse1.setBackgroundResource(R.drawable.dung);
                    Check();
                    timer.cancel();

                }
                else{
                    btResponse1.setBackgroundResource(R.drawable.sai);
                    status=1;
                }

                break;
            case R.id.bt_da2:
                if(Da[1]==k)
                {
                    btResponse2.setBackgroundResource(R.drawable.dung);
                    Check();
                    timer.cancel();
                }
                else {
                    btResponse2.setBackgroundResource(R.drawable.sai);
                    status=1;
                }
                break;
            case R.id.bt_da3:
                if(Da[2]==k)
                {
                    btResponse3.setBackgroundResource(R.drawable.dung);
                    Check();
                    timer.cancel();
                }
                else {
                    btResponse3.setBackgroundResource(R.drawable.sai);
                    status=1;
                }
                break;
            case R.id.bt_da4:
                if(Da[3]==k)
                {
                    btResponse4.setBackgroundResource(R.drawable.dung);
                    Check();
                    timer.cancel();
                }
                else {
                    btResponse4.setBackgroundResource(R.drawable.sai);
                    status=1;
                }
                break;
            case R.id.next:

                if(status==1)
                {
                    timer.cancel();
                    if(n<10)
                    {n++;
                    kecha();
                    }else Toast.makeText(this, "Bạn đã hoàn thành với "+sao+" đáp án đúng",Toast.LENGTH_SHORT).show();
                }else Toast.makeText(this, "Bạn phải chọn ít nhất 1 đáp án trước khi tiếp tục",Toast.LENGTH_SHORT).show();

                break;
        }

    }
    public void Check()
    {
        if(status==0)
        {
            check= 1;
            sao+=1;
            status=1;
        }
    }

}
