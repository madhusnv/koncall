package com.amplifyframework.auth.cognito.data;

import com.amplifyframework.core.store.KeyValueRepository;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes5.dex */
public final class AWSCognitoLegacyCredentialStore$tokensKeyValue$2 extends kf9 implements uk7 {
    final /* synthetic */ AWSCognitoLegacyCredentialStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoLegacyCredentialStore$tokensKeyValue$2(AWSCognitoLegacyCredentialStore aWSCognitoLegacyCredentialStore) {
        super(0);
        this.this$0 = aWSCognitoLegacyCredentialStore;
    }

    @Override // p001o.uk7
    public final KeyValueRepository invoke() {
        return this.this$0.keyValueRepoFactory.create(this.this$0.getContext(), AWSCognitoLegacyCredentialStore.APP_TOKENS_INFO_CACHE);
    }
}
