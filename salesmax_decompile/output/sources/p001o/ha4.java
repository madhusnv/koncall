package p001o;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.s94;

/* loaded from: classes2.dex */
public final class ha4 extends s94 {

    /* renamed from: l */
    public static final C13898a f26470l = new C13898a(null);

    /* renamed from: j */
    public final String f26471j;

    /* renamed from: k */
    public final byte[] f26472k;

    /* renamed from: o.ha4$a */
    public static final class C13898a {
        public C13898a() {
        }

        public /* synthetic */ C13898a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ s94.C16788b m30033b(C13898a c13898a, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return c13898a.m30034a(str, str2);
        }

        /* renamed from: a */
        public final s94.C16788b m30034a(String str, String str2) throws JSONException {
            sq8.m48649h(str, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("user");
                String string = jSONObject.getString("name");
                String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                sq8.m48648g(string, "userName");
                return new s94.C16788b(string, string2, null, str2);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        /* renamed from: c */
        public final Bundle m30035c(String str, byte[] bArr) {
            sq8.m48649h(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        /* renamed from: d */
        public final Bundle m30036d(String str, byte[] bArr) {
            sq8.m48649h(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }
    }

    public /* synthetic */ ha4(String str, byte[] bArr, boolean z, boolean z2, s94.C16788b c16788b, String str2, Bundle bundle, Bundle bundle2, int i, id5 id5Var) {
        this(str, bArr, z, z2, c16788b, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? f26470l.m30036d(str, bArr) : bundle, (i & 128) != 0 ? f26470l.m30035c(str, bArr) : bundle2);
    }

    public ha4(String str, byte[] bArr, boolean z, boolean z2, s94.C16788b c16788b, String str2, Bundle bundle, Bundle bundle2) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, z, c16788b, str2, z2);
        this.f26471j = str;
        this.f26472k = bArr;
        if (!xme.f53935a.m56484a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
    }

    public /* synthetic */ ha4(String str, byte[] bArr, boolean z, String str2, boolean z2, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ha4(String str, byte[] bArr, boolean z, String str2, boolean z2) {
        this(str, bArr, z2, z, C13898a.m30033b(f26470l, str, null, 2, null), str2, null, null, Opcodes.CHECKCAST, null);
        sq8.m48649h(str, "requestJson");
    }
}
