package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.itk16.bk.pc.luyentoanlop1cungbe.model.Cau_Hoi;
import com.itk16.bk.pc.luyentoanlop1cungbe.model.List_cau_hoi_1;

public class Game_1 extends AppCompatActivity implements View.OnClickListener{

    private int lc;
    private List_cau_hoi_1 mLch;
    TextView tv_Ch, tv_countdown;
    Button bt_Da1, bt_Da2, bt_Da3, bt_Da4, bt_pause,bt_back,bt_next;
    private int vt=0;
    private int sao=0;
    private int status;
    private int check;
    private Intent intent;
    CountDownTimer timer;
    int[] k= new int[]{0, 0, 0, 0};
      @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        init();
        kecha();
      }

    public void init()
    {

        intent = getIntent();
        lc = intent.getIntExtra("chuong", -1);
        mLch= new List_cau_hoi_1(lc);
        bt_next=(Button)findViewById(R.id.next) ;
        bt_Da1= (Button)findViewById(R.id.bt_da1);
        bt_Da2= (Button)findViewById(R.id.bt_da2);
        bt_Da3= (Button)findViewById(R.id.bt_da3);
        bt_Da4= (Button)findViewById(R.id.bt_da4);
        bt_back=(Button) findViewById(R.id.nut_thoat);
        bt_pause=(Button)findViewById(R.id.bt_pause) ;
        tv_Ch= (TextView)findViewById(R.id.tv_Ch);
        tv_countdown=(TextView)findViewById(R.id.tv_countdown);
        bt_Da1.setOnClickListener(this);
        bt_Da2.setOnClickListener(this);
        bt_Da3.setOnClickListener(this);
        bt_Da4.setOnClickListener(this);
        bt_next.setOnClickListener(this);
        bt_back.setOnClickListener(this);
        bt_pause.setOnClickListener(this);
    }
    public void kecha() {
        if (vt < mLch.getmLch().size()){
            Cau_Hoi ch1 = mLch.getmLch().get(vt);
        check= 0;
        status=0;
        for (int i= 0; i< k.length; i++)
        {
            k[i]=0;
        }
        bt_Da1.setBackgroundResource(R.drawable.dapan);
        bt_Da2.setBackgroundResource(R.drawable.dapan);
        bt_Da3.setBackgroundResource(R.drawable.dapan);
        bt_Da4.setBackgroundResource(R.drawable.dapan);
        bt_Da1.setText(ch1.getD().get(0).getD());
        bt_Da2.setText(ch1.getD().get(1).getD());
        bt_Da3.setText(ch1.getD().get(2).getD());
        bt_Da4.setText(ch1.getD().get(3).getD());
        tv_Ch.setText(ch1.getH());
        timer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tv_countdown.setText("00:" + millisUntilFinished/ 1000);
            }

            @Override
            public void onFinish() {
                tv_countdown.setText("Hết giờ");
            }
        }.start();
    }
    else {
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
//            Toast.makeText(this,"da hoan thanh bai kiem tra"+sao,Toast.LENGTH_SHORT).show();
//            intent.putExtra("sao", sao);
//            setResult(2, intent);
//            finish();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bt_da1:
                if(mLch.getmLch().get(vt).getD().get(0).isT())
                {
                   bt_Da1.setBackgroundResource(R.drawable.dung);
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
                    bt_Da1.setBackgroundResource(R.drawable.sai);
                    status=1;
                }
                break;
            case R.id.bt_da2:
                if(mLch.getmLch().get(vt).getD().get(1).isT())
                {
                    bt_Da2.setBackgroundResource(R.drawable.dung);
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
                    bt_Da2.setBackgroundResource(R.drawable.sai);
                    status=1;

                }
                break;
            case R.id.bt_da3:
                if(mLch.getmLch().get(vt).getD().get(2).isT())
                {
                    bt_Da3.setBackgroundResource(R.drawable.dung);
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
                    bt_Da3.setBackgroundResource(R.drawable.sai);
                    status=1;
                }
                break;
            case R.id.bt_da4:
                if(mLch.getmLch().get(vt).getD().get(3).isT())
                {
                    bt_Da4.setBackgroundResource(R.drawable.dung);
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
                    bt_Da4.setBackgroundResource(R.drawable.sai);
                    status=1;
                }
                break;
            case R.id.next:
                timer.cancel();
               if(status==1)
               { vt++;
                kecha();
               }else Toast.makeText(this, "ban phai chon dap an truoc khi tiep tuc",Toast.LENGTH_SHORT).show();
                break;
            case R.id.nut_thoat:
                finish();
                break;
        }
    }




}
