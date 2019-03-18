package com.toanvq.fpoly.dulichapp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.toanvq.fpoly.dulichapp.R;
import com.toanvq.fpoly.dulichapp.fragment.TrangChu_Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    private void init() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new TrangChu_Fragment()).commit();
    }


}
