package com.example.ibossproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainView = inflater.inflate(R.layout.fragment_inbound_manual, container, false);

        final LinearLayout LinearLayout_table = (LinearLayout) mainView.findViewById(R.id.inbound_table_layout_id);
        final LinearLayout LinearLayout_confrim = (LinearLayout) mainView.findViewById(R.id.inbound_confrim_layout_id);
        Button inbound_manual_add_btn = (Button) mainView.findViewById(R.id.inbound_manual_add);
        Button inbound_manual_remove_btn = (Button) mainView.findViewById(R.id.inbound_manual_remove);
        Button inbound_manual_save_btn = (Button) mainView.findViewById(R.id.inbound_manual_save);
        Button inbound_table_confirm_btn = (Button) mainView.findViewById(R.id.inbound_table_confirm);
        Button inbound_table_cancel_btn = (Button) mainView.findViewById(R.id.inbound_table_cancel);

        inbound_manual_add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout_table.setVisibility(View.VISIBLE);
                LinearLayout_confrim.setVisibility(View.VISIBLE);
                Log.d("TAG", "inbound_manual_add_btn clicked!");
            }
        });
        inbound_manual_remove_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("TAG", "inbound_manual_remove_btn clicked!");
            }
        });
        inbound_manual_save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "inbound_manual_save_btn clicked!");
            }
        });
        inbound_table_confirm_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LinearLayout_table.setVisibility(View.INVISIBLE);
                LinearLayout_confrim.setVisibility(View.INVISIBLE);
                Log.d("TAG", "inbound_table_confirm_btn clicked!");
            }
        });
        inbound_table_cancel_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LinearLayout_table.setVisibility(View.INVISIBLE);
                LinearLayout_confrim.setVisibility(View.INVISIBLE);
                Log.d("TAG", "inbound_table_cancel_btn clicked!");
            }
        });
        return mainView;

    }
}
