package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class e3e extends za4 {

    /* renamed from: e */
    public static final C13098a f20934e = new C13098a(null);

    /* renamed from: d */
    public final String f20935d;

    /* renamed from: o.e3e$a */
    public static final class C13098a {
        public C13098a() {
        }

        public /* synthetic */ C13098a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final e3e m24257a(Bundle bundle) throws yj7 {
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                sq8.m48646e(string);
                return new e3e(string, bundle, null);
            } catch (Exception unused) {
                throw new yj7();
            }
        }
    }

    public /* synthetic */ e3e(String str, Bundle bundle, id5 id5Var) {
        this(str, bundle);
    }

    /* renamed from: a */
    public final String m24256a() {
        return this.f20935d;
    }

    public e3e(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.f20935d = str;
        if (!xme.f53935a.m56484a(str)) {
            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON".toString());
        }
    }
}
