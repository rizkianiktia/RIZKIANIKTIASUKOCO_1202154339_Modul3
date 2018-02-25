package com.example.rizkianiktia.rizkianik_1202154339_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AquaAdapter mAdapter;

    public static ArrayList<AquaItem> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecycleItem);
        mAdapter = new AquaAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);



        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count); //dapatkan integer dari file sumber daya integers.xml

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount)); //Mengubah LinearLayoutManager ke GridLayoutManager

    }
    //isi dari ArrayList
    public ArrayList<AquaItem> isi(){
        ArrayList<AquaItem> data = new ArrayList<>();
        data.add(new AquaItem("Aqua","Ini adalah air minum merk AQUA","AQUA berasal dari sumber mata air yang terpilih dengan segala kemurnian dan kandungan mineral alami yang terpelihara ",R.drawable.aqua));
        data.add(new AquaItem("Pristine","Ini adalah air minum merk PRISTINE","",R.drawable.pristine));
        data.add(new AquaItem("Le Minerale","Ini adalah air minum merk LE MINERALE","",R.drawable.leminerale));
        data.add(new AquaItem("Cleo","Ini adalah air minum merk CLEAO","",R.drawable.cleo));
        data.add(new AquaItem("Club","Ini adalah air minum merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new AquaItem("Amidis","Ini adalah air minum merk AMIDIS","",R.drawable.amidis));
        data.add(new AquaItem("Equil","Ini adalah air minum merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new AquaItem("Evian","Ini adalah air minum merk EVIAN","",R.drawable.evian));
        data.add(new AquaItem("Nestle","Ini adalah air minum merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new AquaItem("Vit","Ini adalah air minum merk VIT","",R.drawable.vit));
        return data;

    }
}
