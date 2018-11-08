package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.itk16.bk.pc.luyentoanlop1cungbe.model.Cau_Hoi;
import com.itk16.bk.pc.luyentoanlop1cungbe.model.List_cau_hoi;

import java.util.ArrayList;

public class Game_1 extends AppCompatActivity {

    private int lc;
    private ArrayList<Cau_Hoi> mLch;
    TextView tv_Ch;
    Button bt_Da1, bt_Da2, bt_Da3, bt_Da4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        fake1();
        init();
        kecha();

    }
    public void init()
    {
        bt_Da1= (Button)findViewById(R.id.bt_da1);
        bt_Da2= (Button)findViewById(R.id.bt_da2);
        bt_Da3= (Button)findViewById(R.id.bt_da3);
        bt_Da4= (Button)findViewById(R.id.bt_da4);
        tv_Ch= (TextView)findViewById(R.id.tv_Ch);
    }
    public void kecha()
    {
        Cau_Hoi ch1= mLch.get(6);
        bt_Da1.setText(ch1.getD().get(0).getD());
        bt_Da2.setText(ch1.getD().get(1).getD());
        bt_Da3.setText(ch1.getD().get(2).getD());
        bt_Da4.setText(ch1.getD().get(3).getD());
        tv_Ch.setText(ch1.getH());

    }

    public void fake1()
    {
        this.mLch= new ArrayList<>();
        mLch.add(new Cau_Hoi("Cau hoi thu nhat","dap an 1",true,"dap an 2",
                false,"dap an 3",false,"dap an 4",false));
        mLch.add(new Cau_Hoi("Cau hoi thu nhat","dap an 1",true,"dap an 2",
                false,"dap an 3",false,"dap an 4",false));
        mLch.add(new Cau_Hoi("Cau hoi thu nhat","dap an 1",true,"dap an 2",
                false,"dap an 3",false,"dap an 4",false));
        mLch.add(new Cau_Hoi("Cau hoi thu nhat","dap an 1",true,"dap an 2",
                false,"dap an 3",false,"dap an 4",false));
        mLch.add(new Cau_Hoi("Cau hoi thu nhat","dap an 1",true,"dap an 2",
                false,"dap an 3",false,"dap an 4",false));
        mLch.add(new Cau_Hoi("Cau hoi thu nhat","dap an 1",true,"dap an 2",
                false,"dap an 3",false,"dap an 4",false));
        mLch.add(new Cau_Hoi("Cau hoi thu bảy","1 con bò",true,"2 con lon",
                false,"3 con giun",false,"4 con chi",false));

    }
    public void fake2()
    {
        mLch= new ArrayList<>();
        // mLch.add(new Cau_Hoi())
    }
    public void fake3()
    {
        mLch= new ArrayList<>();
        // mLch.add(new Cau_Hoi())
    }
    public void fake4()
    {
        mLch= new ArrayList<>();
        // mLch.add(new Cau_Hoi())
    }
    public void fake5()
    {
        mLch= new ArrayList<>();
        //mLch.add(new Cau_Hoi())
    }

}
