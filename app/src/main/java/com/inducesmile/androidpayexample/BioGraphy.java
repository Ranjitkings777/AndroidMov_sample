package com.inducesmile.androidpayexample;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by SrikanthBk(ThinkNext)peace on 25-04-2018.
 */

public class BioGraphy extends Fragment {
    private ListView lv;
    private CustomAdapter customAdapter;
    private ArrayList<ImageModel> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.appu1, R.drawable.rockline,R.drawable.pavanwadeyar};
    private String[] myImageNameList = new String[]{"Puneeth Rajkumar ", "Venkatesh ", "Pavan Wadeyar "};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View v=inflater.inflate(R.layout.fragment_biography, container, false);
        lv = (ListView) v.findViewById(R.id.listView);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Launch ViewImage.java using intent
                Intent i = new Intent(getActivity(), SingleBioGraphy.class);
                // Send captured position to ViewImage.java
                i.putExtra("id", position);
                // Start ViewImage.java
                startActivity(i);
            }
        });

        imageModelArrayList = populateList();
        Log.d("hjhjh",imageModelArrayList.size()+"");
        customAdapter = new CustomAdapter(getActivity(),imageModelArrayList);
        lv.setAdapter(customAdapter);
        return v;
    }
    private ArrayList<ImageModel> populateList(){

        ArrayList<ImageModel> list = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            ImageModel imageModel = new ImageModel();
            imageModel.setName(myImageNameList[i]);
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Mini Biography");
    }
    public void simpleTried(){

    }
}
