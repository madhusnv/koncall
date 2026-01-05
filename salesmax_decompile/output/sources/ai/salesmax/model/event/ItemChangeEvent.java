package ai.salesmax.model.event;

/* loaded from: classes.dex */
public class ItemChangeEvent<T> {
    T newItem;
    T oldItem;

    public ItemChangeEvent(T t, T t2) {
        this.newItem = t;
        this.oldItem = t2;
    }

    public T getNewItem() {
        return this.newItem;
    }

    public T getOldItem() {
        return this.oldItem;
    }
}
