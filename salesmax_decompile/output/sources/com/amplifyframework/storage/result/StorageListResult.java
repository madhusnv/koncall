package com.amplifyframework.storage.result;

import com.amplifyframework.storage.StorageItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
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
        return new StorageListResult(Collections.unmodifiableList(arrayList), str, Collections.emptyList());
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
