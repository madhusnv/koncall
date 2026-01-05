package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSessionKt;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.kg3;
import p001o.l75;
import p001o.mti;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class ConfirmUserAttributeUseCase {
    private final kg3 client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.ConfirmUserAttributeUseCase", m36648f = "ConfirmUserAttributeUseCase.kt", m36649l = {um5.CC_ENABLE_ARENAS_FIELD_NUMBER, 33, SignatureVisitor.EXTENDS}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ConfirmUserAttributeUseCase$execute$1 */
    public static final class C105251 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C105251(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmUserAttributeUseCase.this.execute(null, null, this);
        }
    }

    public ConfirmUserAttributeUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(AuthUserAttributeKey authUserAttributeKey, String str, n64 n64Var) {
        C105251 c105251;
        ConfirmUserAttributeUseCase confirmUserAttributeUseCase;
        AuthUserAttributeKey authUserAttributeKey2;
        String str2;
        kg3 kg3Var;
        mti mtiVarM39683a;
        if (n64Var instanceof C105251) {
            c105251 = (C105251) n64Var;
            int i = c105251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105251.label = i - Integer.MIN_VALUE;
            } else {
                c105251 = new C105251(n64Var);
            }
        }
        Object objExecute = c105251.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105251.label;
        if (i2 == 0) {
            wre.m54934b(objExecute);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105251.L$0 = this;
            c105251.L$1 = authUserAttributeKey;
            c105251.L$2 = str;
            c105251.label = 1;
            if (AuthStateMachineKt.requireSignedInState(authStateMachine, c105251) == objM51918f) {
                return objM51918f;
            }
            confirmUserAttributeUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(objExecute);
                    return y3i.f54824a;
                }
                str2 = (String) c105251.L$2;
                authUserAttributeKey2 = (AuthUserAttributeKey) c105251.L$1;
                confirmUserAttributeUseCase = (ConfirmUserAttributeUseCase) c105251.L$0;
                wre.m54934b(objExecute);
                String strRequireAccessToken = AWSCognitoAuthSessionKt.requireAccessToken((AWSCognitoAuthSession) objExecute);
                kg3Var = confirmUserAttributeUseCase.client;
                mti.C15431a c15431a = new mti.C15431a();
                c15431a.m39687e(strRequireAccessToken);
                c15431a.m39688f(authUserAttributeKey2.getKeyString());
                c15431a.m39689g(str2);
                mtiVarM39683a = c15431a.m39683a();
                c105251.L$0 = null;
                c105251.L$1 = null;
                c105251.L$2 = null;
                c105251.label = 3;
                if (kg3Var.mo35645L(mtiVarM39683a, c105251) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            str = (String) c105251.L$2;
            authUserAttributeKey = (AuthUserAttributeKey) c105251.L$1;
            confirmUserAttributeUseCase = (ConfirmUserAttributeUseCase) c105251.L$0;
            wre.m54934b(objExecute);
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase = confirmUserAttributeUseCase.fetchAuthSession;
        c105251.L$0 = confirmUserAttributeUseCase;
        c105251.L$1 = authUserAttributeKey;
        c105251.L$2 = str;
        c105251.label = 2;
        objExecute = fetchAuthSessionUseCase.execute(c105251);
        if (objExecute == objM51918f) {
            return objM51918f;
        }
        String str3 = str;
        authUserAttributeKey2 = authUserAttributeKey;
        str2 = str3;
        String strRequireAccessToken2 = AWSCognitoAuthSessionKt.requireAccessToken((AWSCognitoAuthSession) objExecute);
        kg3Var = confirmUserAttributeUseCase.client;
        mti.C15431a c15431a2 = new mti.C15431a();
        c15431a2.m39687e(strRequireAccessToken2);
        c15431a2.m39688f(authUserAttributeKey2.getKeyString());
        c15431a2.m39689g(str2);
        mtiVarM39683a = c15431a2.m39683a();
        c105251.L$0 = null;
        c105251.L$1 = null;
        c105251.L$2 = null;
        c105251.label = 3;
        if (kg3Var.mo35645L(mtiVarM39683a, c105251) == objM51918f) {
        }
        return y3i.f54824a;
    }
}
