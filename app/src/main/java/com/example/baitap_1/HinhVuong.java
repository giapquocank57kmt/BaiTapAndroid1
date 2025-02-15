package com.example.baitap_1;

public class HinhVuong {
    private int canh;
    private Double chuvi, dientich;

    public void tinh(){
        chuvi = (double) (canh*4);
        dientich = Math.pow(canh,2);
    }

    public Double getChuvi() {
        return chuvi;
    }

    public Double getDientich() {
        return dientich;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }
}
