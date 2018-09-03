package com.inducesmile.androidpayexample;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by SrikanthBk(ThinkNext)peace on 25-04-2018.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }
    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    // Create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        // if it's not recycled, initialize some attributes
        if (convertView == null) {
            imageView = new ImageView(mContext);
            // Center crop image
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }
        // Set images into ImageView
        imageView.setImageResource(mThumbIds[position]);
        setScaleAnimation(imageView);
        return imageView;
    }
    // References to our images in res > drawable
    public Integer[] mThumbIds = { R.drawable.appu1, R.drawable.appu3,
            R.drawable.appu4, R.drawable.appu1, R.drawable.appu6,
            R.drawable.appu7, R.drawable.appu8, R.drawable.appu9,
            R.drawable.appu1, R.drawable.appu1, R.drawable.appu1,
            R.drawable.appu1, R.drawable.appu1, R.drawable.appu1,
            R.drawable.appu1, R.drawable.appu1, R.drawable.appu1,
            R.drawable.appu1, R.drawable.appu1 };
    private void setScaleAnimation(View view) {
        ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setDuration(1000);
        view.startAnimation(anim);
    }
}
