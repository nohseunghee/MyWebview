package com.hanbit.user.myappwebview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 2016-06-25.
 */
public class MovieAdapter extends BaseAdapter {

    private Context context;
    private String[] movieValues;

    public MovieAdapter(Context context, String[] movieValues) {
        this.context = context;
        this.movieValues = movieValues;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;

        if(convertView == null){
            gridView = new View(context);
            gridView = inflater.inflate(R.layout.movie, null);
            TextView textView = (TextView) gridView.findViewById(R.id.textView);
            textView.setText(movieValues[position]);
            ImageView imageView = (ImageView) gridView.findViewById(R.id.imageView);

            String movie = movieValues[position];


            switch (movie){
                case "mov01":imageView.setImageResource(R.drawable.mov01);break;
                case "mov02":imageView.setImageResource(R.drawable.mov02);break;
                case "mov03":imageView.setImageResource(R.drawable.mov03);break;
                case "mov04":imageView.setImageResource(R.drawable.mov04);break;
                case "mov05":imageView.setImageResource(R.drawable.mov05);break;
                case "mov06":imageView.setImageResource(R.drawable.mov06);break;
                case "mov07":imageView.setImageResource(R.drawable.mov07);break;
            }
        }else{
            gridView = convertView;
        }
        return gridView;
    }
}
