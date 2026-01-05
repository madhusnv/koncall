package com.apollographql.apollo.api.cache.http;

import p001o.tn8;
import p001o.zqe;

/* loaded from: classes5.dex */
public interface HttpCache {
    public static final String CACHE_EXPIRE_AFTER_READ_HEADER = "X-APOLLO-EXPIRE-AFTER-READ";
    public static final String CACHE_EXPIRE_TIMEOUT_HEADER = "X-APOLLO-EXPIRE-TIMEOUT";
    public static final String CACHE_FETCH_STRATEGY_HEADER = "X-APOLLO-CACHE-FETCH-STRATEGY";
    public static final String CACHE_KEY_HEADER = "X-APOLLO-CACHE-KEY";
    public static final String CACHE_PREFETCH_HEADER = "X-APOLLO-PREFETCH";
    public static final String CACHE_SERVED_DATE_HEADER = "X-APOLLO-SERVED-DATE";

    void clear();

    tn8 interceptor();

    zqe read(String str);

    zqe read(String str, boolean z);

    void remove(String str);

    void removeQuietly(String str);
}
