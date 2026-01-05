package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSessionKt;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributeOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.result.AuthUpdateAttributeResult;
import com.amplifyframework.auth.result.step.AuthNextUpdateAttributeStep;
import com.amplifyframework.auth.result.step.AuthUpdateAttributeStep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.bh3;
import p001o.dh3;
import p001o.hsa;
import p001o.kg3;
import p001o.kh3;
import p001o.l75;
import p001o.lx0;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.v6i;
import p001o.w6i;
import p001o.wre;
import p001o.ze3;

/* loaded from: classes5.dex */
public final class UpdateUserAttributesUseCase {
    private final kg3 client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase", m36648f = "UpdateUserAttributesUseCase.kt", m36649l = {55}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase$execute$2 */
    public static final class C105382 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C105382(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdateUserAttributesUseCase.this.execute((AuthUserAttribute) null, (AuthUpdateUserAttributeOptions) null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase", m36648f = "UpdateUserAttributesUseCase.kt", m36649l = {63, 65, Opcodes.LREM}, m36650m = "updateAttributes")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase$updateAttributes$1 */
    public static final class C105391 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C105391(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdateUserAttributesUseCase.this.updateAttributes(null, null, this);
        }
    }

    public UpdateUserAttributesUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
    }

    public static /* synthetic */ Object execute$default(UpdateUserAttributesUseCase updateUserAttributesUseCase, List list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, n64 n64Var, int i, Object obj) {
        if ((i & 2) != 0) {
            authUpdateUserAttributesOptions = AuthUpdateUserAttributesOptions.defaults();
            sq8.m48648g(authUpdateUserAttributesOptions, "defaults(...)");
        }
        return updateUserAttributesUseCase.execute((List<AuthUserAttribute>) list, authUpdateUserAttributesOptions, n64Var);
    }

    private final Map<AuthUserAttributeKey, AuthUpdateAttributeResult> mapResults(w6i w6iVar, List<AuthUserAttribute> list) {
        Map mapM31053c = hsa.m31053c();
        List<ze3> listM54009a = w6iVar.m54009a();
        if (listM54009a != null) {
            for (ze3 ze3Var : listM54009a) {
                String strM59323a = ze3Var.m59323a();
                if (strM59323a != null) {
                    AuthUserAttributeKey authUserAttributeKeyCustom = AuthUserAttributeKey.custom(strM59323a);
                    AuthUpdateAttributeResult authUpdateAttributeResult = new AuthUpdateAttributeResult(false, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.CONFIRM_ATTRIBUTE_WITH_CODE, new HashMap(), ResetPasswordUseCaseKt.toAuthCodeDeliveryDetails(ze3Var)));
                    sq8.m48646e(authUserAttributeKeyCustom);
                    mapM31053c.put(authUserAttributeKeyCustom, authUpdateAttributeResult);
                }
            }
        }
        AuthUpdateAttributeResult authUpdateAttributeResult2 = new AuthUpdateAttributeResult(true, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.DONE, new HashMap(), null));
        for (AuthUserAttribute authUserAttribute : list) {
            if (!mapM31053c.containsKey(authUserAttribute.getKey())) {
                AuthUserAttributeKey key = authUserAttribute.getKey();
                sq8.m48648g(key, "getKey(...)");
                mapM31053c.put(key, authUpdateAttributeResult2);
            }
        }
        return hsa.m31052b(mapM31053c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2 A[LOOP:0: B:27:0x00ac->B:29:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateAttributes(List<AuthUserAttribute> list, Map<String, String> map, n64 n64Var) {
        C105391 c105391;
        UpdateUserAttributesUseCase updateUserAttributesUseCase;
        List<AuthUserAttribute> list2;
        Map<String, String> map2;
        Iterator<T> it;
        List<AuthUserAttribute> list3;
        UpdateUserAttributesUseCase updateUserAttributesUseCase2;
        if (n64Var instanceof C105391) {
            c105391 = (C105391) n64Var;
            int i = c105391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105391.label = i - Integer.MIN_VALUE;
            } else {
                c105391 = new C105391(n64Var);
            }
        }
        Object objExecute = c105391.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105391.label;
        if (i2 == 0) {
            wre.m54934b(objExecute);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105391.L$0 = this;
            c105391.L$1 = list;
            c105391.L$2 = map;
            c105391.label = 1;
            if (AuthStateMachineKt.requireSignedInState(authStateMachine, c105391) == objM51918f) {
                return objM51918f;
            }
            updateUserAttributesUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) c105391.L$1;
                    updateUserAttributesUseCase2 = (UpdateUserAttributesUseCase) c105391.L$0;
                    wre.m54934b(objExecute);
                    return updateUserAttributesUseCase2.mapResults((w6i) objExecute, list3);
                }
                map2 = (Map) c105391.L$2;
                list2 = (List) c105391.L$1;
                updateUserAttributesUseCase = (UpdateUserAttributesUseCase) c105391.L$0;
                wre.m54934b(objExecute);
                String strRequireAccessToken = AWSCognitoAuthSessionKt.requireAccessToken((AWSCognitoAuthSession) objExecute);
                kg3 kg3Var = updateUserAttributesUseCase.client;
                v6i.C17517a c17517a = new v6i.C17517a();
                c17517a.m52370e(strRequireAccessToken);
                c17517a.m52371f(map2);
                ArrayList arrayList = new ArrayList(dh3.m23088v(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(lx0.f34484c.m38093a(new UpdateUserAttributesUseCase$updateAttributes$response$1$1$1((AuthUserAttribute) it.next())));
                }
                c17517a.m52372g(arrayList);
                v6i v6iVarM52366a = c17517a.m52366a();
                c105391.L$0 = updateUserAttributesUseCase;
                c105391.L$1 = list2;
                c105391.L$2 = null;
                c105391.label = 3;
                objExecute = kg3Var.mo35648V(v6iVarM52366a, c105391);
                if (objExecute != objM51918f) {
                    return objM51918f;
                }
                list3 = list2;
                updateUserAttributesUseCase2 = updateUserAttributesUseCase;
                return updateUserAttributesUseCase2.mapResults((w6i) objExecute, list3);
            }
            map = (Map) c105391.L$2;
            list = (List) c105391.L$1;
            updateUserAttributesUseCase = (UpdateUserAttributesUseCase) c105391.L$0;
            wre.m54934b(objExecute);
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase = updateUserAttributesUseCase.fetchAuthSession;
        c105391.L$0 = updateUserAttributesUseCase;
        c105391.L$1 = list;
        c105391.L$2 = map;
        c105391.label = 2;
        objExecute = fetchAuthSessionUseCase.execute(c105391);
        if (objExecute == objM51918f) {
            return objM51918f;
        }
        Map<String, String> map3 = map;
        list2 = list;
        map2 = map3;
        String strRequireAccessToken2 = AWSCognitoAuthSessionKt.requireAccessToken((AWSCognitoAuthSession) objExecute);
        kg3 kg3Var2 = updateUserAttributesUseCase.client;
        v6i.C17517a c17517a2 = new v6i.C17517a();
        c17517a2.m52370e(strRequireAccessToken2);
        c17517a2.m52371f(map2);
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        c17517a2.m52372g(arrayList2);
        v6i v6iVarM52366a2 = c17517a2.m52366a();
        c105391.L$0 = updateUserAttributesUseCase;
        c105391.L$1 = list2;
        c105391.L$2 = null;
        c105391.label = 3;
        objExecute = kg3Var2.mo35648V(v6iVarM52366a2, c105391);
        if (objExecute != objM51918f) {
        }
    }

    public final Object execute(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, n64 n64Var) {
        AWSCognitoAuthUpdateUserAttributesOptions aWSCognitoAuthUpdateUserAttributesOptions = authUpdateUserAttributesOptions instanceof AWSCognitoAuthUpdateUserAttributesOptions ? (AWSCognitoAuthUpdateUserAttributesOptions) authUpdateUserAttributesOptions : null;
        return updateAttributes(list, aWSCognitoAuthUpdateUserAttributesOptions != null ? aWSCognitoAuthUpdateUserAttributesOptions.getMetadata() : null, n64Var);
    }

    public static /* synthetic */ Object execute$default(UpdateUserAttributesUseCase updateUserAttributesUseCase, AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, n64 n64Var, int i, Object obj) {
        if ((i & 2) != 0) {
            authUpdateUserAttributeOptions = AuthUpdateUserAttributeOptions.defaults();
            sq8.m48648g(authUpdateUserAttributeOptions, "defaults(...)");
        }
        return updateUserAttributesUseCase.execute(authUserAttribute, authUpdateUserAttributeOptions, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, n64 n64Var) {
        C105382 c105382;
        if (n64Var instanceof C105382) {
            c105382 = (C105382) n64Var;
            int i = c105382.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105382.label = i - Integer.MIN_VALUE;
            } else {
                c105382 = new C105382(n64Var);
            }
        }
        Object objUpdateAttributes = c105382.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105382.label;
        if (i2 == 0) {
            wre.m54934b(objUpdateAttributes);
            AWSCognitoAuthUpdateUserAttributeOptions aWSCognitoAuthUpdateUserAttributeOptions = authUpdateUserAttributeOptions instanceof AWSCognitoAuthUpdateUserAttributeOptions ? (AWSCognitoAuthUpdateUserAttributeOptions) authUpdateUserAttributeOptions : null;
            Map<String, String> metadata = aWSCognitoAuthUpdateUserAttributeOptions != null ? aWSCognitoAuthUpdateUserAttributeOptions.getMetadata() : null;
            List<AuthUserAttribute> listM18963e = bh3.m18963e(authUserAttribute);
            c105382.label = 1;
            objUpdateAttributes = updateAttributes(listM18963e, metadata, c105382);
            if (objUpdateAttributes == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objUpdateAttributes);
        }
        return kh3.e0(((Map) objUpdateAttributes).values());
    }
}
