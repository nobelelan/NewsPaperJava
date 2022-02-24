package com.parulson.newsapijavacodingwithevan;

import com.parulson.newsapijavacodingwithevan.models.NewsHeadLines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {

    void onFetchData(List<NewsHeadLines> list, String message);
    void onError(String message);
}
