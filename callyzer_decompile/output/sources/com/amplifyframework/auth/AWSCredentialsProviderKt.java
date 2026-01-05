package com.amplifyframework.auth;

import com.amplifyframework.core.Consumer;
import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import sb.InterfaceC6777d;
import sb.InterfaceC6779f;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCredentialsProviderKt {
    public static final <T extends AWSCredentials> InterfaceC6779f convertToSdkCredentialsProvider(final AWSCredentialsProvider<? extends T> awsCredentialsProvider) {
        AbstractC4154l.m8923f(awsCredentialsProvider, "awsCredentialsProvider");
        return new InterfaceC6779f() { // from class: com.amplifyframework.auth.AWSCredentialsProviderKt.convertToSdkCredentialsProvider.1
            @Override // vc.InterfaceC7700c
            public Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c<? super InterfaceC6777d> interfaceC7559c) {
                AWSCredentialsProvider<T> aWSCredentialsProvider = awsCredentialsProvider;
                final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
                aWSCredentialsProvider.fetchAWSCredentials(new Consumer() { // from class: com.amplifyframework.auth.AWSCredentialsProviderKt$convertToSdkCredentialsProvider$1$resolve$2$1
                    /* JADX WARN: Incorrect types in method signature: (TT;)V */
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(AWSCredentials it) {
                        AbstractC4154l.m8923f(it, "it");
                        c7566j.resumeWith(AWSCredentialsKt.toSdkCredentials(it));
                    }
                }, new Consumer() { // from class: com.amplifyframework.auth.AWSCredentialsProviderKt$convertToSdkCredentialsProvider$1$resolve$2$2
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(AuthException it) {
                        AbstractC4154l.m8923f(it, "it");
                        c7566j.resumeWith(od.m10796a(it));
                    }
                });
                Object objM14303a = c7566j.m14303a();
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                return objM14303a;
            }
        };
    }
}
