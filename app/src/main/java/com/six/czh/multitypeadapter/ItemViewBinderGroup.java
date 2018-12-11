package com.six.czh.multitypeadapter;

/**
 * Created by czh on 18-12-7.
 * Email: caichelin@gmail.com
 */
public abstract class ItemViewBinderGroup<T> {

    private ItemViewBinder[] itemViewBinders;

    public ItemViewBinderGroup(ItemViewBinder... itemViewBinders) {
        if (itemViewBinders == null || itemViewBinders.length == 0) {
            throw new IllegalArgumentException("check the itemViewBinder content is not empty");
        }
        this.itemViewBinders = itemViewBinders;
    }

    /**
     *
     * @param item the adapter's item data
     * @return viewType
     */
    protected abstract int getViewHolderIndex(T item);

    /**
     *
     * @param itemViewBinders
     * @return itemViewBinder class name
     */
    public String getItemViewBinderTag(ItemViewBinder itemViewBinders) {
        return itemViewBinders.getClass().getName();
    }

    public ItemViewBinder getItemViewBinder(T item) {
        int index = getViewHolderIndex(item);

        return itemViewBinders[index];
    }

    public ItemViewBinder[] getItemViewBinders() {
        return itemViewBinders;
    }
}
