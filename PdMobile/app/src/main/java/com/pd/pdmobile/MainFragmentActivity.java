package com.pd.pdmobile;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class MainFragmentActivity extends FragmentActivity {
    //参数只有一个
    IndexFragment indexFragment;

    Fragment[] fragments = new Fragment[3];
    FragmentManager manager = getSupportFragmentManager();


    @Override
    protected void onCreate
            (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment);
        //在fragment_container中显示indexFragment

        //开始事务
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        //动作1：加载indexFragment到fragment_container中
        indexFragment = new IndexFragment();
        transaction.add(R.id.fragment_container, indexFragment);
        //动作2：显示indexfragment
        transaction.show(indexFragment);
        //提交事务
        transaction.commit();

    }

}
