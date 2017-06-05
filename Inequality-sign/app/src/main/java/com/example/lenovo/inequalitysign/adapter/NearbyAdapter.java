package com.example.lenovo.inequalitysign.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.lenovo.inequalitysign.R;
import com.example.lenovo.inequalitysign.entity.Nearby;

import java.util.List;

/**
 * Created by ff on 2016/12/3.
 */
public class NearbyAdapter extends BaseAdapter {
    private List <Nearby> friends;
    private Context c;
//    private ImageView img;
//    private TextView name;
//    private TextView desc;

    public NearbyAdapter(Context c, List<Nearby> friends) {
        this.c = c;
        this.friends = friends;
    }

    @Override
    public int getCount() {
        return friends.size();//获取长度
    }

    @Override
    public Object getItem(int position) {//获取一条
        return friends.get(position);
    }

    @Override
    public long getItemId(int position) {//获取一条的id
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null ){
            convertView= LayoutInflater.from(c).inflate(R.layout.nearby_adapter,null);//jiazaibujv
        }
//        img=(ImageView) convertView.findViewById(R.id.hearder1);
//        img.setImageResource(friends.get(position).getImg());//fuzhi
//        name=(TextView) convertView.findViewById(R.id.name1);
//        name.setText(friends.get(position).getName().toString());

        return convertView;
    }
}
