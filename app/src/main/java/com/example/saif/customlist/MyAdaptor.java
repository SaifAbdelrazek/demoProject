package com.example.saif.customlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.saif.customlist.R;

public class MyAdaptor extends ArrayAdapter<String> {

    String [] Names;
    String [] Jobs;
    int [] pictures;
    Context mContext;
    public MyAdaptor(@NonNull Context context, String[] Peoplenames,String[]PeopleJobs,int []photos ) {
        super(context, R.layout.list_item);
        this.Jobs=PeopleJobs;
        this.Names=Peoplenames;
        this.pictures=photos;
        this.mContext=context;


    }

    @Override
    public int getCount() {
        return Names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder=new ViewHolder();
        if(convertView==null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.list_item, parent, false);
            mViewHolder.Profile = (ImageView) convertView.findViewById(R.id.imageView2);
            mViewHolder.Pname = (TextView) convertView.findViewById(R.id.textView_Name);
            mViewHolder.Pj = (TextView) convertView.findViewById(R.id.textView_Job);
            convertView.setTag(mViewHolder);
        }else {

            mViewHolder=(ViewHolder)convertView.getTag();
        }
            mViewHolder.Profile.setImageResource(pictures[position]);
            mViewHolder.Pname.setText(Names[position]);
            mViewHolder.Pj.setText(Jobs[position]);

        return convertView;
    }
    static class ViewHolder{
        ImageView Profile;
        TextView Pname;
        TextView Pj;


    }
}
