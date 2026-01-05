package com.amplifyframework.core.store;

/* loaded from: classes5.dex */
public interface KeyValueRepository {

    public static final class DefaultImpls {
        public static void removeAll(KeyValueRepository keyValueRepository) {
        }
    }

    String get(String str);

    void put(String str, String str2);

    void remove(String str);

    void removeAll();
}
