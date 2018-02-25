package com.example.rizkianiktia.rizkianik_1202154339_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AquaItem  {
    //deklarasi
    private String nama, info, deskripsi;
    private int gambar;

    public AquaItem(String nama, String info, String deskripsi, int gambar) {
        this.nama = nama;
        this.info = info;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }
    public static Intent toClick(Context context, String title, String desc, @DrawableRes int img){
        Intent in = new Intent(context, DetailMenu.class);
        in.putExtra("EXTRA_TITLE",title); //putExtra sebuah metode dari Intent yang digunakan untuk mengirimkan data ke activity yang dituju
        in.putExtra("EXTRA_DESC",desc);
        in.putExtra("EXTRA_IMG",img);
        return in;
    }
//method setter getter
    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getInfo()
    {
        return info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}


