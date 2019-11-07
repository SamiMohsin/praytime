package com.graphicalinfo.praytime.ui;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.graphicalinfo.praytime.R;
import com.graphicalinfo.praytime.base.Mvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Mvp<MainPresenter> implements MainView{


    ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mProgressBar = findViewById(R.id.mProgressBar);
        presenter.loading();


    }



        @Override
        protected MainPresenter createPresenter() {
            return new MainPresenter(this);
        }

        @Override
        public void show() {
            mProgressBar.setVisibility(View.VISIBLE);
        }

        @Override
        public void hide() {
            mProgressBar.setVisibility(View.GONE);
        }

        @Override
        public void onError() {

        }

        @Override
        public void onPass() {

        }
    }
