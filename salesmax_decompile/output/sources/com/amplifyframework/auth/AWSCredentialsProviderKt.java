package com.amplifyframework.auth;

import com.amplifyframework.core.Consumer;
import p001o.a0f;
import p001o.n64;
import p001o.n75;
import p001o.qc4;
import p001o.qx0;
import p001o.sq8;
import p001o.tq8;
import p001o.uq8;
import p001o.vre;
import p001o.wre;

/* loaded from: classes5.dex */
public final class AWSCredentialsProviderKt {
    public static final <T extends AWSCredentials> qc4 convertToSdkCredentialsProvider(final AWSCredentialsProvider<? extends T> aWSCredentialsProvider) {
        sq8.m48649h(aWSCredentialsProvider, "awsCredentialsProvider");
        return new qc4() { // from class: com.amplifyframework.auth.AWSCredentialsProviderKt.convertToSdkCredentialsProvider.1
            @Override // p001o.qc4, p001o.nb8
            public Object resolve(qx0 qx0Var, n64 n64Var) throws Throwable {
                AWSCredentialsProvider<T> aWSCredentialsProvider2 = aWSCredentialsProvider;
                final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
                aWSCredentialsProvider2.fetchAWSCredentials(new Consumer() { // from class: com.amplifyframework.auth.AWSCredentialsProviderKt$convertToSdkCredentialsProvider$1$resolve$2$1
                    /* JADX WARN: Incorrect types in method signature: (TT;)V */
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(AWSCredentials aWSCredentials) {
                        sq8.m48649h(aWSCredentials, "it");
                        n64 n64Var2 = a0fVar;
                        vre.C17665a c17665a = vre.f50797b;
                        n64Var2.resumeWith(vre.m53351b(AWSCredentialsKt.toSdkCredentials(aWSCredentials)));
                    }
                }, new Consumer() { // from class: com.amplifyframework.auth.AWSCredentialsProviderKt$convertToSdkCredentialsProvider$1$resolve$2$2
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(AuthException authException) {
                        sq8.m48649h(authException, "it");
                        n64 n64Var2 = a0fVar;
                        vre.C17665a c17665a = vre.f50797b;
                        n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
                    }
                });
                Object objM16313b = a0fVar.m16313b();
                if (objM16313b == uq8.m51918f()) {
                    n75.m40201c(n64Var);
                }
                return objM16313b;
            }
        };
    }
}
