package com.tianlunte.wqyandroidtest.RecyclerViewUtil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tianlunte.wqyandroidtest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangqingyun on 10/11/15.
 */
public class FragmentSimpleRecycler extends Fragment {

    private List<String> mDatas;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_simple_recycler, null);

        initRawData();

        RecyclerView simpleRecycler = (RecyclerView)root.findViewById(R.id.simple_recycler_view);
        SimpleRecyclerAdapter simpleAdapter = new SimpleRecyclerAdapter();
        simpleRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        simpleRecycler.setAdapter(simpleAdapter);

        return root;
    }

    private void initRawData() {
        mDatas = new ArrayList<>();
        mDatas.add("1");
        mDatas.add("2");
        mDatas.add("3");
        mDatas.add("4");
        mDatas.add("5");
        mDatas.add("6");
        mDatas.add("7");
        mDatas.add("8");
        mDatas.add("9");
        mDatas.add("10");
        mDatas.add("11");
        mDatas.add("12");
        mDatas.add("13");
        mDatas.add("14");
        mDatas.add("15");
        mDatas.add("16");
        mDatas.add("17");
        mDatas.add("18");
        mDatas.add("19");
        mDatas.add("20");
    }

    private class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.SimpleRecyclerHolder> {

        @Override
        public SimpleRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_simple_recycler, parent, false);
            SimpleRecyclerHolder holder = new SimpleRecyclerHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(SimpleRecyclerHolder holder, int position) {
            holder.pLabelView.setText(mDatas.get(position));
        }

        @Override
        public int getItemCount() {
            return mDatas.size();
        }

        protected class SimpleRecyclerHolder extends RecyclerView.ViewHolder {
            public TextView pLabelView;

            public SimpleRecyclerHolder(View parent) {
                super(parent);
                pLabelView = (TextView)parent.findViewById(R.id.item_simple_recycler_label);
            }
        }
    }

}
