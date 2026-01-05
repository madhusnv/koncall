package com.amplifyframework.auth.plugins.core;

import com.amplifyframework.auth.AWSCognitoAuthMetadataType;
import com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration;
import com.amplifyframework.util.AmplifyHttpKt;
import java.util.List;
import p001o.bj4;
import p001o.c2e;
import p001o.cg3;
import p001o.e2e;
import p001o.eme;
import p001o.ere;
import p001o.kf9;
import p001o.n64;
import p001o.sn8;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class CognitoClientFactory {
    public static final CognitoClientFactory INSTANCE = new CognitoClientFactory();

    /* renamed from: com.amplifyframework.auth.plugins.core.CognitoClientFactory$createIdentityClient$1 */
    public static final class C105431 extends kf9 implements xk7 {
        final /* synthetic */ AWSCognitoIdentityPoolConfiguration $identityPool;
        final /* synthetic */ String $pluginKey;
        final /* synthetic */ String $pluginVersion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105431(AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, String str, String str2) {
            super(1);
            this.$identityPool = aWSCognitoIdentityPoolConfiguration;
            this.$pluginKey = str;
            this.$pluginVersion = str2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((cg3.C12676c.a) obj);
            return y3i.f54824a;
        }

        public final void invoke(cg3.C12676c.a aVar) {
            sq8.m48649h(aVar, "$this$invoke");
            AmplifyHttpKt.setHttpEngine(aVar);
            aVar.mo20132h(this.$identityPool.getRegion());
            List listM21168w = aVar.m21168w();
            final String str = this.$pluginKey;
            final String str2 = this.$pluginVersion;
            listM21168w.add(new sn8() { // from class: com.amplifyframework.auth.plugins.core.CognitoClientFactory.createIdentityClient.1.1
                @Override // p001o.sn8
                /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
                public Object mo68712modifyBeforeAttemptCompletiongIAlus(ere ereVar, n64 n64Var) {
                    return sn8.C16877a.m48563a(this, ereVar, n64Var);
                }

                @Override // p001o.sn8
                /* renamed from: modifyBeforeCompletion-gIAlu-s */
                public Object mo68713modifyBeforeCompletiongIAlus(ere ereVar, n64 n64Var) {
                    return sn8.C16877a.m48564b(this, ereVar, n64Var);
                }

                @Override // p001o.sn8
                public Object modifyBeforeDeserialization(e2e e2eVar, n64 n64Var) {
                    return sn8.C16877a.m48565c(this, e2eVar, n64Var);
                }

                @Override // p001o.sn8
                public Object modifyBeforeRetryLoop(c2e c2eVar, n64 n64Var) {
                    return sn8.C16877a.m48566d(this, c2eVar, n64Var);
                }

                @Override // p001o.sn8
                public Object modifyBeforeSerialization(eme emeVar, n64 n64Var) {
                    bj4.m19230c(emeVar.mo25341b()).m59481b(AWSCognitoAuthMetadataType.AuthPluginsCore.getKey(), "2.27.1");
                    bj4.m19230c(emeVar.mo25341b()).m59481b(str, str2);
                    return sn8.C16877a.m48567e(this, emeVar, n64Var);
                }

                @Override // p001o.sn8
                public Object modifyBeforeSigning(c2e c2eVar, n64 n64Var) {
                    return sn8.C16877a.m48568f(this, c2eVar, n64Var);
                }

                @Override // p001o.sn8
                public Object modifyBeforeTransmit(c2e c2eVar, n64 n64Var) {
                    return sn8.C16877a.m48569g(this, c2eVar, n64Var);
                }

                @Override // p001o.sn8
                public void readAfterAttempt(ere ereVar) {
                    sn8.C16877a.m48570h(this, ereVar);
                }

                @Override // p001o.sn8
                public void readAfterDeserialization(ere ereVar) {
                    sn8.C16877a.m48571i(this, ereVar);
                }

                @Override // p001o.sn8
                public void readAfterExecution(ere ereVar) {
                    sn8.C16877a.m48572j(this, ereVar);
                }

                @Override // p001o.sn8
                public void readAfterSerialization(c2e c2eVar) {
                    sn8.C16877a.m48573k(this, c2eVar);
                }

                @Override // p001o.sn8
                public void readAfterSigning(c2e c2eVar) {
                    sn8.C16877a.m48574l(this, c2eVar);
                }

                @Override // p001o.sn8
                public void readAfterTransmit(e2e e2eVar) {
                    sn8.C16877a.m48575m(this, e2eVar);
                }

                @Override // p001o.sn8
                public void readBeforeAttempt(c2e c2eVar) {
                    sn8.C16877a.m48576n(this, c2eVar);
                }

                @Override // p001o.sn8
                public void readBeforeDeserialization(e2e e2eVar) {
                    sn8.C16877a.m48577o(this, e2eVar);
                }

                @Override // p001o.sn8
                public void readBeforeExecution(eme emeVar) {
                    sn8.C16877a.m48578p(this, emeVar);
                }

                @Override // p001o.sn8
                public void readBeforeSerialization(eme emeVar) {
                    sn8.C16877a.m48579q(this, emeVar);
                }

                @Override // p001o.sn8
                public void readBeforeSigning(c2e c2eVar) {
                    sn8.C16877a.m48580r(this, c2eVar);
                }

                @Override // p001o.sn8
                public void readBeforeTransmit(c2e c2eVar) {
                    sn8.C16877a.m48581s(this, c2eVar);
                }
            });
        }
    }

    private CognitoClientFactory() {
    }

    public final cg3 createIdentityClient(AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, String str, String str2) {
        sq8.m48649h(aWSCognitoIdentityPoolConfiguration, "identityPool");
        sq8.m48649h(str, "pluginKey");
        sq8.m48649h(str2, "pluginVersion");
        return (cg3) cg3.f18087l.m38580c(new C105431(aWSCognitoIdentityPoolConfiguration, str, str2));
    }
}
