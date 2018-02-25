package com.example.rizkianiktia.rizkianik_1202154339_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {
    private static int splashInterval = 200; //untuk mengatur durasi/lama splashcreen yaitu sebesar 200m/s

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() { //ketika dijalankan
                Intent i = new Intent(SplashScreenActivity.this,LoginActivity.class); //masuk ke aktivitas selanjutnya
                startActivity(i);

                Toast.makeText(SplashScreenActivity.this, "Berhasil Masuk", Toast.LENGTH_LONG).show();
                this.finish();
            }
            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);
    }
}
