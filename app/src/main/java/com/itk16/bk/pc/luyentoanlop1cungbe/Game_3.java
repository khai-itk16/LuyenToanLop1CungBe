package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
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
    private int lc;
    private Button bt_Da1,bt_Da2, bt_Da3, bt_Da4,bt_next, bt_back, bt_pause;
    private TextView tv_countdown,tv_Ch;
    private GridView gr_v;
    private Intent intent;
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
    int N;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
        init();
        kecha();
    }

    public void init()
    {
        intent = getIntent();
        lc = intent.getIntExtra("chuong", -1);
        switch (lc)
        {
            case 1: N=10;
            break;
            case 2: N=20;
            break;
            case 3:N=40;
            break;

        }
        bt_Da1=(Button)findViewById(R.id.bt_da1);
        bt_Da2=(Button)findViewById(R.id.bt_da2);
        bt_Da3=(Button)findViewById(R.id.bt_da3);
        bt_Da4=(Button)findViewById(R.id.bt_da4);
        bt_back=(Button)findViewById(R.id.nut_thoat);
        bt_pause=(Button)findViewById(R.id.bt_pause);
        bt_next=(Button)findViewById(R.id.next);
        tv_countdown=(TextView)findViewById(R.id.tv_countdown);
        tv_Ch=(TextView)findViewById(R.id.tv_Ch);
        gr_v= (GridView)findViewById(R.id.gr_v);
        bt_Da1.setOnClickListener(this);
        bt_Da2.setOnClickListener(this);
        bt_Da3.setOnClickListener(this);
        bt_Da4.setOnClickListener(this);
        bt_back.setOnClickListener(this);
        bt_pause.setOnClickListener(this);
        bt_next.setOnClickListener(this);
        LITA= new List_Item_Anh();


    }
    public  void kecha()
    {
        bt_Da1.setBackgroundResource(R.drawable.dapan);
        bt_Da2.setBackgroundResource(R.drawable.dapan);
        bt_Da3.setBackgroundResource(R.drawable.dapan);
        bt_Da4.setBackgroundResource(R.drawable.dapan);

        random();
        ArrayList<Item_anh> item_anhs= new ArrayList<>();
        for (int i= 0; i<k;i++)
        {
            item_anhs.add(new Item_anh(LITA.getmArrAnh().get(a).getmAnh(),LITA.getmArrAnh().get(a).getmTenAnh()));
        }
        Custom_GridView custom_gridView= new Custom_GridView(this, R.layout.item_anh,item_anhs, LITA.getmArrAnh().get(a).getmAnh());
        gr_v.setAdapter(custom_gridView);
        bt_Da1.setText(Da[0]+"");
        bt_Da2.setText(Da[1]+"");
        bt_Da3.setText(Da[2]+"");
        bt_Da4.setText(Da[3]+"");
        status=0;
        check=0;
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

    public void random()
    {
        Random rd= new Random();
        a=rd.nextInt(LITA.getmArrAnh().size());
        k= rd.nextInt(N);
        Ch= "Có bao nhiêu "+LITA.getmArrAnh().get(a).getmTenAnh()+" trong hình vẽ ?";
        tv_Ch.setText(Ch);
        da=rd.nextInt(3);
        Da[da]=k;
        for (int i= 0; i<=3;i++)
        {
            if (i!=da)
            {
                do{
                    Da[i]=rd.nextInt(N);
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
                    bt_Da1.setBackgroundResource(R.drawable.dung);
                    if(status==0)
                    {
                        check= 1;
                        sao+=1;
                        status=1;

                    }
                    timer.cancel();

                }
                else{
                    bt_Da1.setBackgroundResource(R.drawable.sai);
                    status=1;
                }

                break;
            case R.id.bt_da2:
                if(Da[1]==k)
                {
                    bt_Da2.setBackgroundResource(R.drawable.dung);
                    if(status==0)
                    {
                        check= 1;
                        sao+=1;
                        status=1;

                    }
                    timer.cancel();

                }
                else {
                    bt_Da2.setBackgroundResource(R.drawable.sai);
                    status=1;
                }
                break;
            case R.id.bt_da3:
                if(Da[2]==k)
                {
                    bt_Da3.setBackgroundResource(R.drawable.dung);
                    if(status==0)
                    {
                        check= 1;
                        sao+=1;
                        status=1;

                    }
                    timer.cancel();

                }
                else {
                    bt_Da3.setBackgroundResource(R.drawable.sai);
                    status=1;
                }
                break;
            case R.id.bt_da4:
                if(Da[3]==k)
                {
                    bt_Da4.setBackgroundResource(R.drawable.dung);
                    if(status==0)
                    {
                        check= 1;
                        sao+=1;
                        status=1;

                    }
                    timer.cancel();

                }
                else {
                    bt_Da4.setBackgroundResource(R.drawable.sai);
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
                    }else{
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
                                        setResult(3, intent);
                                        finish();
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertdialog = builder.create();
                        alertdialog.show();
                    }
                }else Toast.makeText(this, "Bạn phải chọn ít nhất 1 đáp án trước khi tiếp tục",Toast.LENGTH_SHORT).show();

                break;
            case R.id.nut_thoat:
                finish();
                break;
        }

    }
}
