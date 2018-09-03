package com.inducesmile.androidpayexample;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SingleBioGraphy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_bio_graphy);
        //
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        BioGraphyImageAdapter bioGraphyImageAdapter=new BioGraphyImageAdapter(this);
        TextView textViewBio=(TextView)findViewById(R.id.textViewBio);
        textViewBio.setText(bioGraphyImageAdapter.bioTextViews[position]);
        Typeface custom_fonts=Typeface.createFromAsset(getAssets(),"fonts/Bluefish_Eroded DEMO.otf");
        textViewBio.setTypeface(custom_fonts);
        //Bluefish_Eroded DEMO.otf
    }
}
