package com.example.gridview_task461;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    int logo[];
    LayoutInflater layoutInflater;

    public ImageAdapter(Context context, int[] animals) {
        this.mContext = context;
        this.logo=logo;
        layoutInflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return logo.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.activity_gridview, null);
        ImageView icon = view.findViewById(R.id.icon);
        icon.setImageResource(logo[i]);
        return view;
    }
}
