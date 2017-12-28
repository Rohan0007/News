package com.example.android.news;

/**
 * Created by Rohan on 10/17/17.
 */

public class News {
    private String mTitle;
    private String mDate;
    private String mSection;
    private String mUrl;
    private String[] tempDate;

    public News(String title, String date, String section, String url) {
        tempDate = date.split("T");
        mTitle = title;
        mSection = section;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() {
        mDate = tempDate[0];
        return mDate;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }

}
