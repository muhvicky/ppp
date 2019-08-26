package com.vickylatihan.akuproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button btOnOf;
    Boolean trunOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        imageView = (ImageView) findViewById (R.id.imgOn);
        btOnOf = (Button) findViewById (R.id.btOnOff);

        btOnOf.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                if (!trunOn){
                    imageView.setImageResource (R.drawable.trans_on);
                    ((TransitionDrawable)imageView.getDrawable ()).startTransition (3000);
                    trunOn=true;
                }else {
                    imageView.setImageResource (R.drawable.trans_off);
                    ((TransitionDrawable)imageView.getDrawable ()).startTransition (3000);
                    trunOn=false;
                }
            }
        });
    }

}
