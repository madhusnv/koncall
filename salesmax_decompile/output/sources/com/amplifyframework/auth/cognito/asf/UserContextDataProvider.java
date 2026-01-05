package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.util.Base64;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.kf9;
import p001o.sh2;
import p001o.si9;
import p001o.sq8;
import p001o.uk7;

/* loaded from: classes5.dex */
public final class UserContextDataProvider {
    private static final String CONTEXT_DATA = "contextData";
    private static final String DATA_PAYLOAD = "payload";
    private static final String SIGNATURE = "signature";
    private static final String TIMESTAMP_MILLI_SEC = "timestamp";
    private static final String USERNAME = "username";
    private static final String USER_POOL_ID = "userPoolId";
    private static final String VERSION_KEY = "version";
    private static final String VERSION_VALUE = "ANDROID20171114";
    private ContextDataAggregator aggregator;
    private final String clientId;
    private final Context context;
    private final String poolId;
    private final String timestamp;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = UserContextDataProvider.class.getSimpleName();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.asf.UserContextDataProvider$getEncodedContextData$1 */
    public static final class C105191 extends kf9 implements uk7 {
        final /* synthetic */ String $deviceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105191(String str) {
            super(0);
            this.$deviceId = str;
        }

        @Override // p001o.uk7
        public final ContextDataAggregator invoke() {
            return new ContextDataAggregator(this.$deviceId);
        }
    }

    public UserContextDataProvider(Context context, String str, String str2) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "poolId");
        sq8.m48649h(str2, "clientId");
        this.context = context;
        this.poolId = str;
        this.clientId = str2;
        this.timestamp = String.valueOf(System.currentTimeMillis());
    }

    private final String getEncodedResponse(JSONObject jSONObject) {
        String string = jSONObject.toString();
        sq8.m48648g(string, "toString(...)");
        byte[] bytes = string.getBytes(sh2.f45422b);
        sq8.m48648g(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        sq8.m48648g(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    private final JSONObject getJsonPayload(Map<String, String> map, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CONTEXT_DATA, new JSONObject(map));
        jSONObject.put(USERNAME, str);
        jSONObject.put(USER_POOL_ID, str2);
        jSONObject.put("timestamp", this.timestamp);
        return jSONObject;
    }

    private final JSONObject getJsonResponse(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DATA_PAYLOAD, str);
        jSONObject.put(SIGNATURE, str2);
        jSONObject.put("version", VERSION_VALUE);
        return jSONObject;
    }

    public final String getEncodedContextData(String str, String str2) {
        sq8.m48649h(str, USERNAME);
        sq8.m48649h(str2, "deviceId");
        try {
            ContextDataAggregator contextDataAggregator = (ContextDataAggregator) si9.m48360a(new C105191(str2)).getValue();
            this.aggregator = contextDataAggregator;
            if (contextDataAggregator == null) {
                sq8.m48667z("aggregator");
                contextDataAggregator = null;
            }
            String string = getJsonPayload(contextDataAggregator.getAggregatedData(this.context), str, this.poolId).toString();
            sq8.m48648g(string, "toString(...)");
            return getEncodedResponse(getJsonResponse(string, SignatureGenerator.Companion.getSignature(string, this.clientId, VERSION_VALUE)));
        } catch (Exception unused) {
            return null;
        }
    }
}
