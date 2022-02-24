package com.parulson.newsapijavacodingwithevan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.parulson.newsapijavacodingwithevan.models.NewsHeadLines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    NewsHeadLines headLines;
    TextView tvTitle, tvAuthor, tvTime, tvDetail, tvContent;
    ImageView imgNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvTitle = findViewById(R.id.tvDetailTitle);
        tvAuthor = findViewById(R.id.tvDetailAuthor);
        tvTime = findViewById(R.id.tvDetailTime);
        tvDetail = findViewById(R.id.tvDetailDetail);
        tvContent = findViewById(R.id.tvDetailContent);
        imgNews = findViewById(R.id.imgDetailNews);

        headLines = (NewsHeadLines) getIntent().getSerializableExtra("data");

        tvTitle.setText(headLines.getTitle());
        tvAuthor.setText(headLines.getAuthor());
        tvTime.setText(headLines.getPublishedAt());
        tvDetail.setText(headLines.getDescription());
        tvContent.setText(headLines.getContent());
        Picasso.get().load(headLines.getUrlToImage()).into(imgNews);
    }
}