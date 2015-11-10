package com.tianlunte.wqyandroidtest.RecyclerViewUtil;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.tianlunte.wqyandroidtest.R;

/**
 * Created by wangqingyun on 10/11/15.
 */
public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        setupFrame();
    }

    private void setupFrame() {
        Fragment fragment = new FragmentSimpleRecycler();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.activity_recycler_main_container, fragment);
        transaction.commit();
    }

}
