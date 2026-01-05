package com.amplifyframework.core.store;

import android.content.SharedPreferences;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes5.dex */
public final class EncryptedKeyValueRepository$sharedPreferences$2 extends kf9 implements uk7 {
    final /* synthetic */ EncryptedKeyValueRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedKeyValueRepository$sharedPreferences$2(EncryptedKeyValueRepository encryptedKeyValueRepository) {
        super(0);
        this.this$0 = encryptedKeyValueRepository;
    }

    @Override // p001o.uk7
    public final SharedPreferences invoke() {
        return this.this$0.getOrCreateSharedPreferences();
    }
}
