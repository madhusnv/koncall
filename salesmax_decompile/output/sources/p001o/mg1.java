package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class mg1 extends bg1 {

    /* renamed from: g */
    public static final C15310a f35368g = new C15310a(null);

    /* renamed from: e */
    public final String f35369e;

    /* renamed from: f */
    public final byte[] f35370f;

    /* renamed from: o.mg1$a */
    public static final class C15310a {
        public C15310a() {
        }

        public /* synthetic */ C15310a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final mg1 m38961a(Bundle bundle, k32 k32Var) throws yj7 {
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                sq8.m48646e(string);
                return new mg1(string, k32Var, bundle, byteArray);
            } catch (Exception unused) {
                throw new yj7();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg1(String str, k32 k32Var, Bundle bundle, byte[] bArr) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, k32Var);
        sq8.m48649h(str, "requestJson");
        sq8.m48649h(bundle, "candidateQueryData");
        this.f35369e = str;
        this.f35370f = bArr;
        if (!yme.f55707a.m58001a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
        m38960a(bundle, str);
    }

    /* renamed from: a */
    public final void m38960a(Bundle bundle, String str) {
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
    }
}
