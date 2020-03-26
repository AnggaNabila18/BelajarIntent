package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent bukabrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Melakukan Panggilan
    public void panggil (View view)
    {
        String nomor    = "0895325910615";
        Intent panggil  = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    //Membuka Browser
    public void buka(View view)
    {
        String url = "https://babangkoding18.blogspot.com";
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }

    //Membuka Tentang Aplikasi
    public void tentang(View view)
    {
        Intent tentang= new Intent(MainActivity.this, tentang.class);
        startActivity(tentang); }
}
