package com.itk16.bk.pc.luyentoanlop1cungbe.model;

import java.util.ArrayList;

public class Lesson {
    private String mTenbaihoc;
    private boolean mLock;
    private int mNoidung;
    private int sao ;
    private ArrayList<Cau_Hoi> mLch;
    public Lesson(String mTenbaihoc, boolean mLock, int mNoidung, int sao) {
        this.mTenbaihoc = mTenbaihoc;
        this.mLock = mLock;
        this.mNoidung = mNoidung;
        this.sao = sao;
        switch (mNoidung)
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

    public String getmTenbaihoc() {
        return mTenbaihoc;
    }

    public void setmTenbaihoc(String mTenbaihoc) {
        this.mTenbaihoc = mTenbaihoc;
    }
    public boolean getmLock() {
        return mLock;
    }

    public void setmLock(boolean mLock) {
        this.mLock = mLock;
    }

    public int getmNoidung() {
        return mNoidung;
    }

    public void setmNoidung(int mNoidung) {
        this.mNoidung = mNoidung;
    }

    public int getSao() {
        return sao;
    }

    public void setSao(int sao) {
        this.sao = sao;
    }

    public ArrayList<Cau_Hoi> getmLch() {
        return mLch;
    }

    public void setmLch(ArrayList<Cau_Hoi> mLch) {
        this.mLch = mLch;
    }

    public void fake1()
    {
        mLch= new ArrayList<>();
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
