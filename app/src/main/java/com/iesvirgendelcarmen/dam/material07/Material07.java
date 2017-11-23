package com.iesvirgendelcarmen.dam.material07;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Material07 extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager paginador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material07);

        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        paginador=(ViewPager)findViewById(R.id.contenedor2);

        TabLayout.Tab primerTab=tabLayout.newTab();
        primerTab.setText("PRIMERO");
        primerTab.setIcon(R.drawable.icono1);
        tabLayout.addTab(primerTab);

        TabLayout.Tab segundoTab=tabLayout.newTab();
        segundoTab.setText("SEGUNDO");
        segundoTab.setIcon(R.drawable.icono2);
        tabLayout.addTab(segundoTab);

        TabLayout.Tab tercerTab=tabLayout.newTab();
        tercerTab.setText("TERCERO");
        tercerTab.setIcon(R.drawable.icono3);
        tabLayout.addTab(tercerTab);

        Adaptador adaptador=new Adaptador(getSupportFragmentManager(),tabLayout.getTabCount());
        paginador.setAdapter(adaptador);
        paginador.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        /*tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragmento=null;
                switch (tab.getPosition()){
                    case 0:
                        fragmento=new Fragmento1();
                        break;
                    case 1:
                        fragmento=new Fragmento2();
                        break;
                    case 2:
                        fragmento=new Fragmento3();
                        break;
                }

                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.contenedor,fragmento);
                ft.commit();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/
    }
}
