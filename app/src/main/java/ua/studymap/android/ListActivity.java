package ua.studymap.android;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import ua.studymap.android.adapters.RecyclerViewAdapter;
import ua.studymap.android.data.Data;

public class ListActivity extends AppCompatActivity {
    RecyclerView rvMain;
    private Data data;
    public static Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mContext = this;
        data = new Data();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data.classroomsData());

        rvMain = (RecyclerView) findViewById(R.id.rvMain);
        rvMain.setHasFixedSize(true);
        rvMain.setLayoutManager(linearLayoutManager);
        rvMain.setAdapter(adapter);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.getChildCount();
    }
}
