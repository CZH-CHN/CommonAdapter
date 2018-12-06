package com.six.czh.multitypeadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

/**
 * Created by czh on 18-12-6.
 * Email: caichelin@gmail.com
 */
public abstract class ItemViewBinder<T, VH extends RecyclerView.ViewHolder> {

    /**
     *
     * @param inflater
     * @param parent
     * @return
     */
    protected abstract @NotNull VH onCreateViewHolder(@NotNull LayoutInflater inflater, @NonNull ViewGroup parent);


    protected abstract @NotNull void onBindViewHolder(@NonNull VH holder, @NotNull T item);

}
