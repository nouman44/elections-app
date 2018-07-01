package com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ChartActivity extends Activity {
    ListView listview;
    ArrayList<ChartRow> rows;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        listview = (ListView) findViewById(R.id.listviewchart);
        rows=new ArrayList<>();
        rows.add(new ChartRow("Silsillah Number",
                "Ghaarana Number","Name","Fathers Name","CNIC","Age","Address","Block Code","Phone Number", "Vote Casted?"));

        rows.add(new ChartRow("14",
                "ghaarana","Ehtesham Ul Haq Shams","Shams Ud Din","3520136592685","15","35 MET 2 Mughalpura Lahore","block codeeeee","03218838840", "Yes"));
        rows.add(new ChartRow("14",
                "ghaaraaana","nameeee","FathersNamee","3520116189959","23","House 1 Eden Palace Villas","block ccccode","03218838840", "No"));

        rows.add(new ChartRow("14",
                "ghaaraaana","Nouman Ali","Chaudhary Sahb","3520136885268","22","Defence Road, Sialkot","block ccccode","03218838840", "No"));

        listview.setAdapter(new ChartAdapter(this, rows));
    }
}
