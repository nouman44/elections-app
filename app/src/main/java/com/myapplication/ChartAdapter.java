package com.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Math.round;

public class ChartAdapter extends BaseAdapter {

    Context context;
    ArrayList<ChartRow> data;
    private static LayoutInflater inflater = null;
    static int max = 0;

    public ChartAdapter(Context context, ArrayList<ChartRow> data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;


        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.list_item, null);

        TextView silsillah = (TextView) vi.findViewById(R.id.silsillahList);
        TextView gharaana = (TextView) vi.findViewById(R.id.gharaanaList);
        TextView name = (TextView) vi.findViewById(R.id.nameList);
        TextView father = (TextView) vi.findViewById(R.id.fatherList);
        TextView cnic = (TextView) vi.findViewById(R.id.cnicList);
        TextView age = (TextView) vi.findViewById(R.id.ageList);
        TextView address = (TextView) vi.findViewById(R.id.addressList);
        TextView blockCode = (TextView) vi.findViewById(R.id.blockCodeList);
        TextView number = (TextView) vi.findViewById(R.id.numberList);
        TextView vote = (TextView) vi.findViewById(R.id.voteList);

//        TextView lineSil = (TextView) vi.findViewById(R.id.lineSil);
//        TextView lineGhar = (TextView) vi.findViewById(R.id.lineGhar);
//        TextView lineName = (TextView) vi.findViewById(R.id.lineName);
//        TextView lineBlk = (TextView) vi.findViewById(R.id.lineBlk);
//        TextView lineNum = (TextView) vi.findViewById(R.id.lineNum);
//        TextView lineFather = (TextView) vi.findViewById(R.id.lineFather);
//        TextView lineCnic = (TextView) vi.findViewById(R.id.lineCnic);
//        TextView lineAge = (TextView) vi.findViewById(R.id.lineAge);
//        TextView lineAddress = (TextView) vi.findViewById(R.id.lineAddress);



        String silNo = data.get(position).getSilsillahNumber();
        String gharNum = data.get(position).getGhaaranaNumber();
        String namee = data.get(position).getName();
        String fathersNamee = data.get(position).getFathersName();
        String cnicc = data.get(position).getCnic();
        String agee = data.get(position).getAge();
        String addresss = data.get(position).getAddress();
        String blockNo = data.get(position).getBlockCode();
        String phoneNo = data.get(position).getPhoneNumber();
        String voteCasted = data.get(position).getVoteCasted();


        silsillah.setText(silNo);
        gharaana.setText(gharNum);
        name.setText(namee);
        father.setText(fathersNamee);
        cnic.setText(cnicc);
        age.setText(agee);
        address.setText(addresss);
        blockCode.setText(blockNo);
        number.setText(phoneNo);
        vote.setText(voteCasted);

//        max = vi.getMeasuredHeight();
//        lineSil.setHeight(vi.getMeasuredHeight());
//        lineGhar.setHeight(vi.getMeasuredHeight());
//        lineName.setHeight(max);
//        lineFather.setHeight(max);
//        lineCnic.setHeight(max);
//        lineAge.setHeight(max);
//        lineAddress.setHeight(max);
//        lineBlk.setHeight(max);
//        lineNum.setHeight(max);

        return vi;
    }
}
