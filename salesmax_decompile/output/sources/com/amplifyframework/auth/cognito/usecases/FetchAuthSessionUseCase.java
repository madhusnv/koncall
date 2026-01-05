package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin;
import com.amplifyframework.core.Consumer;
import com.google.api.Service;
import p001o.a0f;
import p001o.l75;
import p001o.n64;
import p001o.n75;
import p001o.o64;
import p001o.sq8;
import p001o.tq8;
import p001o.uq8;
import p001o.vre;
import p001o.wre;

/* loaded from: classes5.dex */
public final class FetchAuthSessionUseCase {
    private final RealAWSCognitoAuthPlugin plugin;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase", m36648f = "FetchAuthSessionUseCase.kt", m36649l = {Service.SYSTEM_PARAMETERS_FIELD_NUMBER}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$1 */
    public static final class C105271 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105271(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchAuthSessionUseCase.this.execute(this);
        }
    }

    public FetchAuthSessionUseCase(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        sq8.m48649h(realAWSCognitoAuthPlugin, "plugin");
        this.plugin = realAWSCognitoAuthPlugin;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(n64 n64Var) {
        C105271 c105271;
        if (n64Var instanceof C105271) {
            c105271 = (C105271) n64Var;
            int i = c105271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105271.label = i - Integer.MIN_VALUE;
            } else {
                c105271 = new C105271(n64Var);
            }
        }
        Object objM16313b = c105271.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105271.label;
        if (i2 == 0) {
            wre.m54934b(objM16313b);
            c105271.L$0 = this;
            c105271.label = 1;
            final a0f a0fVar = new a0f(tq8.m50336c(c105271));
            this.plugin.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$session$1$1
                @Override // com.amplifyframework.core.Consumer
                public final void accept(AuthSession authSession) {
                    sq8.m48649h(authSession, "it");
                    a0fVar.resumeWith(vre.m53351b(authSession));
                }
            }, new Consumer() { // from class: com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$session$1$2
                @Override // com.amplifyframework.core.Consumer
                public final void accept(AuthException authException) {
                    sq8.m48649h(authException, "it");
                    n64 n64Var2 = a0fVar;
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
                }
            });
            objM16313b = a0fVar.m16313b();
            if (objM16313b == uq8.m51918f()) {
                n75.m40201c(c105271);
            }
            if (objM16313b == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objM16313b);
        }
        sq8.m48648g(objM16313b, "suspendCoroutine(...)");
        return (AWSCognitoAuthSession) ((AuthSession) objM16313b);
    }
}
