package com.tianlunte.wqyandroidtest.RecyclerViewUtil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tianlunte.wqyandroidtest.R;

/**
 * Created by wangqingyun on 10/11/15.
 */
public class FragmentSimpleRecycler extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_simple_recycler, null);

        return root;
    }

}
