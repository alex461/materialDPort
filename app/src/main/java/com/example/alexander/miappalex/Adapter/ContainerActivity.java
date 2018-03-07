package com.example.alexander.miappalex.Adapter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.alexander.miappalex.R;
import com.example.alexander.miappalex.fragment.HomeFragment;
import com.example.alexander.miappalex.fragment.ProfileFragment;
import com.example.alexander.miappalex.fragment.SearchFragment;

public class ContainerActivity extends AppCompatActivity {

    private BottomNavigationView btb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        btb =(BottomNavigationView)findViewById(R.id.bottonbar);
        setFragmentbyDefault();

        btb.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                boolean fragmentTransaction = false;
                Fragment fragment = null;

                switch (item.getItemId()){

                    case R.id.tabsearch:

                        fragment = new SearchFragment();
                        fragmentTransaction =true;
                        
                        break;

                    case R.id.tabhome:

                        fragment = new HomeFragment();
                        fragmentTransaction =true;


                        break;

                    case R.id.tabprofile:

                        fragment = new ProfileFragment();
                        fragmentTransaction =true;
                        break;

                }

                if(fragmentTransaction){
                    changeFragment(fragment);
                }

                return true;
            }
        });

    }

    private void setFragmentbyDefault(){
        changeFragment(new HomeFragment());

    }

    private void changeFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null)
                .commit();

    }
}
