package com.apollographql.apollo.api.cache.http;

/* loaded from: classes5.dex */
public interface HttpCacheStore {
    HttpCacheRecord cacheRecord(String str);

    HttpCacheRecordEditor cacheRecordEditor(String str);

    void delete();

    void remove(String str);
}
