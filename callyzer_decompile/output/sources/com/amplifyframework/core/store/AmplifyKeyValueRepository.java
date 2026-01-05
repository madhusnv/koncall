package com.amplifyframework.core.store;

import android.content.Context;
import aw.C0465e;
import com.amplifyframework.annotations.InternalAmplifyApi;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class AmplifyKeyValueRepository implements KeyValueRepository {
    private final Context context;
    private final InterfaceC6357g repository$delegate;
    private final String sharedPreferencesName;

    public AmplifyKeyValueRepository(Context context, String sharedPreferencesName) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(sharedPreferencesName, "sharedPreferencesName");
        this.context = context;
        this.sharedPreferencesName = sharedPreferencesName;
        this.repository$delegate = nd.m10782c(new C0465e(26, this));
    }

    private final KeyValueRepository getRepository() {
        return (KeyValueRepository) this.repository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyValueRepository repository_delegate$lambda$1(AmplifyKeyValueRepository amplifyKeyValueRepository) {
        try {
            EncryptedKeyValueRepository encryptedKeyValueRepository = new EncryptedKeyValueRepository(amplifyKeyValueRepository.context, amplifyKeyValueRepository.sharedPreferencesName);
            encryptedKeyValueRepository.getSharedPreferences$core_release();
            return encryptedKeyValueRepository;
        } catch (Exception unused) {
            return InMemoryKeyValueRepositoryProvider.INSTANCE.getKeyValueRepository(amplifyKeyValueRepository.sharedPreferencesName);
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public String get(String dataKey) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        return getRepository().get(dataKey);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(String dataKey, String str) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        getRepository().put(dataKey, str);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void remove(String dataKey) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        getRepository().remove(dataKey);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        getRepository().removeAll();
    }
}
