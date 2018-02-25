package com.example.rizkianiktia.rizkianik_1202154339_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenu extends AppCompatActivity {
    //deklarasi

    private Button btnAdd, btnMin;
    private ImageView progress, lblImg;
    private TextView lblJudul, lblDesc, lblStatus;
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        btnAdd =findViewById(R.id.btnIsiTambah);
        btnMin = findViewById(R.id.btnIsiKurang);
        progress = findViewById(R.id.imgIsi);

        lblJudul = findViewById(R.id.lblJudul);
        lblDesc = findViewById(R.id.lblDeskripsi);
        lblImg = findViewById(R.id.lblImg);
        lblStatus = findViewById(R.id.lblStatus);

        Intent intent = getIntent();
        String title= intent.getStringExtra("etitle");
        String description=intent.getStringExtra("edesc");
        if(description.length()<1){description="Air Minum Dalam Kemasan (AMDK)adalah air yang diolah dengan teknologi khusus seperti teknologi sterilisasi kemudian dikemas dalam botol plastik atau wadah lainnya. Izin untuk perusahaan ini biasanya baru akan dikeluarkan bila hasil uji laboratorium baik. Agar mendapat air minum yang baik, perusahaan perlu selalu melakukan kontrol terhadap hasil air minum dan merawat peralatan produksinya dengan baik.\n";}
        int imgRes = intent.getIntExtra("eimg",0);

        setTitle(title);
        lblJudul.setText(title);
        lblDesc.setText(description);
        lblImg.setImageResource(imgRes);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });
    }
    public void tambahIsi(){ //kondisi menaikkan satu tingkat indikator hingga air penuh
        status();
        if (level==6){
            Toast.makeText(this,"Air Sudah Full",Toast.LENGTH_SHORT ).show();return;}
            progress.setImageLevel(++level);
    }
    public void kurangIsi(){ //kondisi mengurangi satu tingkat indikator air hingga rendah
        status();
        if (level==0){Toast.makeText(this, "Air Sedikit", Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
    }
    public void status(){
        lblStatus.setText(""+level+"L");
    }
}
