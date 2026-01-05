package com.amplifyframework.core.store;

import java.util.concurrent.ConcurrentHashMap;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class InMemoryKeyValueRepositoryProvider {
    public static final InMemoryKeyValueRepositoryProvider INSTANCE = new InMemoryKeyValueRepositoryProvider();
    private static final ConcurrentHashMap<String, InMemoryKeyValueRepository> inMemoryRepositories = new ConcurrentHashMap<>();

    private InMemoryKeyValueRepositoryProvider() {
    }

    public final synchronized InMemoryKeyValueRepository getKeyValueRepository(String str) {
        InMemoryKeyValueRepository inMemoryKeyValueRepository;
        InMemoryKeyValueRepository inMemoryKeyValueRepositoryPutIfAbsent;
        sq8.m48649h(str, "name");
        ConcurrentHashMap<String, InMemoryKeyValueRepository> concurrentHashMap = inMemoryRepositories;
        inMemoryKeyValueRepository = concurrentHashMap.get(str);
        if (inMemoryKeyValueRepository == null && (inMemoryKeyValueRepositoryPutIfAbsent = concurrentHashMap.putIfAbsent(str, (inMemoryKeyValueRepository = new InMemoryKeyValueRepository()))) != null) {
            inMemoryKeyValueRepository = inMemoryKeyValueRepositoryPutIfAbsent;
        }
        sq8.m48648g(inMemoryKeyValueRepository, "getOrPut(...)");
        return inMemoryKeyValueRepository;
    }
}
