package com.itk16.bk.pc.luyentoanlop1cungbe.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.itk16.bk.pc.luyentoanlop1cungbe.R;
import com.itk16.bk.pc.luyentoanlop1cungbe.model.Item_anh;

import java.util.ArrayList;
import java.util.List;





public class Custom_GridView  extends ArrayAdapter<Item_anh>{
    private  Context context;
    private int Item;
    private ArrayList<Item_anh> arrA;
    private int i;
    public Custom_GridView( @NonNull Context context, int resource,  @NonNull ArrayList<Item_anh> objects,int i) {
        super(context, resource, objects);
        this.context=context;
        this.Item= resource;
        this.arrA= objects;
        this.i= i;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,@NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_anh, parent, false);
        Item_anh IA= arrA.get(position);
        ImageView IM=(ImageView)convertView.findViewById(R.id.IM);
        IM.setImageResource(i);
        return convertView;
    }
}
