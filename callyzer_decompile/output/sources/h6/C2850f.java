package h6;

import android.os.Bundle;
import c9.C0910e;
import com.sun.mail.imap.IMAPStore;
import kotlin.jvm.internal.AbstractC4154l;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.f */
/* loaded from: classes.dex */
public final class C2850f extends AbstractC2846b {

    /* renamed from: d */
    public final String f15860d;

    public C2850f(String requestJson) throws JSONException {
        AbstractC4154l.m8923f(requestJson, "requestJson");
        try {
            JSONObject jSONObject = new JSONObject(requestJson).getJSONObject("user");
            String userName = jSONObject.getString(IMAPStore.ID_NAME);
            String string = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
            AbstractC4154l.m8922e(userName, "userName");
            C0910e c0910e = new C0910e(userName, string);
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            super(bundle, bundle2, c0910e);
            this.f15860d = requestJson;
            if (requestJson.length() != 0) {
                try {
                    new JSONObject(requestJson);
                    return;
                } catch (Exception unused) {
                }
            }
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        } catch (Exception unused2) {
            throw new IllegalArgumentException("user.name must be defined in requestJson");
        }
    }
}
