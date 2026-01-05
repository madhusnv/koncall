package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.s3.utils.S3Keys;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.C6363m;
import qw.C6364n;
import qw.InterfaceC6353c;
import tx.c0;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public final class StorageAccessLevelAwarePrefixResolver implements AWSS3PluginPrefixResolver {
    private final AuthCredentialsProvider authCredentialsProvider;

    public StorageAccessLevelAwarePrefixResolver(AuthCredentialsProvider authCredentialsProvider) {
        AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
        this.authCredentialsProvider = authCredentialsProvider;
    }

    @Override // com.amplifyframework.storage.s3.configuration.AWSS3PluginPrefixResolver
    public void resolvePrefix(StorageAccessLevel accessLevel, String str, Consumer<String> onSuccess, Consumer<StorageException> consumer) {
        Object objM10796a;
        AbstractC4154l.m8923f(accessLevel, "accessLevel");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        try {
            objM10796a = (String) c0.m13468D(C7565i.f36440a, new C1231xea76060c(this, null));
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        if (objM10796a instanceof C6363m) {
            if (consumer != null) {
                consumer.accept(new StorageException("Failed to fetch identity ID", String.valueOf(C6364n.m12363a(objM10796a))));
            }
        } else {
            if (str == null) {
                od.m10798c(objM10796a);
                str = (String) objM10796a;
            }
            onSuccess.accept(S3Keys.getAccessLevelPrefix(accessLevel, str));
        }
    }
}
