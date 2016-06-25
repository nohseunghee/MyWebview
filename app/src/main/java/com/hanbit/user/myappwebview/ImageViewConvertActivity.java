package com.hanbit.user.myappwebview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewConvertActivity extends Activity implements View.OnClickListener{
    ImageView imageView;
    Button btNextImage, btPrevImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_convert);

        imageView = (ImageView)findViewById(R.id.imageView);

        btNextImage = (Button)findViewById(R.id.btNextImage);
        btPrevImage = (Button)findViewById(R.id.btPrevImage);


        btPrevImage.setVisibility(View.INVISIBLE);

        btNextImage.setOnClickListener(this);
        btPrevImage.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btPrevImage:
                imageView.setImageResource(R.drawable.jeju2);
                btPrevImage.setVisibility(View.INVISIBLE);
                btNextImage.setVisibility(View.VISIBLE);
                break;
            case R.id.btNextImage:
                imageView.setImageResource(R.drawable.jeju3);
                btNextImage.setVisibility(View.INVISIBLE);
                btPrevImage.setVisibility(View.VISIBLE);

                break;
        }

    }
}
