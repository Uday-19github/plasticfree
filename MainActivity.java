package com.example.aquaapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.aquaapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item ->{

            switch (item.getItemId()){

                case R.id.home1:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.water2:
                    replaceFragment(new WaterFragment());
                    break;
                case R.id.cleanandsanitation3:
                    replaceFragment(new cleanandsanitationFragment());
                    break;
                case R.id.reward4:
                    replaceFragment(new RewardFragment());
                    break;

            }

            return true;

        });
    }
    private void replaceFragment(Fragment fragment ){
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}