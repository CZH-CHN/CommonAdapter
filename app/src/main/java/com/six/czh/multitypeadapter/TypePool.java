package com.six.czh.multitypeadapter;

/**
 * Created by czh on 18-12-6.
 * Email: caichelin@gmail.com
 */
public interface TypePool {

    <T> void resiger(Class<? extends T> clazz,
                     ItemViewBinder<T, ?> binder);

    <T> void resiger(Class<? extends T> clazz,
                     ItemViewBinderGroup<T> group);

    <T> boolean unregister(Class<? extends T> clazz);

    <T> int indexOfTypeOf(T item);

    ItemViewBinder<?, ?> getItemViewBinder(int index);
}
