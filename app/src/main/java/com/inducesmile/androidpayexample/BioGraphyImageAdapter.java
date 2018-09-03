package com.inducesmile.androidpayexample;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by SrikanthBk(ThinkNext)peace on 03-05-2018.
 */

public class BioGraphyImageAdapter extends BaseAdapter {
    private Context mContext;
    public BioGraphyImageAdapter(Context c){
        mContext=c;
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
        TextView textView;
        // if it's not recycled, initialize some attributes
        if (convertView == null) {
            textView = new TextView(mContext);
            // Center crop image
           // textView.setScaleType(TextView.ScaleType.CENTER_CROP);
        } else {
            textView = (TextView) convertView;
        }
        // Set images into ImageView
        //imageView.setImageResource(mThumbIds[position]);
        //setScaleAnimation(imageView);
        textView.setText(bioTextViews[position]);
        return textView;
    }
    //reference for our images in drawable folder and adding textviews for that.

    public Integer[] bioImageIds={R.drawable.appu1, R.drawable.rockline,R.drawable.pavanwadeyar};
    public String[]  bioTextViews={"Puneeth Rajkumar (born 17 March 1975) is an Indian film actor , playback singer, producer and anchor who works primarily in Kannada cinema. He is famously known as Appu. He has been a lead actor in 27 films."
            , "Venkatesh (born 23 March 1963), better known by his stage name Rockline Venkatesh, is an Indian film actor, producer and distributor known for his works in Kannada, Tamil, and Hindi cinemas."
            , "Pavan Wadeyar is an Indian film director, screenwriter, lyricist, actor and producer best known for his work in Kannada cinema. He is known for writing and directing Govindaya Namaha (2012), for which he won the SIIMA."};
}
