package h6;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC4154l;
import org.json.JSONObject;
import rw.C6670t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.u */
/* loaded from: classes.dex */
public final class C2865u extends AbstractC2857m {

    /* renamed from: d */
    public final String f15874d;

    public C2865u(String requestJson) {
        AbstractC4154l.m8923f(requestJson, "requestJson");
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
        bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
        bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        super(bundle, bundle2, C6670t.f31945a);
        this.f15874d = requestJson;
        if (requestJson.length() != 0) {
            try {
                new JSONObject(requestJson);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
