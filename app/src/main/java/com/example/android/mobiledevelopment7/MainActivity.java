package com.example.android.mobiledevelopment7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<President> mPresidents = new ArrayList<>();
    private PresidentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler);
       /* mPresidents.add(new President("Soekarno", "Presiden pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden Sukarno.jpg"));
        mPresidents.add(new President("Soeharto", "Presiden kedua RI", "https://upload.wikimedia.org/wikipedia/commons/5/59/President_Suharto%2C_1993.jpg"));
        mPresidents.add(new President("Bacharuddin Jusuf Habibie", "Presiden ketiga RI", "https://indonesia.go.id/assets/img/president/1544064315_habibie_pres.jpg"));*/
        mPresidents.addAll(PresidentData.getListData());

        Log.v("DATA_PRESIDEN", "NAMA : " + mPresidents.get(1).getName());

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new PresidentAdapter(this, mPresidents);
        mRecyclerView.setAdapter(mAdapter);
    }
}
