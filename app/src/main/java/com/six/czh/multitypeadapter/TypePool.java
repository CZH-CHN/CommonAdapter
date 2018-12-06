package com.six.czh.multitypeadapter;

/**
 * Created by oneplus on 18-12-6.
 * Email: six.cai@oneplus.com
 */
public interface TypePool {

    <T> void resiger(Class<? extends T> clazz,
                     ItemViewBinder<T, ?> binder);


    <T> void unresiger(Class<? extends T> clazz);

    <T> int indexOf(Class<? extends T> clazz);

    ItemViewBinder<?, ?> getItemViewBinder(int index);
}
