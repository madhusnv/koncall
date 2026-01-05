package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.util.AmplifyHttpKt;
import java.util.List;
import java.util.Map;
import p001o.b86;
import p001o.bj4;
import p001o.c2e;
import p001o.e2e;
import p001o.eme;
import p001o.ere;
import p001o.kf9;
import p001o.kg3;
import p001o.lg3;
import p001o.mg3;
import p001o.n64;
import p001o.sn8;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityProviderClient$1$1 */
/* loaded from: classes5.dex */
public final class C10380x48365ca extends kf9 implements xk7 {
    final /* synthetic */ Map<String, String> $customPairs;
    final /* synthetic */ UserPoolConfiguration $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10380x48365ca(UserPoolConfiguration userPoolConfiguration, Map<String, String> map) {
        super(1);
        this.$it = userPoolConfiguration;
        this.$customPairs = map;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((kg3.C14827c.a) obj);
        return y3i.f54824a;
    }

    public final void invoke(kg3.C14827c.a aVar) {
        sq8.m48649h(aVar, "$this$invoke");
        AmplifyHttpKt.setHttpEngine(aVar);
        aVar.mo20132h(this.$it.getRegion());
        final String endpoint = this.$it.getEndpoint();
        aVar.m35680y(endpoint != null ? new mg3() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityProviderClient$1$1$1$1
            @Override // p001o.f86
            public final Object resolveEndpoint(lg3 lg3Var, n64 n64Var) {
                return new b86(endpoint);
            }
        } : null);
        List listM35678w = aVar.m35678w();
        final Map<String, String> map = this.$customPairs;
        listM35678w.add(new sn8() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityProviderClient$1$1.2
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
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    bj4.m19230c(emeVar.mo25341b()).m59481b(entry.getKey(), entry.getValue());
                }
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
