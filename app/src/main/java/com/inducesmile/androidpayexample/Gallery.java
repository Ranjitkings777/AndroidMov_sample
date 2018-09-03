package com.inducesmile.androidpayexample;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by SrikanthBk(ThinkNext)peace on 25-04-2018.
 */

public class Gallery extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View v=inflater.inflate(R.layout.fragment_gallery, container, false);
        // Locate GridView in listview_main.xml
        GridView gridview = (GridView) v.findViewById(R.id.gridview);

        // Set the ImageAdapter into GridView Adapter
        gridview.setAdapter(new ImageAdapter(getActivity()));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // Launch ViewImage.java using intent
                Intent i = new Intent(getActivity(), SingleItemView.class);

                // Show the item position using toast
                /*Toast.makeText(getActivity(), "Position " + position,
                        Toast.LENGTH_SHORT).show();*/

                // Send captured position to ViewImage.java
                i.putExtra("id", position);

                // Start ViewImage.java
                startActivity(i);
            }
        });

        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Gallery");
    }
}
