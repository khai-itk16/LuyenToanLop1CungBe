package com.itk16.bk.pc.luyentoanlop1cungbe.model;

import java.util.ArrayList;

public class List_cau_hoi_1 {
    private ArrayList<Cau_Hoi> mLch;
    public ArrayList<Cau_Hoi> getmLch() {
        return mLch;
    }
    public void setmLch(ArrayList<Cau_Hoi> mLch) {
        this.mLch = mLch;
    }

    public List_cau_hoi_1(int lc) {
        switch (lc)
        {
            case 1:
                chuong1();
                break;
            case 2:
                chuong2();
                break;
            case 3:
                chuong3();
                break;
            case 4:
                chuong4();
                break;
            case 5:
                chuong5();
                break;

        }
    }
    public void chuong1()
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
        mLch.add(new Cau_Hoi("Cau hoi thu nhat","dap an 1",true,"dap an 2",
                false,"dap an 3",false,"dap an 4",false));

    }
    public void chuong2()
    {
        mLch= new ArrayList<>();
        // mLch.add(new Cau_Hoi())
    }
    public void chuong3()
    {
        mLch= new ArrayList<>();
        // mLch.add(new Cau_Hoi())
    }
    public void chuong4()
    {
        mLch= new ArrayList<>();
        // mLch.add(new Cau_Hoi())
    }
    public void chuong5()
    {
        mLch= new ArrayList<>();
        //mLch.add(new Cau_Hoi())
    }

}
