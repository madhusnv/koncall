package com.amplifyframework.auth.plugins.core.data;

import android.content.Context;
import com.amplifyframework.core.store.AmplifyKeyValueRepository;
import com.amplifyframework.core.store.KeyValueRepository;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthCredentialStore {
    private final KeyValueRepository keyValue;
    private final String keyValueStoreIdentifier;

    public AuthCredentialStore(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "keyValueStoreIdentifierSuffix");
        String str2 = "com.amplify.credentialStore." + str;
        this.keyValueStoreIdentifier = str2;
        this.keyValue = new AmplifyKeyValueRepository(context, str2);
    }

    public final String get(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.keyValue.get(str);
    }

    public final void put(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        this.keyValue.put(str, str2);
    }

    public final void remove(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.keyValue.remove(str);
    }

    public final void removeAll() {
        this.keyValue.removeAll();
    }
}
