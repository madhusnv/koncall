package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.PropertiesDeltasObject;
import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.backend.SubscriptionObject;
import java.util.List;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public final class UserBackendService implements IUserBackendService {
    private final IHttpClient _httpClient;

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.UserBackendService", m36648f = "UserBackendService.kt", m36649l = {um5.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m36650m = "createUser")
    /* renamed from: com.onesignal.user.internal.backend.impl.UserBackendService$createUser$1 */
    public static final class C118601 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118601(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserBackendService.this.createUser(null, null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.UserBackendService", m36648f = "UserBackendService.kt", m36649l = {Opcodes.DUP2_X2}, m36650m = "getUser")
    /* renamed from: com.onesignal.user.internal.backend.impl.UserBackendService$getUser$1 */
    public static final class C118611 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118611(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserBackendService.this.getUser(null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.UserBackendService", m36648f = "UserBackendService.kt", m36649l = {TypeReference.CAST}, m36650m = "updateUser")
    /* renamed from: com.onesignal.user.internal.backend.impl.UserBackendService$updateUser$1 */
    public static final class C118621 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118621(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserBackendService.this.updateUser(null, null, null, null, false, null, this);
        }
    }

    public UserBackendService(IHttpClient iHttpClient) {
        sq8.m48649h(iHttpClient, "_httpClient");
        this._httpClient = iHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.user.internal.backend.IUserBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUser(String str, Map<String, String> map, List<SubscriptionObject> list, Map<String, String> map2, n64 n64Var) throws BackendException, JSONException {
        C118601 c118601;
        if (n64Var instanceof C118601) {
            c118601 = (C118601) n64Var;
            int i = c118601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118601.label = i - Integer.MIN_VALUE;
            } else {
                c118601 = new C118601(n64Var);
            }
        }
        C118601 c1186012 = c118601;
        Object objPost$default = c1186012.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1186012.label;
        if (i2 == 0) {
            wre.m54934b(objPost$default);
            JSONObject jSONObject = new JSONObject();
            if (!map.isEmpty()) {
                jSONObject.put(HTTP.IDENTITY_CODING, JSONObjectExtensionsKt.putMap(new JSONObject(), map));
            }
            if (!list.isEmpty()) {
                jSONObject.put("subscriptions", JSONConverter.INSTANCE.convertToJSON(list));
            }
            if (!map2.isEmpty()) {
                jSONObject.put("properties", JSONObjectExtensionsKt.putMap(new JSONObject(), map2));
            }
            jSONObject.put("refresh_device_metadata", true);
            c1186012.label = 1;
            objPost$default = IHttpClient.DefaultImpls.post$default(this._httpClient, "apps/" + str + "/users", jSONObject, null, c1186012, 4, null);
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
        JSONConverter jSONConverter = JSONConverter.INSTANCE;
        String payload = httpResponse.getPayload();
        sq8.m48646e(payload);
        return jSONConverter.convertToCreateUserResponse(new JSONObject(payload));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.user.internal.backend.IUserBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUser(String str, String str2, String str3, n64 n64Var) throws BackendException {
        C118611 c118611;
        if (n64Var instanceof C118611) {
            c118611 = (C118611) n64Var;
            int i = c118611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118611.label = i - Integer.MIN_VALUE;
            } else {
                c118611 = new C118611(n64Var);
            }
        }
        C118611 c1186112 = c118611;
        Object obj = c1186112.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1186112.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            c1186112.label = 1;
            obj = IHttpClient.DefaultImpls.get$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, null, c1186112, 2, null);
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
        if (httpResponse.isSuccess()) {
            return JSONConverter.INSTANCE.convertToCreateUserResponse(new JSONObject(httpResponse.getPayload()));
        }
        throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.user.internal.backend.IUserBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUser(String str, String str2, String str3, PropertiesObject propertiesObject, boolean z, PropertiesDeltasObject propertiesDeltasObject, n64 n64Var) throws BackendException, JSONException {
        C118621 c118621;
        if (n64Var instanceof C118621) {
            c118621 = (C118621) n64Var;
            int i = c118621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118621.label = i - Integer.MIN_VALUE;
            } else {
                c118621 = new C118621(n64Var);
            }
        }
        Object objPatch$default = c118621.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118621.label;
        if (i2 == 0) {
            wre.m54934b(objPatch$default);
            JSONObject jSONObjectPut = new JSONObject().put("refresh_device_metadata", z);
            if (propertiesObject.getHasAtLeastOnePropertySet()) {
                jSONObjectPut.put("properties", JSONConverter.INSTANCE.convertToJSON(propertiesObject));
            }
            if (propertiesDeltasObject.getHasAtLeastOnePropertySet()) {
                jSONObjectPut.put("deltas", JSONConverter.INSTANCE.convertToJSON(propertiesDeltasObject));
            }
            sq8.m48648g(jSONObjectPut, "jsonObject");
            c118621.label = 1;
            objPatch$default = IHttpClient.DefaultImpls.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, jSONObjectPut, null, c118621, 4, null);
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
