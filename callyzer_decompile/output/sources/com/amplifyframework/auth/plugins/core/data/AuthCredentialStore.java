package com.amplifyframework.auth.plugins.core.data;

import android.content.Context;
import com.amplifyframework.core.store.AmplifyKeyValueRepository;
import com.amplifyframework.core.store.KeyValueRepository;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthCredentialStore {
    private final KeyValueRepository keyValue;
    private final String keyValueStoreIdentifier;

    public AuthCredentialStore(Context context, String keyValueStoreIdentifierSuffix) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(keyValueStoreIdentifierSuffix, "keyValueStoreIdentifierSuffix");
        String strConcat = "com.amplify.credentialStore.".concat(keyValueStoreIdentifierSuffix);
        this.keyValueStoreIdentifier = strConcat;
        this.keyValue = new AmplifyKeyValueRepository(context, strConcat);
    }

    public final String get(String key) {
        AbstractC4154l.m8923f(key, "key");
        return this.keyValue.get(key);
    }

    public final void put(String key, String value) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        this.keyValue.put(key, value);
    }

    public final void remove(String key) {
        AbstractC4154l.m8923f(key, "key");
        this.keyValue.remove(key);
    }

    public final void removeAll() {
        this.keyValue.removeAll();
    }
}
