package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import java.util.ArrayList;
import java.util.List;
import p001o.as7;
import p001o.bs7;
import p001o.dh3;
import p001o.kg3;
import p001o.l75;
import p001o.lx0;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes5.dex */
public final class FetchUserAttributesUseCase {
    private final kg3 client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase", m36648f = "FetchUserAttributesUseCase.kt", m36649l = {um5.CC_ENABLE_ARENAS_FIELD_NUMBER, 32, 38}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase$execute$1 */
    public static final class C105291 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105291(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchUserAttributesUseCase.this.execute(this);
        }
    }

    public FetchUserAttributesUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[LOOP:0: B:29:0x009a->B:31:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(n64 n64Var) {
        C105291 c105291;
        FetchUserAttributesUseCase fetchUserAttributesUseCase;
        if (n64Var instanceof C105291) {
            c105291 = (C105291) n64Var;
            int i = c105291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105291.label = i - Integer.MIN_VALUE;
            } else {
                c105291 = new C105291(n64Var);
            }
        }
        Object objExecute = c105291.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105291.label;
        if (i2 == 0) {
            wre.m54934b(objExecute);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105291.L$0 = this;
            c105291.label = 1;
            if (AuthStateMachineKt.requireSignedInState(authStateMachine, c105291) == objM51918f) {
                return objM51918f;
            }
            fetchUserAttributesUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(objExecute);
                    List<lx0> listM19680b = ((bs7) objExecute).m19680b();
                    ArrayList arrayList = new ArrayList(dh3.m23088v(listM19680b, 10));
                    for (lx0 lx0Var : listM19680b) {
                        arrayList.add(new AuthUserAttribute(AuthUserAttributeKey.custom(lx0Var.m38085a()), lx0Var.m38086b()));
                    }
                    return arrayList;
                }
                fetchUserAttributesUseCase = (FetchUserAttributesUseCase) c105291.L$0;
                wre.m54934b(objExecute);
                String accessToken = ((AWSCognitoAuthSession) objExecute).getAccessToken();
                kg3 kg3Var = fetchUserAttributesUseCase.client;
                as7.C12243a c12243a = new as7.C12243a();
                c12243a.m17763c(accessToken);
                as7 as7VarM17761a = c12243a.m17761a();
                c105291.L$0 = null;
                c105291.label = 3;
                objExecute = kg3Var.U1(as7VarM17761a, c105291);
                if (objExecute == objM51918f) {
                    return objM51918f;
                }
                List<lx0> listM19680b2 = ((bs7) objExecute).m19680b();
                ArrayList arrayList2 = new ArrayList(dh3.m23088v(listM19680b2, 10));
                while (r7.hasNext()) {
                }
                return arrayList2;
            }
            fetchUserAttributesUseCase = (FetchUserAttributesUseCase) c105291.L$0;
            wre.m54934b(objExecute);
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase = fetchUserAttributesUseCase.fetchAuthSession;
        c105291.L$0 = fetchUserAttributesUseCase;
        c105291.label = 2;
        objExecute = fetchAuthSessionUseCase.execute(c105291);
        if (objExecute == objM51918f) {
            return objM51918f;
        }
        String accessToken2 = ((AWSCognitoAuthSession) objExecute).getAccessToken();
        kg3 kg3Var2 = fetchUserAttributesUseCase.client;
        as7.C12243a c12243a2 = new as7.C12243a();
        c12243a2.m17763c(accessToken2);
        as7 as7VarM17761a2 = c12243a2.m17761a();
        c105291.L$0 = null;
        c105291.label = 3;
        objExecute = kg3Var2.U1(as7VarM17761a2, c105291);
        if (objExecute == objM51918f) {
        }
        List<lx0> listM19680b22 = ((bs7) objExecute).m19680b();
        ArrayList arrayList22 = new ArrayList(dh3.m23088v(listM19680b22, 10));
        while (r7.hasNext()) {
        }
        return arrayList22;
    }
}
