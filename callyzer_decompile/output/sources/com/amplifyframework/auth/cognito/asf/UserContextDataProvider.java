package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.util.Base64;
import i9.g0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;
import og.nd;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
    private static final String TAG = "UserContextDataProvider";

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    public UserContextDataProvider(Context context, String poolId, String clientId) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(poolId, "poolId");
        AbstractC4154l.m8923f(clientId, "clientId");
        this.context = context;
        this.poolId = poolId;
        this.clientId = clientId;
        this.timestamp = String.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContextDataAggregator getEncodedContextData$lambda$0(String str) {
        return new ContextDataAggregator(str);
    }

    private final String getEncodedResponse(JSONObject jSONObject) {
        String string = jSONObject.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        byte[] bytes = string.getBytes(AbstractC5163a.f25245a);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        AbstractC4154l.m8922e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    private final JSONObject getJsonPayload(Map<String, String> map, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CONTEXT_DATA, new JSONObject(map));
        jSONObject.put(USERNAME, str);
        jSONObject.put(USER_POOL_ID, str2);
        jSONObject.put(TIMESTAMP_MILLI_SEC, this.timestamp);
        return jSONObject;
    }

    private final JSONObject getJsonResponse(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DATA_PAYLOAD, str);
        jSONObject.put(SIGNATURE, str2);
        jSONObject.put("version", VERSION_VALUE);
        return jSONObject;
    }

    public final String getEncodedContextData(String username, String deviceId) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(deviceId, "deviceId");
        try {
            ContextDataAggregator contextDataAggregator = (ContextDataAggregator) nd.m10782c(new g0(deviceId, 1)).getValue();
            this.aggregator = contextDataAggregator;
            if (contextDataAggregator == null) {
                AbstractC4154l.m8928k("aggregator");
                throw null;
            }
            String string = getJsonPayload(contextDataAggregator.getAggregatedData(this.context), username, this.poolId).toString();
            AbstractC4154l.m8922e(string, "toString(...)");
            return getEncodedResponse(getJsonResponse(string, SignatureGenerator.Companion.getSignature(string, this.clientId, VERSION_VALUE)));
        } catch (Exception unused) {
            return null;
        }
    }
}
