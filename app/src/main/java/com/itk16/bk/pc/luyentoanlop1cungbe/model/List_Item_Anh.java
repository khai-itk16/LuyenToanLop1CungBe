package com.itk16.bk.pc.luyentoanlop1cungbe.model;

import com.itk16.bk.pc.luyentoanlop1cungbe.R;

import java.util.ArrayList;

public class List_Item_Anh {
    private ArrayList<Item_anh> mArrAnh;

    public ArrayList<Item_anh> getmArrAnh() {
        return mArrAnh;
    }

    public void setmArrAnh(ArrayList<Item_anh> mArrAnh) {
        this.mArrAnh = mArrAnh;
    }

    public List_Item_Anh() {
       data();
    }

    public void data()
    {
        mArrAnh= new ArrayList<>();
        mArrAnh.add(new Item_anh(R.drawable.quadau, "quả dâu" ));
        mArrAnh.add(new Item_anh(R.drawable.quatao, "qua tao"));

    }

}
