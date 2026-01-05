package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.util.AmplifyHttpKt;
import ex.InterfaceC2141e;
import gb.C2552b;
import gb.C2554d;
import gb.C2555e;
import gb.InterfaceC2556f;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import vb.C7696c;
import zb.InterfaceC8922p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class S3StorageTransferClientProvider implements StorageTransferClientProvider {
    public static final Companion Companion = new Companion(null);
    private final InterfaceC2141e createS3Client;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private static final a0 getS3Client$lambda$0(String str, AuthCredentialsProvider authCredentialsProvider, C2554d S3Client) {
            AbstractC4154l.m8923f(S3Client, "$this$S3Client");
            AmplifyHttpKt.setHttpEngine(S3Client);
            S3Client.f13905d = str;
            S3Client.f13910j = authCredentialsProvider;
            return a0.f30746a;
        }

        public final InterfaceC2556f getS3Client(String region, AuthCredentialsProvider authCredentialsProvider) {
            AbstractC4154l.m8923f(region, "region");
            AbstractC4154l.m8923f(authCredentialsProvider, "authCredentialsProvider");
            C2554d c2554d = new C2554d();
            getS3Client$lambda$0(region, authCredentialsProvider, c2554d);
            c2554d.f13920v.add(0, new C7696c());
            C2555e config = (C2555e) ((InterfaceC8922p) c2554d.build());
            AbstractC4154l.m8923f(config, "config");
            return new C2552b(config);
        }

        private Companion() {
        }
    }

    public S3StorageTransferClientProvider(InterfaceC2141e createS3Client) {
        AbstractC4154l.m8923f(createS3Client, "createS3Client");
        this.createS3Client = createS3Client;
    }

    public static final InterfaceC2556f getS3Client(String str, AuthCredentialsProvider authCredentialsProvider) {
        return Companion.getS3Client(str, authCredentialsProvider);
    }

    @Override // com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider
    public InterfaceC2556f getStorageTransferClient(String str, String str2) {
        return (InterfaceC2556f) this.createS3Client.invoke(str, str2);
    }
}
