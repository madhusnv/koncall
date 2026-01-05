package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.ch3;
import p001o.dh3;
import p001o.kg3;
import p001o.l75;
import p001o.lr5;
import p001o.lx0;
import p001o.mea;
import p001o.n64;
import p001o.nea;
import p001o.o64;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes5.dex */
public final class FetchDevicesUseCase {
    private final kg3 client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.FetchDevicesUseCase", m36648f = "FetchDevicesUseCase.kt", m36649l = {30, um5.CC_ENABLE_ARENAS_FIELD_NUMBER, um5.PHP_NAMESPACE_FIELD_NUMBER}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.FetchDevicesUseCase$execute$1 */
    public static final class C105281 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105281(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchDevicesUseCase.this.execute(this);
        }
    }

    public FetchDevicesUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(n64 n64Var) {
        C105281 c105281;
        FetchDevicesUseCase fetchDevicesUseCase;
        List<lr5> listM40419a;
        String strM38086b;
        Object next;
        if (n64Var instanceof C105281) {
            c105281 = (C105281) n64Var;
            int i = c105281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105281.label = i - Integer.MIN_VALUE;
            } else {
                c105281 = new C105281(n64Var);
            }
        }
        Object objExecute = c105281.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105281.label;
        if (i2 == 0) {
            wre.m54934b(objExecute);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105281.L$0 = this;
            c105281.label = 1;
            if (AuthStateMachineKt.requireSignedInState(authStateMachine, c105281) == objM51918f) {
                return objM51918f;
            }
            fetchDevicesUseCase = this;
        } else if (i2 == 1) {
            fetchDevicesUseCase = (FetchDevicesUseCase) c105281.L$0;
            wre.m54934b(objExecute);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objExecute);
                listM40419a = ((nea) objExecute).m40419a();
                if (listM40419a == null) {
                    return ch3.m21246k();
                }
                ArrayList arrayList = new ArrayList(dh3.m23088v(listM40419a, 10));
                for (lr5 lr5Var : listM40419a) {
                    String strM37804b = lr5Var.m37804b();
                    if (strM37804b == null) {
                        strM37804b = "";
                    }
                    List listM37803a = lr5Var.m37803a();
                    if (listM37803a != null) {
                        Iterator it = listM37803a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (sq8.m48644c(((lx0) next).m38085a(), "device_name")) {
                                break;
                            }
                        }
                        lx0 lx0Var = (lx0) next;
                        strM38086b = lx0Var != null ? lx0Var.m38086b() : null;
                    }
                    arrayList.add(AuthDevice.fromId(strM37804b, strM38086b));
                }
                return arrayList;
            }
            fetchDevicesUseCase = (FetchDevicesUseCase) c105281.L$0;
            wre.m54934b(objExecute);
            String accessToken = ((AWSCognitoAuthSession) objExecute).getAccessToken();
            kg3 kg3Var = fetchDevicesUseCase.client;
            mea.C15295a c15295a = new mea.C15295a();
            c15295a.m38829e(accessToken);
            mea meaVarM38825a = c15295a.m38825a();
            c105281.L$0 = null;
            c105281.label = 3;
            objExecute = kg3Var.b0(meaVarM38825a, c105281);
            if (objExecute == objM51918f) {
                return objM51918f;
            }
            listM40419a = ((nea) objExecute).m40419a();
            if (listM40419a == null) {
            }
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase = fetchDevicesUseCase.fetchAuthSession;
        c105281.L$0 = fetchDevicesUseCase;
        c105281.label = 2;
        objExecute = fetchAuthSessionUseCase.execute(c105281);
        if (objExecute == objM51918f) {
            return objM51918f;
        }
        String accessToken2 = ((AWSCognitoAuthSession) objExecute).getAccessToken();
        kg3 kg3Var2 = fetchDevicesUseCase.client;
        mea.C15295a c15295a2 = new mea.C15295a();
        c15295a2.m38829e(accessToken2);
        mea meaVarM38825a2 = c15295a2.m38825a();
        c105281.L$0 = null;
        c105281.label = 3;
        objExecute = kg3Var2.b0(meaVarM38825a2, c105281);
        if (objExecute == objM51918f) {
        }
        listM40419a = ((nea) objExecute).m40419a();
        if (listM40419a == null) {
        }
    }
}
