package com.itk16.bk.pc.luyentoanlop1cungbe.adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.itk16.bk.pc.luyentoanlop1cungbe.Bai;
import com.itk16.bk.pc.luyentoanlop1cungbe.R;
import com.itk16.bk.pc.luyentoanlop1cungbe.model.Lesson;

import java.util.ArrayList;

import static com.itk16.bk.pc.luyentoanlop1cungbe.R.drawable.abc_vector_test;
import static com.itk16.bk.pc.luyentoanlop1cungbe.R.drawable.back;
import static com.itk16.bk.pc.luyentoanlop1cungbe.R.drawable.lock;

public class CustomAdapter extends ArrayAdapter<Lesson> {
    private Context context;
    private int Resource;
    private final String TAG = getClass().getSimpleName();
    private ArrayList<Lesson> mArray;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Lesson> objects) {
        super(context, resource, objects);
        this.context = context;
        this.Resource = resource;
        this.mArray = objects;

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
       if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.im_lock = convertView.findViewById(R.id.Lock);
            viewHolder.tv_Title = convertView.findViewById(R.id.Title);
            viewHolder.bt_hoc = convertView.findViewById(R.id.bt_hoc);
            convertView.setTag(viewHolder);
            //Log.d(TAG, (position+1)+"");
       }
        else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        final Lesson lesson = mArray.get(position);
        if(lesson.getmLock())
        {
            viewHolder.im_lock.setBackgroundResource(R.drawable.lock);
          //  Log.d(TAG, (position+1)+"");
        }
        else{
            switch (lesson.getSao())
            {
                case 0:
                    viewHolder.im_lock.setBackgroundResource(R.drawable.sao0);
                    break;
                case 1:
                    viewHolder.im_lock.setBackgroundResource(R.drawable.sao1);
                    break;
                case 2:
                    viewHolder.im_lock.setBackgroundResource(R.drawable.sao2);
                    break;
                case 3:
                    viewHolder.im_lock.setBackgroundResource(R.drawable.sao3);
                    break;
                    default:
                        break;
            }
        }

        viewHolder.tv_Title.setText(lesson.getmTenbaihoc());
        viewHolder.bt_hoc.setText("Bắt Đầu");
        viewHolder.bt_hoc.setBackgroundResource(R.drawable.custom_bt_play);
        viewHolder.bt_hoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lesson.getmLock()){
                    Toast.makeText(context, "Bạn chưa được phép chơi màn này!", Toast.LENGTH_SHORT).show();
                }
                else
                {

                }
            }
        });
        return convertView;
    }


    public static class ViewHolder
    {
        ImageView im_lock;
        TextView tv_Title;
        Button bt_hoc;
    }
}
