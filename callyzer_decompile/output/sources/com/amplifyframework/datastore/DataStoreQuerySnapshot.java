package com.amplifyframework.datastore;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.util.Immutable;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class DataStoreQuerySnapshot<T extends Model> {
    private final boolean isSynced;
    private final List<T> items;

    public DataStoreQuerySnapshot(List<T> list, boolean z6) {
        this.items = list;
        this.isSynced = z6;
    }

    public boolean getIsSynced() {
        return this.isSynced;
    }

    public List<T> getItems() {
        return Immutable.of(this.items);
    }
}
