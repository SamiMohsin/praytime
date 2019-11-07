package com.graphicalinfo.praytime.base;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class Mvp<P extends Presenter> extends AppCompatActivity {
    protected P presenter;
    protected abstract P createPresenter();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null)
            presenter.detach();
    }
}
