package com.example.bai2_thi;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;

import java.util.List;

public class Co_Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Co> listCo;

    public Co_Adapter(Context context, int layout, List<Co> listCo) {
        this.context = context;
        this.layout = layout;
        this.listCo = listCo;
    }

    @Override
    public int getCount() {
        return listCo.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate( layout,null);

        TextView txt2 = (TextView) convertView.findViewById(R.id.moTa);
        TextView txt1 = (TextView) convertView.findViewById(R.id.title);
        ImageView image =(ImageView) convertView.findViewById(R.id.imageview);

        Co co = listCo.get(position);
        txt1.setText(co.getTitle());
        txt2.setText(co.getMoTa());
        image.setImageResource(co.getHinhAnh());



        return convertView;
    }
}
