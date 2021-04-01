package com.example.circle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {
    CircleMenu circleMenu;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleMenu=findViewById(R.id.circle_menu);
        constraintLayout=findViewById(R.id.Constraint_menu);

        circleMenu.setMainMenu(Color.parseColor("#C6B79B"), R.mipmap.menu, R.mipmap.cancel_icon)
                .addSubMenu(Color.parseColor("#e45826"), R.mipmap.home)
                .addSubMenu(Color.parseColor("#f0a500"), R.mipmap.gps)
                .addSubMenu(Color.parseColor("#b34180"), R.mipmap.notification)
                .addSubMenu(Color.parseColor("#abf2fb"), R.mipmap.setting)
                .addSubMenu(Color.parseColor("#abf2fb"), R.mipmap.search)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Toast.makeText(MainActivity.this,"home",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#F79489"));
                                break;
                                case 1:
                                Toast.makeText(MainActivity.this,"Gps",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#900020"));
                                break;
                                case 2:
                                Toast.makeText(MainActivity.this,"notification",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#C6B79B"));
                                break;
                                case 3:
                                Toast.makeText(MainActivity.this,"setting",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#2F2440"));
                                break;
                                case 4:
                                Toast.makeText(MainActivity.this,"search",Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#BA0F30"));
                                break;

                        }

                    }
                });
    }
}