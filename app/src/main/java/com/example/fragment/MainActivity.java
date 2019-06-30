package com.example.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.assist.AssistStructure;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction t = fragmentManager.beginTransaction();
        WindowManager windowManager = getWindowManager();

       Display display = windowManager.getDefaultDisplay();

       if(display.getWidth()> display.getHeight())
        {
            FirstFragment firstFragment = new FirstFragment();
            t.replace(R.id.content,firstFragment);
        }
            else
                {
                SecondFragment secondFragment = new SecondFragment();
                t.replace(R.id.content,secondFragment);
                }
         t.commit();
    }
}
