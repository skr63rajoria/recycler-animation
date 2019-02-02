package com.rajouriya.shubham.recyclerview_animation.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rajouriya.shubham.recyclerview_animation.R;
import com.rajouriya.shubham.recyclerview_animation.model.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyViewHolder> {

    private ArrayList<Country> countries;
    private Context mContext;

    public CountryAdapter(Context mContext,ArrayList<Country> countries){
        this.countries = countries;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_cell, viewGroup, false);
        return new CountryAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Country itemModel = (Country)countries.get(position);
        holder.countryName.setText(itemModel.getCountryName());
        holder.capitalName.setText(itemModel.getCapitalName());
        holder.itemView.setTag(itemModel);
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView countryName, capitalName;

        public MyViewHolder(View view) {
            super(view);
            countryName = (TextView) view.findViewById(R.id.parent_tv);
            capitalName = (TextView) view.findViewById(R.id.child_tv);
        }
    }

}
