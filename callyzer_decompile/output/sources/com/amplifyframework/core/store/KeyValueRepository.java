package com.amplifyframework.core.store;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface KeyValueRepository {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        @Deprecated
        public static void removeAll(KeyValueRepository keyValueRepository) {
            KeyValueRepository.super.removeAll();
        }
    }

    String get(String str);

    void put(String str, String str2);

    void remove(String str);

    default void removeAll() {
    }
}
