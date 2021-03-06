package com.setiawanpaiman.sunnyreader.ui.adapter;

import java.util.List;

public interface ListAdapter<T> {

    boolean hasData();

    List<T> getAll();

    void addAll(List<T> results, boolean refresh);

    void clear();
}