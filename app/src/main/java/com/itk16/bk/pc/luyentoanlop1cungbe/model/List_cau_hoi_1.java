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
        mLch.add(new Cau_Hoi("2 + 2 = ? ","4",true,"4",
                false,"3",false,"2",false));
        mLch.add(new Cau_Hoi("2 + 4 = ?","7",false,"7",
                false,"5",false,"6",true));
        mLch.add(new Cau_Hoi("9 - 3 = ?","7",false,"9",
                false,"6",true,"10",false));
        mLch.add(new Cau_Hoi("2 + 5 = ?","8",false,"5",
                false,"7",true,"6",false));
        mLch.add(new Cau_Hoi("4 + 5 = ?","8",false,"9",
                true,"10",false,"8",false));
        mLch.add(new Cau_Hoi("10 - 5 = ?","5",true,"8",
                false,"9",false,"7",false));
        mLch.add(new Cau_Hoi("1 + 5 = ?","5",false,"4",
                false,"3",false,"6",true));
        mLch.add(new Cau_Hoi("7 - 2 = ?","8",false,"7",
                false,"5",true,"6",false));
        mLch.add(new Cau_Hoi("3 + 4 = ?","8",false,"7",
                true,"6",false,"5",false));
        mLch.add(new Cau_Hoi("2 + 3 = ?","6",false,"4",
                false,"3",false,"5",true));
        mLch.add(new Cau_Hoi("10 - 6 = ?","5",false,"8",
                false,"4",true,"7",false));
        mLch.add(new Cau_Hoi("8 - 1 = ?","7",true,"9",
                false,"8",false,"10",false));
        mLch.add(new Cau_Hoi("4 + 1 = ?","5",true,"3",
                false,"2",false,"4",false));
        mLch.add(new Cau_Hoi("2 + 8 = ?","6",false,"8",
                false,"7",false,"10",true));
        mLch.add(new Cau_Hoi("6 - 2 = ?","5",false,"6",
                false,"4",true,"7",false));
    }
    public void chuong2()
    {
        mLch= new ArrayList<>();
        mLch.add(new Cau_Hoi("12 + 2 = ? ","14",true,"8",
                false,"13",false,"10",false));
        mLch.add(new Cau_Hoi("12 - 5 = ?","12",false,"15",
                false,"17",false,"7",true));
        mLch.add(new Cau_Hoi("3 + 15 = ?","17",false,"19",
                false,"18",true,"20",false));
        mLch.add(new Cau_Hoi("2 + 14 = ?","10",false,"15",
                false,"16",true,"19",false));
        mLch.add(new Cau_Hoi("14 - 6 = ?","14",false,"8",
                true,"20",false,"10",false));
        mLch.add(new Cau_Hoi("15 + 5 = ?","20",true,"18",
                false,"19",false,"17",false));
        mLch.add(new Cau_Hoi("11 + 5 = ?","15",false,"14",
                false,"13",false,"16",true));
        mLch.add(new Cau_Hoi("2 + 17 = ?","18",false,"17",
                false,"19",true,"16",false));
        mLch.add(new Cau_Hoi("13 - 4 = ?","17",false,"9",
                true,"16",false,"10",false));
        mLch.add(new Cau_Hoi("12 + 3 = ?","16",false,"14",
                false,"13",false,"15",true));
        mLch.add(new Cau_Hoi("4 + 9 = ?","14",false,"8",
                false,"13",true,"7",false));
        mLch.add(new Cau_Hoi("17 - 3 = ?","14",true,"9",
                false,"18",false,"17",false));
        mLch.add(new Cau_Hoi("4 + 11 = ?","15",true,"13",
                false,"12",false,"14",false));
        mLch.add(new Cau_Hoi("13 - 11 = ?","3",false,"5",
                false,"12",false,"2",true));
        mLch.add(new Cau_Hoi("19 - 12 = ?","16",false,"6",
                false,"7",true,"17",false));
    }
    public void chuong3()
    {
        mLch= new ArrayList<>();
        mLch.add(new Cau_Hoi("10 + 15 = ? ","25",true,"26",
                false,"20",false,"35",false));
        mLch.add(new Cau_Hoi("47 - 27 = ?","21",false,"18",
                false,"19",false,"20",true));
        mLch.add(new Cau_Hoi("37 - 9 = ?","26",false,"30",
                false,"28",true,"29",false));
        mLch.add(new Cau_Hoi("3 + 10 = ?","14",false,"11",
                false,"13",true,"15",false));
        mLch.add(new Cau_Hoi("28 - 13 = ?","16",false,"15",
                true,"13",false,"14",false));
        mLch.add(new Cau_Hoi("19 + 6 = ?","25",true,"26",
                false,"24",false,"27",false));
        mLch.add(new Cau_Hoi("48 - 44 = ?","6",false,"5",
                false,"3",false,"4",true));
        mLch.add(new Cau_Hoi("5 + 12 = ?","15",false,"18",
                false,"17",true,"14",false));
        mLch.add(new Cau_Hoi("11 - 1 = ?","12",false,"10",
                true,"9",false,"8",false));
        mLch.add(new Cau_Hoi("32 - 8 = ?","25",false,"26",
                false,"27",false,"24",true));
        mLch.add(new Cau_Hoi("13 + 24 = ?","35",false,"38",
                false,"34",true,"37",false));
        mLch.add(new Cau_Hoi("35 - 14 = ?","21",true,"20",
                true,"23",false,"19",false));
        mLch.add(new Cau_Hoi("38 - 6 = ?","32",true,"33",
                false,"34",false,"31",false));
        mLch.add(new Cau_Hoi("24 + 9 = ?","35",false,"34",
                false,"32",false,"33",true));
        mLch.add(new Cau_Hoi("16 + 2 = ?","19",false,"17",
                false,"18",true,"16",false));
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
