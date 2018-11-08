package com.itk16.bk.pc.luyentoanlop1cungbe.model;

import java.util.ArrayList;

public class Cau_Hoi {
    private String h;
    private ArrayList<Dap_An> d= new ArrayList<>();

    public Cau_Hoi(String h, String da1,boolean d1, String da2,boolean d2, String da3,boolean d3, String da4,boolean d4) {
        this.h = h;
        d.get(0).setD(da1);
        d.get(1).setD(da2);
        d.get(2).setD(da3);
        d.get(3).setD(da4);
        d.get(0).setT(d1);
        d.get(1).setT(d2);
        d.get(2).setT(d3);
        d.get(3).setT(d4);

    }

}
