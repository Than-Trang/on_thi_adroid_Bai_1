package com.example.bai2_thi;

public class Co {
    private int hinhAnh;
    private String title;
    private String moTa;

    public Co(int hinhAnh, String title, String moTa) {
        this.hinhAnh = hinhAnh;
        this.title = title;
        this.moTa = moTa;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
