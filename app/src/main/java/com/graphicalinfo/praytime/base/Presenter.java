package com.graphicalinfo.praytime.base;

public class Presenter<V> {
    public V view;

    public Presenter(V view) {
        this.attache(view);
    }

    protected void attache(V view) {
        this.view = view;
    }

    protected void detach() {
        this.view = null;
    }
}
