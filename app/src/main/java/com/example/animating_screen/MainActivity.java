package com.example.animating_screen;

import android.os.CountDownTimer;
import android.view.Gravity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    private static int  SPLASH_SCREEN =5000 ;
    //variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView youth, empowerment, foundation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);
      final DrawerLayout drawer=findViewById(R.id.drawer_layout);
        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image = findViewById(R.id.imageView);
        youth = findViewById(R.id.textView);
        empowerment = findViewById(R.id.textView2);
        foundation = findViewById(R.id.textView3);

        image.setAnimation(bottomAnim);
        youth.setAnimation(bottomAnim);
        empowerment.setAnimation(bottomAnim);
        foundation.setAnimation(bottomAnim);
        new CountDownTimer(4000,1000){
            @Override
            public void onTick(long l) {
            }
            @Override
            public void onFinish() {
                drawer.openDrawer(Gravity.LEFT);
            }
        }.start();

    }
}