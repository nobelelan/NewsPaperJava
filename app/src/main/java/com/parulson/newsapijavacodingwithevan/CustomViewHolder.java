package com.parulson.newsapijavacodingwithevan;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView tvTitle, tvSource;
    ImageView imgHeadline;
    CardView cardView;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvSource = itemView.findViewById(R.id.tvSource);
        imgHeadline = itemView.findViewById(R.id.imgHeadline);
        cardView = itemView.findViewById(R.id.main_container);
    }
}
