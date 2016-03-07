package com.kocomer.community;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kocomer.base.activity.BaseActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {
    private HomeFragment homeFragment;
    private CategoryFragment categoryFragment;
    private DoctorsFragment doctorsFragment;
    private KnowledgeFragment knowledgeFragment;
    private TextView titleTV;

    @Override
    public void callback(String data) {
        titleTV.setText(data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeFragment = new HomeFragment();

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.main_content, homeFragment, "home");
        transaction.commit();

        titleTV = (TextView) findViewById(R.id.title_title);
        findViewById(R.id.foot_home_layout).setOnClickListener(this);
        findViewById(R.id.foot_category_layout).setOnClickListener(this);
        findViewById(R.id.foot_doctors_layout).setOnClickListener(this);
        findViewById(R.id.foot_knowledge_layout).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.hide(homeFragment);
        if (categoryFragment != null) {
            transaction.hide(categoryFragment);
        }
        if (doctorsFragment != null) {
            transaction.hide(doctorsFragment);
        }
        if (knowledgeFragment != null) {
            transaction.hide(knowledgeFragment);
        }

        switch (v.getId()) {
            case R.id.foot_home_layout: {
                titleTV.setText("健康社区");
                transaction.show(homeFragment);
            }
            break;
            case R.id.foot_category_layout: {
                titleTV.setText("分类");
                if (categoryFragment == null) {
                    categoryFragment = new CategoryFragment();
                    transaction.add(R.id.main_content, categoryFragment, "category");
                } else {
                    transaction.show(categoryFragment);
                }
            }
            break;
            case R.id.foot_doctors_layout: {
                titleTV.setText("执勤医生");
                if (doctorsFragment == null) {
                    doctorsFragment = new DoctorsFragment();
                    transaction.add(R.id.main_content, doctorsFragment, "doctros");
                } else {
                    transaction.show(doctorsFragment);
                }
            }
            break;
            case R.id.foot_knowledge_layout: {
                titleTV.setText("知识库");
                if (knowledgeFragment == null) {
                    knowledgeFragment = new KnowledgeFragment();
                    transaction.add(R.id.main_content, knowledgeFragment, "knowledge");
                } else {
                    transaction.show(knowledgeFragment);
                }
            }
        }
        transaction.commit();
    }
}
