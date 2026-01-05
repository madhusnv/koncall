package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthListWebAuthnCredentialsOptions;
import com.amplifyframework.auth.cognito.result.AWSCognitoAuthListWebAuthnCredentialsResult;
import com.amplifyframework.auth.cognito.result.CognitoWebAuthnCredential;
import com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions;
import java.util.ArrayList;
import java.util.List;
import p001o.c74;
import p001o.dh3;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.t4j;
import p001o.um5;
import p001o.uq8;
import p001o.wre;
import p001o.xfa;
import p001o.yfa;

/* loaded from: classes5.dex */
public final class ListWebAuthnCredentialsUseCase {
    private final kg3 client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.ListWebAuthnCredentialsUseCase", m36648f = "ListWebAuthnCredentialsUseCase.kt", m36649l = {um5.OBJC_CLASS_PREFIX_FIELD_NUMBER, 38, 62}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ListWebAuthnCredentialsUseCase$execute$1 */
    public static final class C105321 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C105321(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ListWebAuthnCredentialsUseCase.this.execute(null, this);
        }
    }

    public ListWebAuthnCredentialsUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[LOOP:0: B:29:0x00b9->B:31:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions, n64 n64Var) {
        C105321 c105321;
        ListWebAuthnCredentialsUseCase listWebAuthnCredentialsUseCase;
        if (n64Var instanceof C105321) {
            c105321 = (C105321) n64Var;
            int i = c105321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105321.label = i - Integer.MIN_VALUE;
            } else {
                c105321 = new C105321(n64Var);
            }
        }
        Object objExecute = c105321.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105321.label;
        if (i2 == 0) {
            wre.m54934b(objExecute);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105321.L$0 = this;
            c105321.L$1 = authListWebAuthnCredentialsOptions;
            c105321.label = 1;
            if (AuthStateMachineKt.requireSignedInState(authStateMachine, c105321) == objM51918f) {
                return objM51918f;
            }
            listWebAuthnCredentialsUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(objExecute);
                    yfa yfaVar = (yfa) objExecute;
                    List<t4j> listM57755a = yfaVar.m57755a();
                    ArrayList arrayList = new ArrayList(dh3.m23088v(listM57755a, 10));
                    for (t4j t4jVar : listM57755a) {
                        arrayList.add(new CognitoWebAuthnCredential(t4jVar.m49308b(), t4jVar.m49309c(), t4jVar.m49310d(), c74.m20362a(t4jVar.m49307a())));
                    }
                    return new AWSCognitoAuthListWebAuthnCredentialsResult(arrayList, yfaVar.m57756b());
                }
                authListWebAuthnCredentialsOptions = (AuthListWebAuthnCredentialsOptions) c105321.L$1;
                listWebAuthnCredentialsUseCase = (ListWebAuthnCredentialsUseCase) c105321.L$0;
                wre.m54934b(objExecute);
                String accessToken = ((AWSCognitoAuthSession) objExecute).getAccessToken();
                kg3 kg3Var = listWebAuthnCredentialsUseCase.client;
                xfa.C18145a c18145a = new xfa.C18145a();
                c18145a.m56218e(accessToken);
                AWSCognitoAuthListWebAuthnCredentialsOptions.Companion companion = AWSCognitoAuthListWebAuthnCredentialsOptions.Companion;
                c18145a.m56220g(companion.getNextToken$aws_auth_cognito_release(authListWebAuthnCredentialsOptions));
                c18145a.m56219f(companion.getMaxResults$aws_auth_cognito_release(authListWebAuthnCredentialsOptions));
                xfa xfaVarM56214a = c18145a.m56214a();
                c105321.L$0 = null;
                c105321.L$1 = null;
                c105321.label = 3;
                objExecute = kg3Var.a1(xfaVarM56214a, c105321);
                if (objExecute == objM51918f) {
                    return objM51918f;
                }
                yfa yfaVar2 = (yfa) objExecute;
                List<t4j> listM57755a2 = yfaVar2.m57755a();
                ArrayList arrayList2 = new ArrayList(dh3.m23088v(listM57755a2, 10));
                while (r7.hasNext()) {
                }
                return new AWSCognitoAuthListWebAuthnCredentialsResult(arrayList2, yfaVar2.m57756b());
            }
            authListWebAuthnCredentialsOptions = (AuthListWebAuthnCredentialsOptions) c105321.L$1;
            listWebAuthnCredentialsUseCase = (ListWebAuthnCredentialsUseCase) c105321.L$0;
            wre.m54934b(objExecute);
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase = listWebAuthnCredentialsUseCase.fetchAuthSession;
        c105321.L$0 = listWebAuthnCredentialsUseCase;
        c105321.L$1 = authListWebAuthnCredentialsOptions;
        c105321.label = 2;
        objExecute = fetchAuthSessionUseCase.execute(c105321);
        if (objExecute == objM51918f) {
            return objM51918f;
        }
        String accessToken2 = ((AWSCognitoAuthSession) objExecute).getAccessToken();
        kg3 kg3Var2 = listWebAuthnCredentialsUseCase.client;
        xfa.C18145a c18145a2 = new xfa.C18145a();
        c18145a2.m56218e(accessToken2);
        AWSCognitoAuthListWebAuthnCredentialsOptions.Companion companion2 = AWSCognitoAuthListWebAuthnCredentialsOptions.Companion;
        c18145a2.m56220g(companion2.getNextToken$aws_auth_cognito_release(authListWebAuthnCredentialsOptions));
        c18145a2.m56219f(companion2.getMaxResults$aws_auth_cognito_release(authListWebAuthnCredentialsOptions));
        xfa xfaVarM56214a2 = c18145a2.m56214a();
        c105321.L$0 = null;
        c105321.L$1 = null;
        c105321.label = 3;
        objExecute = kg3Var2.a1(xfaVarM56214a2, c105321);
        if (objExecute == objM51918f) {
        }
        yfa yfaVar22 = (yfa) objExecute;
        List<t4j> listM57755a22 = yfaVar22.m57755a();
        ArrayList arrayList22 = new ArrayList(dh3.m23088v(listM57755a22, 10));
        while (r7.hasNext()) {
        }
        return new AWSCognitoAuthListWebAuthnCredentialsResult(arrayList22, yfaVar22.m57756b());
    }
}
