package com.itk16.bk.pc.luyentoanlop1cungbe.model;

import java.util.ArrayList;

public class Cau_Hoi {
    private String h;
    private ArrayList<Dap_An> d;


    public Cau_Hoi(String h, String da1,boolean d1, String da2,boolean d2, String da3,boolean d3, String da4,boolean d4) {
        this.h = h;
        d= new ArrayList<>();
        d.add(new Dap_An(da1,d1));
        d.add(new Dap_An(da3,d3));
        d.add(new Dap_An(da2,d2));
        d.add(new Dap_An(da4,d4));

    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public ArrayList<Dap_An> getD() {
        return d;
    }

    public void setD(ArrayList<Dap_An> d) {
        this.d = d;
    }
}
