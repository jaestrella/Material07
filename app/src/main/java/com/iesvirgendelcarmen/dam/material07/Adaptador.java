package com.iesvirgendelcarmen.dam.material07;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by matinal on 23/11/2017.
 */

public class Adaptador extends FragmentStatePagerAdapter {
   int numTab;

    public Adaptador(FragmentManager fm,int numTab) {
        super(fm);
        this.numTab=numTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Fragmento1 primero=new Fragmento1();
                return primero;
            case 1:
                Fragmento2 segundo=new Fragmento2();
                return segundo;
            case 2:
                Fragmento3 tercero=new Fragmento3();
                return tercero;
        }
        return null;
    }

    @Override
    public int getCount() {
        return numTab;
    }
}
