package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import com.amplifyframework.core.store.AmplifyKeyValueRepository;
import com.amplifyframework.core.store.InMemoryKeyValueRepository;
import com.amplifyframework.core.store.KeyValueRepository;
import p001o.e9g;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class KeyValueRepositoryFactory {
    public final KeyValueRepository create(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "keyValueRepoID");
        return sq8.m48644c(str, AWSCognitoAuthCredentialStore.awsKeyValueStoreIdentifier) ? new AmplifyKeyValueRepository(context, str) : (sq8.m48644c(str, AWSCognitoLegacyCredentialStore.AWS_KEY_VALUE_STORE_NAMESPACE_IDENTIFIER) || sq8.m48644c(str, AWSCognitoLegacyCredentialStore.APP_TOKENS_INFO_CACHE) || sq8.m48644c(str, AWSCognitoLegacyCredentialStore.AWS_MOBILE_CLIENT_PROVIDER) || e9g.m24597K(str, AWSCognitoLegacyCredentialStore.APP_DEVICE_INFO_CACHE, false, 2, null)) ? new LegacyKeyValueRepository(context, str, false, 4, null) : new InMemoryKeyValueRepository();
    }
}
