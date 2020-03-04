package com.example.ibossproject;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private View mainView;
    private MainActivity mainActivity;
    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        mainActivity = (MainActivity)context;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        mainView =  inflater.inflate(R.layout.fragment_main, container, false);

        //  Main page button
        TextView inbound_btn = (TextView) mainView.findViewById(R.id.inbound_id);
        TextView outbound_btn = (TextView) mainView.findViewById(R.id.outbound_id);
        TextView report_btn = (TextView) mainView.findViewById(R.id.report_id);
        TextView customer_btn = (TextView) mainView.findViewById(R.id.customer_id);

        inbound_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.set_inbound_fragment_click();
                Log.d("TAG", "inbound_btn clicked!");
            }
        });
        outbound_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "outbound_btn clicked!");
            }
        });
        report_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "report_btn clicked!");
            }
        });
        customer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "customer_btn clicked!");
            }
        });

        return mainView;
    }
}
