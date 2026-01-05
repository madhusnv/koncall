package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.s3.utils.S3Keys;
import p001o.qm1;
import p001o.sq8;
import p001o.vre;
import p001o.wre;

/* loaded from: classes5.dex */
public final class StorageAccessLevelAwarePrefixResolver implements AWSS3PluginPrefixResolver {
    private final AuthCredentialsProvider authCredentialsProvider;

    public StorageAccessLevelAwarePrefixResolver(AuthCredentialsProvider authCredentialsProvider) {
        sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
        this.authCredentialsProvider = authCredentialsProvider;
    }

    @Override // com.amplifyframework.storage.s3.configuration.AWSS3PluginPrefixResolver
    public void resolvePrefix(StorageAccessLevel storageAccessLevel, String str, Consumer<String> consumer, Consumer<StorageException> consumer2) {
        Object objM53351b;
        sq8.m48649h(storageAccessLevel, "accessLevel");
        sq8.m48649h(consumer, "onSuccess");
        try {
            vre.C17665a c17665a = vre.f50797b;
            objM53351b = vre.m53351b((String) qm1.m45641b(null, new C10685xea76060c(this, null), 1, null));
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        if (!vre.m53357h(objM53351b)) {
            if (consumer2 != null) {
                consumer2.accept(new StorageException("Failed to fetch identity ID", String.valueOf(vre.m53354e(objM53351b))));
            }
        } else {
            if (str == null) {
                wre.m54934b(objM53351b);
                str = (String) objM53351b;
            }
            consumer.accept(S3Keys.getAccessLevelPrefix(storageAccessLevel, str));
        }
    }
}
