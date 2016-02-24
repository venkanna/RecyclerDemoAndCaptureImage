package com.venkanna.recycyclerdemo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Venkanna on 23/2/16.
 */
public class MarketAdapter extends RecyclerView.Adapter<DataViewHolder> {

    //1.create constructer


    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the xml file
        View view=null;
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
   //set data
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}



