package com.amplifyframework.storage.result;

import com.amplifyframework.storage.StorageItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageListResult {
    private final List<String> excludedSubpaths;
    private final List<StorageItem> items;
    private final String nextToken;

    private StorageListResult(List<StorageItem> list, String str, List<String> list2) {
        this.items = list;
        this.nextToken = str;
        this.excludedSubpaths = list2;
    }

    public static StorageListResult fromItems(List<StorageItem> list, String str) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        return new StorageListResult(Collections.unmodifiableList(arrayList), str, Collections.EMPTY_LIST);
    }

    public List<String> getExcludedSubpaths() {
        return this.excludedSubpaths;
    }

    public List<StorageItem> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public static StorageListResult fromItems(List<StorageItem> list, String str, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        return new StorageListResult(Collections.unmodifiableList(arrayList), str, list2);
    }
}
