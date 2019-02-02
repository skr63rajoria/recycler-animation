package com.rajouriya.shubham.recyclerview_animation.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;

import com.rajouriya.shubham.recyclerview_animation.R;
import com.rajouriya.shubham.recyclerview_animation.adapter.CountryAdapter;
import com.rajouriya.shubham.recyclerview_animation.model.Country;
import com.rajouriya.shubham.recyclerview_animation.util.Constants;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView animationRecyclerView;
    private CountryAdapter countryAdapter;
    private ArrayList<Country> countries;
    private Context mContext;
    private Button normalAnimBtn,reverseAnimBtn,randomAnimBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*initialise all UI elements*/
        animationRecyclerView = (RecyclerView)findViewById(R.id.animation_recycler_view);
        normalAnimBtn = (Button)findViewById(R.id.normal_anim_btn);
        reverseAnimBtn = (Button)findViewById(R.id.reverse_anim_btn);
        randomAnimBtn = (Button)findViewById(R.id.random_anim_btn);
        mContext = this;

        /*attach click listnet to buttn wigdet*/
        normalAnimBtn.setOnClickListener(this);
        reverseAnimBtn.setOnClickListener(this);
        randomAnimBtn.setOnClickListener(this);

        countries = Constants.getCountryList();

        /*make deault animation over recycler view*/
        makeRecyclerAniamtion(R.anim.layout_animation_fall_normal);
        countryAdapter = new CountryAdapter(mContext,countries);
        animationRecyclerView.setAdapter(countryAdapter);


    }

    private void makeRecyclerAniamtion(int resId) {

        /*resId will be passed at run time to provide specific animation over recycler view*/
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(mContext, resId);
        animationRecyclerView.setLayoutAnimation(animation);
        animationRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.normal_anim_btn:
                makeRecyclerAniamtion(R.anim.layout_animation_fall_normal);
                countryAdapter = new CountryAdapter(mContext,countries);
                animationRecyclerView.setAdapter(countryAdapter);
                break;
            case R.id.reverse_anim_btn:
                makeRecyclerAniamtion(R.anim.layout_animation_fall_reverse);
                countryAdapter = new CountryAdapter(mContext,countries);
                animationRecyclerView.setAdapter(countryAdapter);
                break;
            case R.id.random_anim_btn:
                makeRecyclerAniamtion(R.anim.layout_animation_fall_random);
                countryAdapter = new CountryAdapter(mContext,countries);
                animationRecyclerView.setAdapter(countryAdapter);
                break;
        }
    }
}
