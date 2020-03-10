package com.example.ibossproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InboundManualFragment extends Fragment {
    private View mainView;
    private MainActivity mainActivity;
    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        mainActivity = (MainActivity)context;
    }

    public InboundManualFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainView = inflater.inflate(R.layout.fragment_inbound_manual, container, false);

        return mainView;

    }

}
