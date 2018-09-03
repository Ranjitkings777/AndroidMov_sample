package com.inducesmile.androidpayexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by srikanthbk(ThinkNext) peace on 25-04-2018.
 */

public class CastCrew extends Fragment {
    Spinner spinnerItem;
    String[] languageList = new String[]{"English", "ಕನ್ನಡ "};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View v=inflater.inflate(R.layout.fragment_cast, container, false);
        spinnerItem=(Spinner)v.findViewById(R.id.spinnerItem);
       /* ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                getActivity(),R.layout.cust_spin_text,languageList );*/
        spinnerItem.setAdapter(new ArrayAdapter(getActivity(), R.layout.activity_colortxtsp, R.id.colortxtsp, languageList));
      /*  spinnerArrayAdapter.setDropDownViewResource(R.layout.cust_spin_text );
        spinnerItem.setAdapter(spinnerArrayAdapter);*/
        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Cast/Crew");
    }
}
