package com.inducesmile.androidpayexample;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.MediaStore.Images;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SingleItemView extends AppCompatActivity {
    ImageView imageViewShare;
    ImageView imageView;
    Uri uri;
    Context context;
    ImageAdapter imageAdapter;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_item_view);
        // Get position from intent passed from MainActivity.java
        imageViewShare=(ImageView)findViewById(R.id.imageViewShare);

        Intent i = getIntent();

        position = i.getExtras().getInt("id");

        // Open the Image adapter
        imageAdapter = new ImageAdapter(this);

        // Locate the ImageView in single_item_view.xml
         imageView = (ImageView) findViewById(R.id.image);

        // Get image and position from ImageAdapter.java and set into ImageView
        imageView.setImageResource(imageAdapter.mThumbIds[position]);
        imageViewShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap= BitmapFactory.decodeResource(getResources(),imageAdapter.mThumbIds[position]);
                String path = getExternalCacheDir()+"/shareimage.jpg";
                java.io.OutputStream out = null;
                java.io.File file=new java.io.File(path);
                try {
                    out = new java.io.FileOutputStream(file);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out);
                    out.flush();
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                path = file.getPath();
                Uri bmpUri = Uri.parse("file://" + path);

                Intent shareIntent = new Intent();
                shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.putExtra(Intent.EXTRA_STREAM, bmpUri);
                shareIntent.setType("image/jpg");
                startActivity(Intent.createChooser(shareIntent, "Share with"));
                //
            }
        });
    }
}
