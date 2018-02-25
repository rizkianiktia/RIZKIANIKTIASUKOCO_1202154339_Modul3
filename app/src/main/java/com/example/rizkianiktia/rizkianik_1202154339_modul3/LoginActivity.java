package com.example.rizkianiktia.rizkianik_1202154339_modul3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //deklarasi
    private Button a;
    private EditText b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //deklarasi
        a = (Button) findViewById(R.id.button_login);
        b = (EditText) findViewById(R.id.username);
        c = (EditText) findViewById(R.id.password);
    }

    //ketika menjalankan method login
    public void login(View view) {
        final String user = b.getText().toString();
        String pass = c.getText().toString();

        if ((user.equals("EAD") && pass.equals("MOBILE"))) { //Jika user dan password benar
            Toast.makeText(this, "Anda berhasil login", Toast.LENGTH_LONG).show();
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setTitle("Alert Message");
            alert.setMessage("Login Success")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent d = new Intent(LoginActivity.this, DaftarMenu.class);
                            d.putExtra("username", "EAD");
                            startActivity(d);
                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();

        } else if (user.isEmpty() && pass.isEmpty()) { //ketika user dan password kosong
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Masukkan data terlebih dahulu");
            alert.setMessage("Login Failed")
                    .setCancelable(false)
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });

            AlertDialog alertDialog = alert.create();
            alertDialog.show();

        } else if (!user.equals("EAD") && !pass.equals("MOBILE")) { //ketika user dan password tidak sesuai
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setTitle("Username & Password tidak sesuai");

            alert.setMessage("Login Failed")
                    .setCancelable(false)
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });


            AlertDialog alertDialog = alert.create();

            alertDialog.show();
        }
    }
}