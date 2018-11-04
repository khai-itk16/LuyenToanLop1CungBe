package com.itk16.bk.pc.luyentoanlop1cungbe.model;

public class Lesson {
    private String mTenbaihoc;
    private boolean mLock;
    private String mNoidung;
    private int sao ;
    public Lesson(String mTenbaihoc, boolean mLock, String mNoidung, int sao) {
        this.mTenbaihoc = mTenbaihoc;
        this.mLock = mLock;
        this.mNoidung = mNoidung;
        this.sao = sao;
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

    public String getmNoidung() {
        return mNoidung;
    }

    public void setmNoidung(String mNoidung) {
        this.mNoidung = mNoidung;
    }

    public int getSao() {
        return sao;
    }

    public void setSao(int sao) {
        this.sao = sao;
    }
}
