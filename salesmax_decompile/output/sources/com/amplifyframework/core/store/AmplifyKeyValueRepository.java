package com.amplifyframework.core.store;

import android.content.Context;
import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.gi9;
import p001o.si9;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class AmplifyKeyValueRepository implements KeyValueRepository {
    private final Context context;
    private final gi9 repository$delegate;
    private final String sharedPreferencesName;

    public AmplifyKeyValueRepository(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "sharedPreferencesName");
        this.context = context;
        this.sharedPreferencesName = str;
        this.repository$delegate = si9.m48360a(new AmplifyKeyValueRepository$repository$2(this));
    }

    private final KeyValueRepository getRepository() {
        return (KeyValueRepository) this.repository$delegate.getValue();
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public String get(String str) {
        sq8.m48649h(str, "dataKey");
        return getRepository().get(str);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(String str, String str2) {
        sq8.m48649h(str, "dataKey");
        getRepository().put(str, str2);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void remove(String str) {
        sq8.m48649h(str, "dataKey");
        getRepository().remove(str);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        getRepository().removeAll();
    }
}
