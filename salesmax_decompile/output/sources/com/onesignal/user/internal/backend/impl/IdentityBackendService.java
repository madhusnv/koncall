package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.user.internal.backend.IIdentityBackendService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.hsa;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class IdentityBackendService implements IIdentityBackendService {
    private final IHttpClient _httpClient;

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.IdentityBackendService", m36648f = "IdentityBackendService.kt", m36649l = {40}, m36650m = "deleteAlias")
    /* renamed from: com.onesignal.user.internal.backend.impl.IdentityBackendService$deleteAlias$1 */
    public static final class C118521 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118521(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdentityBackendService.this.deleteAlias(null, null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.user.internal.backend.impl.IdentityBackendService", m36648f = "IdentityBackendService.kt", m36649l = {23}, m36650m = "setAlias")
    /* renamed from: com.onesignal.user.internal.backend.impl.IdentityBackendService$setAlias$1 */
    public static final class C118531 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118531(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdentityBackendService.this.setAlias(null, null, null, null, this);
        }
    }

    public IdentityBackendService(IHttpClient iHttpClient) {
        sq8.m48649h(iHttpClient, "_httpClient");
        this._httpClient = iHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.user.internal.backend.IIdentityBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAlias(String str, String str2, String str3, String str4, n64 n64Var) throws BackendException {
        C118521 c118521;
        if (n64Var instanceof C118521) {
            c118521 = (C118521) n64Var;
            int i = c118521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118521.label = i - Integer.MIN_VALUE;
            } else {
                c118521 = new C118521(n64Var);
            }
        }
        C118521 c1185212 = c118521;
        Object objDelete$default = c1185212.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1185212.label;
        if (i2 == 0) {
            wre.m54934b(objDelete$default);
            c1185212.label = 1;
            objDelete$default = IHttpClient.DefaultImpls.delete$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity/" + str4, null, c1185212, 2, null);
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
    @Override // com.onesignal.user.internal.backend.IIdentityBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, n64 n64Var) throws BackendException, JSONException {
        C118531 c118531;
        if (n64Var instanceof C118531) {
            c118531 = (C118531) n64Var;
            int i = c118531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118531.label = i - Integer.MIN_VALUE;
            } else {
                c118531 = new C118531(n64Var);
            }
        }
        C118531 c1185312 = c118531;
        Object objPatch$default = c1185312.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1185312.label;
        if (i2 == 0) {
            wre.m54934b(objPatch$default);
            JSONObject jSONObjectPut = new JSONObject().put(HTTP.IDENTITY_CODING, JSONObjectExtensionsKt.putMap(new JSONObject(), map));
            sq8.m48648g(jSONObjectPut, "requestJSONObject");
            c1185312.label = 1;
            objPatch$default = IHttpClient.DefaultImpls.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", jSONObjectPut, null, c1185312, 4, null);
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
        sq8.m48646e(payload);
        JSONObject jSONObject = new JSONObject(payload).getJSONObject(HTTP.IDENTITY_CODING);
        sq8.m48648g(jSONObject, "responseJSON.getJSONObject(\"identity\")");
        Map<String, Object> map2 = JSONObjectExtensionsKt.toMap(jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }
}
