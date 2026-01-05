package com.amplifyframework.core.store;

import p001o.kf9;
import p001o.uk7;

/* loaded from: classes5.dex */
public final class AmplifyKeyValueRepository$repository$2 extends kf9 implements uk7 {
    final /* synthetic */ AmplifyKeyValueRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmplifyKeyValueRepository$repository$2(AmplifyKeyValueRepository amplifyKeyValueRepository) {
        super(0);
        this.this$0 = amplifyKeyValueRepository;
    }

    @Override // p001o.uk7
    public final KeyValueRepository invoke() {
        try {
            EncryptedKeyValueRepository encryptedKeyValueRepository = new EncryptedKeyValueRepository(this.this$0.context, this.this$0.sharedPreferencesName);
            encryptedKeyValueRepository.getSharedPreferences$com_amplifyframework_core_release();
            return encryptedKeyValueRepository;
        } catch (Exception unused) {
            return InMemoryKeyValueRepositoryProvider.INSTANCE.getKeyValueRepository(this.this$0.sharedPreferencesName);
        }
    }
}
