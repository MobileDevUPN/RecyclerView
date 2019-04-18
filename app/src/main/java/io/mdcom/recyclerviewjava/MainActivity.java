package io.mdcom.recyclerviewjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static String[][] data = new String[][]
            {
                    {"Moch. Nor Kholis", "1534010006"},
                    {"Irfan Erfolgi H.", "1534010007"},
                    {"Akbar Raihan M.", "1534010008"},
                    {"I Putu Mahardika", "1534010018"},
                    {"Wahyu Aji P.", "1534010034"},
                    {"Hafidz Amarul", "1634010057"},
                    {"Ilvi Nur Diana", "1634010081"}
            };
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rv_mhs);
        ArrayList<MhsModel> item=new ArrayList<MhsModel>();
        MhsModel itmod=null;
//        itemHelper = new ItemHelper(this);
        MhsAdapter mhsAdapter = new MhsAdapter(this);
        for (int i = 0; i <data.length; i++) {
            itmod = new MhsModel();
            itmod.setNama(data[i][0]);
            itmod.setNpm(data[i][1]);

            item.add(itmod);
        }

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(mhsAdapter);
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
//        itemHelper.open();
//        item = itemHelper.query();
//        itemHelper.close();
        mhsAdapter.addItem(item);
    }
}
