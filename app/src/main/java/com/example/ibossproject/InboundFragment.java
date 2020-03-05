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
public class InboundFragment extends Fragment {
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
        mainView =  inflater.inflate(R.layout.fragment_inbound, container, false);

        //  Main page button
        TextView inbound_manual_btn = (TextView) mainView.findViewById(R.id.inbound_manual_icon);
        TextView inbound_intelligent_btn = (TextView) mainView.findViewById(R.id.inbound_intelligent_icon);
        TextView inbound_qrcode_btn = (TextView) mainView.findViewById(R.id.inbound_qrcode_icon);
        TextView inbound_barcode_btn = (TextView) mainView.findViewById(R.id.inbound_barcode_icon);

        inbound_manual_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.set_inbound_manual_fragment_click();
                Log.d("TAG", "inbound_manual_btn clicked!");
            }
        });
        inbound_intelligent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "inbound_intelligent_btn clicked!");
            }
        });
        inbound_qrcode_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "inbound_qrcode_btn clicked!");
            }
        });
        inbound_barcode_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "inbound_barcode_btn clicked!");
            }
        });

        return mainView;
    }

}
