package com.itk16.bk.pc.luyentoanlop1cungbe.model;

import java.util.ArrayList;

public class List_cau_hoi {
    private ArrayList<Cau_Hoi> mLch;
    public ArrayList<Cau_Hoi> getmLch() {
        return mLch;
    }
    public void setmLch(ArrayList<Cau_Hoi> mLch) {
        this.mLch = mLch;
    }

    public List_cau_hoi(int lc) {
        switch (lc)
        {
            case 1:
                fake1();
                break;
            case 2:
                fake2();
                break;
            case 3:
                fake3();
                break;
            case 4:
                fake4();
                break;
            case 5:
                fake5();
                break;

        }
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
        mLch.add(new Cau_Hoi("Cau hoi thu nhat","dap an 1",true,"dap an 2",
                false,"dap an 3",false,"dap an 4",false));

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
