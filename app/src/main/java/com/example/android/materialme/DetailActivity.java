package com.example.android.materialme;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);
        TextView sportsDetailInfo = findViewById(R.id.subTitleDetail);
        getWindow().setSharedElementEnterTransition(TransitionInflater.from(this).inflateTransition(R.transition.shared_element));


        Intent intent = getIntent();
        String titleString = intent.getStringExtra("title");
        int imagePic = intent.getIntExtra("image_resource",0);
        String details = intent.getStringExtra("details");


        sportsTitle.setText(titleString);
        Glide.with(this).load(imagePic).into(sportsImage);
        sportsDetailInfo.setText(details);

    }


}
