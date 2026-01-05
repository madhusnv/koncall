package com.amplifyframework.core.store;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InMemoryKeyValueRepositoryProvider {
    public static final InMemoryKeyValueRepositoryProvider INSTANCE = new InMemoryKeyValueRepositoryProvider();
    private static final ConcurrentHashMap<String, InMemoryKeyValueRepository> inMemoryRepositories = new ConcurrentHashMap<>();

    private InMemoryKeyValueRepositoryProvider() {
    }

    public final synchronized InMemoryKeyValueRepository getKeyValueRepository(String name) {
        InMemoryKeyValueRepository inMemoryKeyValueRepository;
        InMemoryKeyValueRepository inMemoryKeyValueRepositoryPutIfAbsent;
        try {
            AbstractC4154l.m8923f(name, "name");
            ConcurrentHashMap<String, InMemoryKeyValueRepository> concurrentHashMap = inMemoryRepositories;
            inMemoryKeyValueRepository = concurrentHashMap.get(name);
            if (inMemoryKeyValueRepository == null && (inMemoryKeyValueRepositoryPutIfAbsent = concurrentHashMap.putIfAbsent(name, (inMemoryKeyValueRepository = new InMemoryKeyValueRepository()))) != null) {
                inMemoryKeyValueRepository = inMemoryKeyValueRepositoryPutIfAbsent;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return inMemoryKeyValueRepository;
    }
}
