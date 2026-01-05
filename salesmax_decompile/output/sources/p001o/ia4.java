package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class ia4 extends t94 {

    /* renamed from: e */
    public static final C14228a f28321e = new C14228a(null);

    /* renamed from: d */
    public final String f28322d;

    /* renamed from: o.ia4$a */
    public static final class C14228a {
        public C14228a() {
        }

        public /* synthetic */ C14228a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ia4 m31787a(Bundle bundle) throws yj7 {
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                sq8.m48646e(string);
                return new ia4(string, bundle, null);
            } catch (Exception unused) {
                throw new yj7();
            }
        }
    }

    public /* synthetic */ ia4(String str, Bundle bundle, id5 id5Var) {
        this(str, bundle);
    }

    /* renamed from: a */
    public final String m31786a() {
        return this.f28322d;
    }

    public ia4(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.f28322d = str;
        if (!xme.f53935a.m56484a(str)) {
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON".toString());
        }
    }
}
