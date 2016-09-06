package com.victor_xiao.recylerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView=(RecyclerView)findViewById(R.id.recylerView);

        // 为提高性能，设置为条目大小为固定。
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new StaggeredGridLayoutManager(1,
                StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter
        String[] myDataset={"北京","上海","广州","深圳","石家庄","杭州","天津","太原","呼和浩特"};
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }

}
