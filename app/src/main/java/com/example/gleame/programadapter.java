package com.example.gleame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class programadapter extends ArrayAdapter<program> {
    private final Context ct;
    private final ArrayList<program> arr;
    public programadapter(@NonNull Context context, int resource, @NonNull List<program> objects) {
        super(context, resource, objects);
        this.ct=context;
        this.arr=new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            LayoutInflater i=(LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=i.inflate(R.layout.courses_item,null);
        }
        if(arr.size()>0){
            program program= arr.get(position);
        }
        return convertView;
    }
}
