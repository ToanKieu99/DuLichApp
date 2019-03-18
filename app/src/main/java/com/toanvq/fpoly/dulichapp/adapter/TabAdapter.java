package com.toanvq.fpoly.dulichapp.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.toanvq.fpoly.dulichapp.fragment.Fragment_Bac;
import com.toanvq.fpoly.dulichapp.fragment.Fragment_Trung;
import com.toanvq.fpoly.dulichapp.fragment.Fragment_nam;

public class TabAdapter extends FragmentStatePagerAdapter {
    private Fragment_Bac fragment_bac;
    private Fragment_nam fragment_nam;
    private Fragment_Trung fragment_trung;

    public TabAdapter(FragmentManager fm) {
        super(fm);
        fragment_bac = new Fragment_Bac();
        fragment_nam = new Fragment_nam();
        fragment_trung = new Fragment_Trung();
    }

    @Override
    public Fragment getItem(int i) {
      if (i ==0){
          return fragment_bac;

      }else if (i == 1){
          return fragment_trung;
      }else if (i == 2){
          return fragment_nam;
      }else {
          //TODO nothing
      }
      return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Miền Bắc";
            case 1:
                return "Miền Trung";
            case 2:
                return "Miền Nam";
        }
        return null;
    }
}
