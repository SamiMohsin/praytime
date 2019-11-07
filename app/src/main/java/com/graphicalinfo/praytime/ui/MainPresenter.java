package com.graphicalinfo.praytime.ui;

import android.content.Context;
import android.os.Handler;

import com.graphicalinfo.praytime.base.Presenter;

class MainPresenter extends Presenter<MainView> {

    public MainPresenter(MainView view) {
        super(view);
    }


    void loading(){
        view.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                view.hide();
            }
        }, 3000);
    }
}
