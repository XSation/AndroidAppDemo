package com.xk.androidappdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.facebook.litho.ComponentContext;

public class MainActivity extends AppCompatActivity {

    private MBroadcastReceiver mBroadcastReceiver;
    private MView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ComponentContext context = new ComponentContext(this);

        setContentView(R.layout.activity_main);


        mView = (MView) findViewById(R.id.mview);
        ImageView imageView = (ImageView) findViewById(R.id.image);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.test);
        mView.setBitmap(bitmap);


    }


    @Override
    protected void onResume() {
        super.onResume();
        mView.invalidate();
    }
}
