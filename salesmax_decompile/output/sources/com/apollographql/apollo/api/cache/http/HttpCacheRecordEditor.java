package com.apollographql.apollo.api.cache.http;

import p001o.dvf;

/* loaded from: classes5.dex */
public interface HttpCacheRecordEditor {
    void abort();

    dvf bodySink();

    void commit();

    dvf headerSink();
}
