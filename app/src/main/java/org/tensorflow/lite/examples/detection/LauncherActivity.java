package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        ImageView jinnahimage= (ImageView) findViewById(R.id.jinnahicon);
        TextView tv1=(TextView) findViewById(R.id.tvsplash);
        TextView tv2=(TextView ) findViewById(R.id.tvsplash2);
        Animation animsplash= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        jinnahimage.setAnimation(animsplash);
        tv1.setAnimation(animsplash);
        tv2.setAnimation(animsplash);

        ImageView blindimage = (ImageView) findViewById(R.id.blindicon);
        Animation fromtop = AnimationUtils.loadAnimation(this,R.anim.fade);
        blindimage.setAnimation(fromtop);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LauncherActivity.this,DetectorActivity.class);
                startActivity(i);

                finish();
            }
        }, 4*1000);


    }
}