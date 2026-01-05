package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.ISubscriptionBackendService;
import com.onesignal.user.internal.backend.SubscriptionObject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.hsa;
import p001o.hwc;
import p001o.isa;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class SubscriptionBackendService implements ISubscriptionBackendService {
    private final IHttpClient _httpClient;

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", m36648f = "SubscriptionBackendService.kt", m36649l = {27}, m36650m = "createSubscription")
    /* renamed from: com.onesignal.user.internal.backend.impl.SubscriptionBackendService$createSubscription$1 */
    public static final class C118551 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118551(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionBackendService.this.createSubscription(null, null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", m36648f = "SubscriptionBackendService.kt", m36649l = {Opcodes.FASTORE}, m36650m = "deleteSubscription")
    /* renamed from: com.onesignal.user.internal.backend.impl.SubscriptionBackendService$deleteSubscription$1 */
    public static final class C118561 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118561(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionBackendService.this.deleteSubscription(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", m36648f = "SubscriptionBackendService.kt", m36649l = {Opcodes.LDIV}, m36650m = "getIdentityFromSubscription")
    /* renamed from: com.onesignal.user.internal.backend.impl.SubscriptionBackendService$getIdentityFromSubscription$1 */
    public static final class C118571 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118571(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionBackendService.this.getIdentityFromSubscription(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", m36648f = "SubscriptionBackendService.kt", m36649l = {Opcodes.FADD}, m36650m = "transferSubscription")
    /* renamed from: com.onesignal.user.internal.backend.impl.SubscriptionBackendService$transferSubscription$1 */
    public static final class C118581 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118581(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionBackendService.this.transferSubscription(null, null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", m36648f = "SubscriptionBackendService.kt", m36649l = {Opcodes.V15}, m36650m = "updateSubscription")
    /* renamed from: com.onesignal.user.internal.backend.impl.SubscriptionBackendService$updateSubscription$1 */
    public static final class C118591 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118591(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubscriptionBackendService.this.updateSubscription(null, null, null, this);
        }
    }

    public SubscriptionBackendService(IHttpClient iHttpClient) {
        sq8.m48649h(iHttpClient, "_httpClient");
        this._httpClient = iHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSubscription(String str, String str2, String str3, SubscriptionObject subscriptionObject, n64 n64Var) throws BackendException, JSONException {
        C118551 c118551;
        if (n64Var instanceof C118551) {
            c118551 = (C118551) n64Var;
            int i = c118551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118551.label = i - Integer.MIN_VALUE;
            } else {
                c118551 = new C118551(n64Var);
            }
        }
        C118551 c1185512 = c118551;
        Object objPost$default = c1185512.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1185512.label;
        if (i2 == 0) {
            wre.m54934b(objPost$default);
            JSONObject jSONObjectConvertToJSON = JSONConverter.INSTANCE.convertToJSON(subscriptionObject);
            jSONObjectConvertToJSON.remove(OutcomeConstants.OUTCOME_ID);
            JSONObject jSONObjectPut = new JSONObject().put("subscription", jSONObjectConvertToJSON);
            sq8.m48648g(jSONObjectPut, "requestJSON");
            c1185512.label = 1;
            objPost$default = IHttpClient.DefaultImpls.post$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", jSONObjectPut, null, c1185512, 4, null);
            if (objPost$default == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objPost$default);
        }
        HttpResponse httpResponse = (HttpResponse) objPost$default;
        if (!httpResponse.isSuccess()) {
            throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
        }
        String payload = httpResponse.getPayload();
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        JSONObject jSONObjectSafeJSONObject = jSONObject != null ? JSONObjectExtensionsKt.safeJSONObject(jSONObject, "subscription") : null;
        if (jSONObjectSafeJSONObject == null || !jSONObjectSafeJSONObject.has(OutcomeConstants.OUTCOME_ID)) {
            return null;
        }
        String strSafeString = JSONObjectExtensionsKt.safeString(jSONObject, "ryw_token");
        return new hwc(jSONObjectSafeJSONObject.getString(OutcomeConstants.OUTCOME_ID), strSafeString != null ? new RywData(strSafeString, JSONObjectExtensionsKt.safeLong(jSONObject, "ryw_delay")) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSubscription(String str, String str2, n64 n64Var) throws BackendException {
        C118561 c118561;
        if (n64Var instanceof C118561) {
            c118561 = (C118561) n64Var;
            int i = c118561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118561.label = i - Integer.MIN_VALUE;
            } else {
                c118561 = new C118561(n64Var);
            }
        }
        C118561 c1185612 = c118561;
        Object objDelete$default = c1185612.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1185612.label;
        if (i2 == 0) {
            wre.m54934b(objDelete$default);
            c1185612.label = 1;
            objDelete$default = IHttpClient.DefaultImpls.delete$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2, null, c1185612, 2, null);
            if (objDelete$default == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objDelete$default);
        }
        HttpResponse httpResponse = (HttpResponse) objDelete$default;
        if (httpResponse.isSuccess()) {
            return y3i.f54824a;
        }
        throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIdentityFromSubscription(String str, String str2, n64 n64Var) throws BackendException {
        C118571 c118571;
        Map<String, Object> map;
        if (n64Var instanceof C118571) {
            c118571 = (C118571) n64Var;
            int i = c118571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118571.label = i - Integer.MIN_VALUE;
            } else {
                c118571 = new C118571(n64Var);
            }
        }
        C118571 c1185712 = c118571;
        Object obj = c1185712.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1185712.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            c1185712.label = 1;
            obj = IHttpClient.DefaultImpls.get$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/user/identity", null, c1185712, 2, null);
            if (obj == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (!httpResponse.isSuccess()) {
            throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
        }
        String payload = httpResponse.getPayload();
        sq8.m48646e(payload);
        JSONObject jSONObjectSafeJSONObject = JSONObjectExtensionsKt.safeJSONObject(new JSONObject(payload), HTTP.IDENTITY_CODING);
        if (jSONObjectSafeJSONObject == null || (map = JSONObjectExtensionsKt.toMap(jSONObjectSafeJSONObject)) == null) {
            return isa.m32681h();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transferSubscription(String str, String str2, String str3, String str4, n64 n64Var) throws BackendException, JSONException {
        C118581 c118581;
        if (n64Var instanceof C118581) {
            c118581 = (C118581) n64Var;
            int i = c118581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118581.label = i - Integer.MIN_VALUE;
            } else {
                c118581 = new C118581(n64Var);
            }
        }
        C118581 c1185812 = c118581;
        Object objPatch$default = c1185812.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1185812.label;
        if (i2 == 0) {
            wre.m54934b(objPatch$default);
            JSONObject jSONObjectPut = new JSONObject().put(HTTP.IDENTITY_CODING, new JSONObject().put(str3, str4));
            sq8.m48648g(jSONObjectPut, "requestJSON");
            c1185812.label = 1;
            objPatch$default = IHttpClient.DefaultImpls.patch$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/owner", jSONObjectPut, null, c1185812, 4, null);
            if (objPatch$default == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objPatch$default);
        }
        HttpResponse httpResponse = (HttpResponse) objPatch$default;
        if (httpResponse.isSuccess()) {
            return y3i.f54824a;
        }
        throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.user.internal.backend.ISubscriptionBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSubscription(String str, String str2, SubscriptionObject subscriptionObject, n64 n64Var) throws BackendException, JSONException {
        C118591 c118591;
        if (n64Var instanceof C118591) {
            c118591 = (C118591) n64Var;
            int i = c118591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118591.label = i - Integer.MIN_VALUE;
            } else {
                c118591 = new C118591(n64Var);
            }
        }
        C118591 c1185912 = c118591;
        Object objPatch$default = c1185912.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1185912.label;
        if (i2 == 0) {
            wre.m54934b(objPatch$default);
            JSONObject jSONObjectPut = new JSONObject().put("subscription", JSONConverter.INSTANCE.convertToJSON(subscriptionObject));
            sq8.m48648g(jSONObjectPut, "requestJSON");
            c1185912.label = 1;
            objPatch$default = IHttpClient.DefaultImpls.patch$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2, jSONObjectPut, null, c1185912, 4, null);
            if (objPatch$default == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objPatch$default);
        }
        HttpResponse httpResponse = (HttpResponse) objPatch$default;
        if (!httpResponse.isSuccess()) {
            throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
        }
        String payload = httpResponse.getPayload();
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        String strSafeString = jSONObject != null ? JSONObjectExtensionsKt.safeString(jSONObject, "ryw_token") : null;
        Long lSafeLong = jSONObject != null ? JSONObjectExtensionsKt.safeLong(jSONObject, "ryw_delay") : null;
        if (strSafeString != null) {
            return new RywData(strSafeString, lSafeLong);
        }
        return null;
    }
}
