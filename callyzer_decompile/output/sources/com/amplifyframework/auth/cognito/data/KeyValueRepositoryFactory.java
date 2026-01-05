package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import com.amplifyframework.core.store.AmplifyKeyValueRepository;
import com.amplifyframework.core.store.InMemoryKeyValueRepository;
import com.amplifyframework.core.store.KeyValueRepository;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KeyValueRepositoryFactory {
    public final KeyValueRepository create(Context context, String keyValueRepoID) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(keyValueRepoID, "keyValueRepoID");
        return keyValueRepoID.equals(AWSCognitoAuthCredentialStore.AWS_KEY_VALUE_STORE_IDENTIFIER) ? new AmplifyKeyValueRepository(context, keyValueRepoID) : (keyValueRepoID.equals(AWSCognitoLegacyCredentialStore.AWS_KEY_VALUE_STORE_NAMESPACE_IDENTIFIER) || keyValueRepoID.equals(AWSCognitoLegacyCredentialStore.APP_TOKENS_INFO_CACHE) || keyValueRepoID.equals(AWSCognitoLegacyCredentialStore.AWS_MOBILE_CLIENT_PROVIDER) || AbstractC5185w.m10138t(keyValueRepoID, AWSCognitoLegacyCredentialStore.APP_DEVICE_INFO_CACHE, false)) ? new LegacyKeyValueRepository(context, keyValueRepoID, false, 4, null) : new InMemoryKeyValueRepository();
    }
}
